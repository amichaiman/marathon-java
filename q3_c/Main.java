package q3_c;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> i = new FixedList<>(10);
        try{
            i.put(3,10);
        } catch (ListException e){
            e.getStackTrace();
        }
        try {
            System.out.println(i.get(3));
            i.get(3);
        } catch (ListException e) {
            e.printStackTrace();
        }
    }
}
