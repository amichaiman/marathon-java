package q3;

import java.util.ArrayList;
import java.util.List;

public class FixedList<E> {
    private List<E> list;
    private int size;
    public static final int DEFAULT_SIZE = 1000;

    public FixedList() {
        size = DEFAULT_SIZE;
        list = new ArrayList<>(DEFAULT_SIZE);
    }

    public FixedList(int size) {
        this.size = size;
        list = new ArrayList<>(size);
    }

    public E get(int x){
        try{
            return list.get(x);
        } catch(Exception e){
            return null;
        }
    }

    public boolean put(int ix, E elem){
        if (ix >= size){
            return false;
        }
        list.add(ix,elem);
        return true;
    }

    public int length(){
        return size;
    }
}
