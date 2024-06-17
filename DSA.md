# A DATE WITH DATA STRUCTURE AND ALGORITHM 

Data structure is a named location that can be used to store and organize data 

- A real life tree can store and organize many fruit, therefore a tree is a data structure
- An array store and organise data, therefore an array is a data structure
* Data structures are not variables
 
An algorithm is a step by step procedure to solve a problem 
-Step by step procedure to prepare a food

# Stacks 
[-] it follows the LIFO procedure 
[-] The stack is just like an empty container, We push element (video games) into the container, then it piles up 
[-] To assess the bottom of the stack we need to remove the element on top of it until we reach the bottom using Pop 
[-] There are five unique methods in the stack which are: Push, Pop, Peek, isEmpty, search
[-] Further stack implementation is in the code 

<=>Uses of Stack<=>

[*]Undo and redo feature in text editor 
[*]Moving back and forward through browser history
[*]Calling a function


# Queue

[-]It follows the FIFO procedure, First In First Out, First come first serve
[-]The concept of adding an element and removing an element from a queue is known as enqueue and dequeue
[-]Enqueue means to add an element to the queue from the tail
[-]Dequeue means to remove an element from the queue from the head
[-]We cannot instantiate the Queue because Queue is a interface but not a class. We cannot instantiate an interface. More like a template
[-]We will need a class that instantiates a Queue, we can use a LinkedList or a PriorityQueue 
[-]To enqueue we use the offer method 
[-] To dequeue we use the poll method
[-] To peek we use the peek method which will return the first item in the list 
[-] The Queue class extends the collection class so it inherits everything from the collection class 

<=>Uses of Queue<=>
[*] Keyboard backtracking 
[*] Printer Queues [Print jobs should be completed in an order]


# Priority Queue
[-]It is a FIFO data structure, element of the highest priority are served first 

# Linked List 
[-] For traditional arrays to insert an element in an index, you need to shift the element to the last end, create an empty space and insert the element 
[-] To delete an element, you need to shift the element until there is an empty space at the tail end 
[-] For about 1 million list, this is will create a lot of problem, that is why linked list come to the rescue 

<=> Advantages <=>
1. Dynamic Data structure (allocates needed memory while running)
2. Insertion and Deletion of Nodes is easy 
3. No/Low memory waste 

<=> DisAdvantages <=>
1. Greater memory usage (additional pointer)
2. No random access of elements (no index[i])
3. Acessing/Searching is more time consuming

<=> Uses <=>
1. Implements Stack and Queue
2. GPS navigation 
3. music playlist

ArrayList is great for searching elements because they use index 











