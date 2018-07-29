package final2016_q1;

import java.util.List;

public class A {
    public void print(){
        System.out.println("A");
    }

    public void printObject(A a){
        System.out.println("Obj a");
    }

    public static void printAll(List<A> list){
        System.out.println("begin list:");
        for (A a:list){
            a.print();
        }
        System.out.println("end list");
    }
}
