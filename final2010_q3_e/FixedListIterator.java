package final2010_q3_e;

import java.util.Iterator;

public class FixedListIterator<E> implements Iterator<E> {
    private FixedList<E> fixedList;
    private int index;

    public FixedListIterator(FixedList<E> fixedList) {
        this.fixedList = fixedList;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return fixedList.length() > index;
    }

    @Override
    public E next() {
        if (hasNext()){
            try {
                return fixedList.get(index++);
            } catch (ListException e) {
                return null;
            }
        } else {
            return null;
        }
    }
}
