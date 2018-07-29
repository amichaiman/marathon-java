package final2010_q1;

public class Parent {
    private int i;

    public void incr(int d){
        if (d > 0){
            this.i += d;
            this.incr(d-1);
        }
    }

    public String toString(){
        return ("final2010_q1.Parent's i is: " + i);
    }
}
