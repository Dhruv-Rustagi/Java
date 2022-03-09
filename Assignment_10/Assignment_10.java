package Assignment_10;

// Create a generic, singly linked list class called SList, which, to keep things simple, does not implement the List interface.

// Each Link object in the list should contain a reference to the next element in the list, but not the previous one (LinkedList, in contrast, is a doubly linked list, which means it maintains links in both directions).

// Create your own SListIterator which, again for simplicity, does not implement ListIterator. The only method in SList other than toString( ) should be iterator( ), which produces an SListIterator.

// The only way to insert and remove elements from an SList is through SListIterator. Write code to demonstrate SList.

public class Assignment_10 {
    private static class Node<T> {
        private T val = null;
        private Node<T> next = null;

        public Node() {

        }

        public Node(T data) {
            this.val = data;
        }

        public boolean hasNext() {
            if(next==null) {
                return false;
            }
            return true;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> node) {
            next = node;
        }

        public T getVal() {
            return val;
        }

        public T setInfo(T value) {
            T prev = getVal();
            val = value;
            return prev;
        }
    }

    public interface SListIterator<T> {
        public boolean hasNext();
        public T next();
        public void add(T element);
        public void remove();
    }

    public static class SList<T> {

        private Node<T> head = new Node<>();

        public String toString() {
            SListIterator<T> item = iterator();

            StringBuilder result = new StringBuilder("[");
            while (item.hasNext()) {
                result.append(item.next().toString());
                if (item.hasNext()) {
                    result.append(",");
                }
            }
            result.append("]");
            return result.toString();
        }
        public SListIterator<T> iterator() {
            return new SListIterator<T>() {

                private Node<T> current = head;
                private Node<T> previous = null;

                public boolean hasNext() {
                    return current.hasNext();
                }

                public T next() {
                    if (!hasNext()) {
                        throw new RuntimeException("No next element!");
                    }

                    previous = current;
                    current = current.getNext();
                    return current.getVal();
                }

                public void add(T ele) {
                    Node<T> nextNode = current.getNext();
                    Node<T> newNode = new Node<T>(ele);
                    current.setNext(newNode);
                    newNode.setNext(nextNode);
                    previous = current;
                    current = newNode;
                }

                public void remove() {
                    if (current == head) {
                        throw new RuntimeException("Current is at head");
                    }
                    if (current == previous) {
                        throw new RuntimeException("Can only be made once per call to next");
                    }
                    previous.setNext(current.getNext());
                    current.setNext(null);
                    current = previous;
                }
            };
        }

        public int size() {
            SListIterator<T> ite = iterator();
            int size = 0;
            while (ite.hasNext()) {
                ite.next();
                size++;
            }
            return size;
        }
    }
    public static void main(String[] args) {
        SList<String> myList = new SList<String>();
        SListIterator<String> ite = myList.iterator();
        for (int i = 0; i < 10; i++) {
            ite.add(String.valueOf((char)(i + 97)));
        }
        System.out.println(myList);
        int size = myList.size();
        System.out.println("My List size = " + size);
        ite = myList.iterator();
        for (int i = 0; i < size; i++) {
            ite.next();
            ite.remove();
            //ite.remove(); // ERROR: cannot remove twice for each call of next()
        }
        System.out.println(myList);
    }
}
