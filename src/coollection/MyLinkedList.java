package coollection;

import java.util.Iterator;

public class MyLinkedList <T> implements Iterable<T>{
    private Node first;
    private Node last;
    public MyLinkedList(){
        first = null;
        last = null;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorImplements();
    }
    private class IteratorImplements implements Iterator<T>{
        private Node cursor = first;

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public T next() {

            T item = cursor.data;
            cursor = cursor.next;
            return item;

        }
    }


    private class Node{
        private T data;
        private Node next;
        private Node(T data , Node next){
            this.data=data;
            this.next=next;
        }
    }
    public boolean isempty(){
        if(first == null){
            return true;
        }else{
            return false;
        }
    }
    public void add(T item){
        if (isempty() == false){
            Node prev = last;
            last = new Node(item , null);
            prev.next=last;


        }else{
            Node node = new Node(item , null);
            last = node;
            first = last;


        }
    }
    public void frontadd(T item){
         if (isempty() == false){
             Node fi= new Node(item , first);
             first = fi;

         }else{
             Node node = new Node(item , null);
             last = node;
             first = last;
         }
    }
    public boolean remove(T item){
        if (isempty() == true){
            throw new IllegalStateException("Empty");
        }
        boolean result = false;
        Node prev = null;
        Node current = first;
        while(current.next != null && !(current.data.equals(item))){
            prev = current;
            current = prev.next;

        }
        if (current.data.equals(item)){
            if (first == last){
                first = null;
                last = null;
            }else if (current == first){
                first=first.next;
            }else if (last == current){
                last = prev;
                last.next = null;


            }else {
                prev.next = current.next;
            }
            result = true;
        }
        return result;
    }






}
