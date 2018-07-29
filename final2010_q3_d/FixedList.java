package final2010_q3_d;

import java.util.ArrayList;
import java.util.List;

public class FixedList<E> {
    private List<E> list;
    private E empty = null;
    private int size;

    public static final int DEFAULT_SIZE = 1000;

    public FixedList() {
        size = DEFAULT_SIZE;
        init();
    }

    private void init() {
        list = new ArrayList<>(DEFAULT_SIZE);
        for (int i=0; i<size; i++){
            list.add(0,empty);
        }
    }

    public FixedList(int size) {
        this.size = size;
        init();
    }

    public E get(int x) throws ListException {
        if (x >= size || x < 0){
            throw new ListException("invalid array index");
        }
        E e = list.get(x);
        if (e == empty){
            throw new ListException("cannot process get request prior to put");
        }
        return e;
    }

    synchronized public void put(int ix, E elem) throws ListException {
        if (ix >= size || ix < 0){
            throw new ListException("invalid array index");
        }
        list.add(ix,elem);
    }
    synchronized public E remove(int ix) throws ListException {
        if (ix < 0 || ix >= size){
            throw new ListException("invalid array index");
        }
        E e = list.get(ix);
        if (e == empty){
            throw new ListException("no value at index " + ix);
        }
        list.set(ix, empty);
        return e;
    }
    public int length(){
        return size;
    }
}
