import java.util.LinkedList;

public class LinkedListCode {
    


public static void main(String[] args){

    LinkedList<String> linkedList = new LinkedList<String>();

    /*
     * Treating a Linked List As a Stack
    */

    /*
     * Since this is a stack the A will go down and the F will be on top of it 
     * The Order will be F,D,C,B,A
     */
    linkedList.push("A");
    linkedList.push("B");
    linkedList.push("C");
    linkedList.push("D");
    linkedList.push("F");
    //linkedList.pop();
   
    /*
     * Treating a Linked List As a Queue
     * Since this is a queue, any new elements will be added from the back
     * The Order will be Z,X,C,V,B
    */

    linkedList.offer("Z");
    linkedList.offer("X");
    linkedList.offer("C");
    linkedList.offer("V");
    linkedList.offer("B");
    //linkedList.poll();

    /*
     * Adding and Removing an element in a Linked List
     */
    linkedList.add(4,"Solomon");
    linkedList.remove("Z");

    /*
     * Other Methods
     */
    System.out.println(linkedList.indexOf("Solomon"));
    System.out.println(linkedList.peekFirst());
    System.out.println(linkedList.peekLast());
    linkedList.addFirst("Starter"); //Insert at the top
    linkedList.addLast("Ending"); //Insert at the bottom
    linkedList.removeFirst();
    linkedList.removeLast();



    System.out.println(linkedList);



}



}
