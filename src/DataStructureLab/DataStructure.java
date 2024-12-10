import java.util.*;

public class DataStructure<T> {
    private ArrayList<T> list;
    private T[] array;
    private HashMap<String, T> map;
    private LinkedList<T> linkedList;
    private Queue<T> queue;
    private Stack<T> stack;

    // Constructor to initialize the size of the array
    public DataStructure(int arraySize) {
        list = new ArrayList<>();
        array = (T[]) new Object[arraySize]; // Generic array initialization
        map = new HashMap<>();
        linkedList = new LinkedList<>();
        queue = new LinkedList<>();
        stack = new Stack<>();
    }

    // Getter for homeStateQueue
    public Queue<T> getHomeStateQueue() {
        return queue;
    }

    // Add methods for the various data structures
    public void addElement(ArrayList<T> list, T element) {
        list.add(element);
    }

    public void removeElement(ArrayList<T> list, T element) {
        list.remove(element);
    }

    public void printList(ArrayList<T> list) {
        System.out.println("List: " + list);
    }

    public void addAge(int index, T age) {
        if (index >= 0 && index < array.length) {
            array[index] = age;
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    public void printAges() {
        System.out.print("Ages: ");
        for (T age : array) {
            System.out.print(age + " ");
        }
        System.out.println();
    }

    public void addToMap(HashMap<String, T> map, String key, T value) {
        map.put(key, value);
    }

    public void removeFromMap(HashMap<String, T> map, String key) {
        map.remove(key);
    }

    public void printMap(HashMap<String, T> map) {
        System.out.println("Map: " + map);
    }

    public void addToList(LinkedList<T> linkedList, T element) {
        linkedList.add(element);
    }

    public void printLinkedList(LinkedList<T> linkedList) {
        System.out.println("LinkedList: " + linkedList);
    }

    public void addToQueue(Queue<T> queue, T element) {
        queue.add(element);
    }

    public void printQueue(Queue<T> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue: " + queue);
        }
    }

    public void removeFromQueue(Queue<T> queue) {
        if (!queue.isEmpty()) {
            queue.poll();
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public void addToStack(Stack<T> stack, T element) {
        stack.push(element);
    }

    public void printStack(Stack<T> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack: " + stack);
        }
    }

    public void removeFromStack(Stack<T> stack) {
        if (!stack.isEmpty()) {
            stack.pop();
        } else {
            System.out.println("Stack is empty.");
        }
    }
}
