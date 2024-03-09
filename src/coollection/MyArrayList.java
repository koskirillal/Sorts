package coollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList <T> implements Iterable<T>{
    private Object[] array;
    private int size;
    private int capacity = 10;
    private static final int Default_Capacity = 10;
    public MyArrayList(){
        array = new Object[Default_Capacity];

    }
    public void add (T item){
        if (size == array.length){
            increaseCpacity();
            array[size] = item;
            size++;


        }else{
            array[size] = item;
            size++;
        }
    }

    private void increaseCpacity(){
        int newSize = array.length * 2;
        array = Arrays.copyOf(array , newSize);
    }
    public T get(int index){
        if (index >= 0 && index < size){
            return (T) array[index];
        }else{
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
    public int size(){
        return size;
    }
    public T remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Object item = array[index];
        int num = array.length - (index + 1);
        System.arraycopy(array , index +1 , array , index , num);
        size--;
        return (T) array[index];
    }


    @Override
    public Iterator<T> iterator() {
        return new MyArraListIterator();
    }
    private class MyArraListIterator implements Iterator<T>{
        private int currentindex = 0;

        @Override
        public boolean hasNext() {
            return currentindex < size;
        }

        @Override
        public T next() {
            if (hasNext()){
                return (T) array[currentindex++];
            }else{
                throw new NoSuchElementException();
            }
        }
    }

}
