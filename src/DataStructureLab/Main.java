import java.util.*;

public class Main {
    public static void main(String[] args) {
        DataStructure<String> dataStructure = new DataStructure<>(3);

        // Testing ArrayList
        ArrayList<String> students = new ArrayList<>();
        dataStructure.addElement(students, "Alice");
        dataStructure.addElement(students, "Bob");
        dataStructure.printList(students);
        dataStructure.removeElement(students, "Bob");
        dataStructure.printList(students);

        // Testing array age list
        dataStructure.addAge(0, "20");
        dataStructure.addAge(1, "21");
        dataStructure.addAge(2, "22");
        dataStructure.printAges();

        // Testing HashMap
        HashMap<String, String> gpas = new HashMap<>();
        dataStructure.addToMap(gpas, "Computer Science", "3.9");
        dataStructure.addToMap(gpas, "Math", "4.0");
        dataStructure.printMap(gpas);
        dataStructure.removeFromMap(gpas, "Math");
        dataStructure.printMap(gpas);

        // Testing LinkedList
        LinkedList<String> nations = new LinkedList<>();
        dataStructure.addToList(nations, "USA");
        dataStructure.addToList(nations, "India");
        dataStructure.printLinkedList(nations);

        // Testing queue
        Queue<String> queue = dataStructure.getHomeStateQueue();  // Use getter here
        dataStructure.addToQueue(queue, "California");
        dataStructure.printQueue(queue);
        dataStructure.removeFromQueue(queue);
        dataStructure.printQueue(queue);

        // Testing stack
        Stack<String> stack = new Stack<>();
        dataStructure.addToStack(stack, "Linear Algebra");
        dataStructure.printStack(stack);
        dataStructure.removeFromStack(stack);
        dataStructure.printStack(stack);
    }
}
