import java.util.ArrayList;
import java.util.LinkedList;

class MyCircularDeque {
    int max;
    LinkedList<Integer> deque = new LinkedList<>();

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        max = k;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (deque.size()== max) return false;
        deque.addFirst(value);return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (deque.size()== max) return false;
        deque.addLast(value);return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (deque.size()==0) return false;
        deque.removeFirst();return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (deque.size()==0) return false;
        deque.removeLast();return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if(deque.size() == 0) return -1;
        return deque.getFirst();
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if(deque.size() == 0) return -1;
        return deque.getLast();
    }



    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        if(deque.size() == 0) return true;
        return false;
    }


    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if(deque.size() == max) return true ;
        return false;
    }
}
/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */

