package final2010_q1;

public class Main {
    public static void main(String[] args) {

        Parent a = new Child();

        try {
            a.incr(10);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(a);
    }
}
