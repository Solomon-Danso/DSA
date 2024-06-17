import java.util.Stack;

public class StackCode{


public static void main(String[] args){
    Stack<String> stack = new Stack<String>();
   //System.out.println(stack.empty());
/*
 Push implementation will push the element into the stack array
 */
  stack.push("MineCraft");
  stack.push("Skyrim");
  stack.push("Doom");
  stack.push("BorderLands");
  stack.push("FFVIV");

/*
 Empty implementation will check if the stack is empty
 */
System.out.println(stack.empty());



 /*
  * To View the top most element, in other words the last element or item added to the stack we use peek
  */
System.out.println(stack.peek()); //Output: FFVIV


/*
 * We can search for an item, 
 */
System.out.println(stack.search("FFVIV")); //Output: 1
System.out.println(stack.search("MineCraft")); //Output: 5
System.out.println(stack.search("Kofi")); //Output: -1, because the item does not exist





/*
 Pop will remove the last item added to the stack 
 */
stack.pop();
stack.pop();


/*
 * When we pop an item from the stack, we can assign the item to a variable
 * The Last 2 item FFVIV, BorderLands will be removed from the stack
 * The next item Doom will be popped and assign to the game variable
 */

 String game = stack.pop();

 System.out.println(game);//Output: Doom


/*
 * With Stack we can run out of memory 
 */
for(int i=0; i<1000000000; i++){
  stack.push("Fallout76");
}
/* 
Output:
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at java.base/java.util.Arrays.copyOf(Arrays.java:3512)
        at java.base/java.util.Arrays.copyOf(Arrays.java:3481)
        at java.base/java.util.Vector.grow(Vector.java:262)
        at java.base/java.util.Vector.grow(Vector.java:266)
        at java.base/java.util.Vector.add(Vector.java:782)
        at java.base/java.util.Vector.addElement(Vector.java:617)
        at java.base/java.util.Stack.push(Stack.java:66)
        at StackCode.main(StackCode.java:64)

*/ 



  System.out.println(stack); //Output: [MineCraft, Skyrim]


}

}