package q1;

public class Child extends Parent {
    private int i;

    public void incr(int d){
        if (d > 0){
            this.i += d;
            super.incr (d/2);
        }
    }

    public String toString(){
        return (super.toString() + "\nq1.Child's i is: " + i);
    }
}