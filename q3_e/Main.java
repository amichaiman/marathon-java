package q3_e;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> fixedList = new FixedList<>(10);
        for (int i=0; i<10; i++){
            try {
                if (i%2 == 0){
                    fixedList.put(i,i);
                }
            } catch (ListException e) {
                e.printStackTrace();
            }
        }

        FixedListIterator fixedListIterator = fixedList.getIterator();

        for (int i=0; i<10; i++){
            System.out.println(fixedListIterator.next());
        }
    }
}
