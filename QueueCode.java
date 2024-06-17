import java.util.Queue;
import java.util.LinkedList;

public class QueueCode{


    public static void main(String[] args){

        Queue<String> queue = new LinkedList<String>();

       
      
        /*
        * Enqueue
        */
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        /*
         * Other collections methods
         */

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Chad"));

        /*
         * Peek
         */

        System.out.println(queue.peek());

        /*
         * Dequeue
         */

         queue.poll();
         queue.poll();



        System.out.println(queue); 



    }


}

