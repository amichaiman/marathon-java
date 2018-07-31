package test;

public class Main{
    public static void main(String[] args) {
        Person p1 = new Person(123,"yossi");
        Person p2 = new Person(123,"yossi");

        if (p1.equals(p2)){
            System.out.println("same");
        } else{
            System.out.println("not the same");
        }
    }

}
