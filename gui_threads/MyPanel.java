package gui_threads;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{
    JFrame frame;

    public MyPanel() {
        /*  everything that effects GUI must happen on a single thread.
        *   invokeLater adds the newly created thread to the EDT (Event
        *   Dispatch Thread) queue and will be executed when its it's turn.
        *   for more information: https://stackoverflow.com/questions/5499921/invokeandwait-method-in-swingutilities*/
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                init();
            }
        });
    }

    private void init() {
        frame = new JFrame("my panel");

        /*  since no layout was defined, our panel catches the whole frame  */
        frame.add(this);

        /*  stop program when closing window    */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500,500);
        frame.setVisible(true);
    }

    /*  this method is called when frame is first shown on screen
    *   ,each time the screen changes it's size and when explicitly called
    *   using the method repaint   */
    @Override
    protected void paintComponent(Graphics graphics) {
        int[] x = {0 ,frame.getWidth()/2, frame.getWidth(), frame.getWidth()/2};
        int[] y = {frame.getHeight()/2,0, frame.getHeight()/2, frame.getHeight()};

        Polygon p = new Polygon(x,y,x.length);
        graphics.setColor(Color.RED);
        graphics.drawPolygon(p);
    }
}
