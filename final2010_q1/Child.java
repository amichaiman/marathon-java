package final2010_q1;

import java.io.IOException;

public class Child extends Parent {
    private int i;

    protected void incr(int d) throws IOException {
        if (d > 0){
            this.i += d;
            try {
                super.incr (d/2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String toString(){
        return (super.toString() + "\nfinal2010_q1.Child's i is: " + i);
    }
}
