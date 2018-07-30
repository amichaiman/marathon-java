package gui_threads_plus_buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel implements ActionListener, Runnable {
    private JFrame frame;
    private JPanel bottomPanel;
    private JButton button;
    private JLabel time;


    public MyPanel() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                init();
            }
        });
    }

    private void init() {
        frame = new JFrame();
        bottomPanel = new JPanel();
        button = new JButton();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(500,500);

        button.setText("click if you're brave");
        button.addActionListener(this);

        bottomPanel.add(button);

        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        button.setVisible(false);
        time = new JLabel("0");
        bottomPanel.add(time);
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (int i=1; i<=10; i++){
            time.setText(Integer.toString(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        time.setText("pretty sweet huh");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
