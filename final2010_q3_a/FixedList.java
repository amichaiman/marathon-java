package final2010_q3_a;

import java.util.ArrayList;
import java.util.List;

public class FixedList<E> {
    private List<E> list;
    private int size;
    public static final int DEFAULT_SIZE = 1000;

    public FixedList() {
        size = DEFAULT_SIZE;
        init();
    }

    public FixedList(int size) {
        this.size = size;
        init();
    }

    private void init() {
        list = new ArrayList<>(DEFAULT_SIZE);
        for (int i=0; i<size; i++){
            list.add(0,null);
        }
    }

    public E get(int x){
        try{
            return list.get(x);
        } catch(Exception e){
            return null;
        }
    }

    public boolean put(int ix, E elem){
        if (ix >= size || ix < 0){
            return false;
        }
        list.add(ix,elem);
        return true;
    }

    public int length(){
        return size;
    }
}
