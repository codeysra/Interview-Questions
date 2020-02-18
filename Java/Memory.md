# Memory Interview Questions

### Whats a the various memory areas present in JVM?

There are 5:
    1- Method area
    2- Stack area
    3- Heap area
    4- PC Registers
    5- Native method area

### Which memory area is used to store static variables?

The JVM stores the class level infromation inside of the method area.
These class level information consist of class name, parent class name, method info, variables info,
constructors, modifiers info, constant pool info, etc.

So, static variables are store in method area (also called permgen space).

### When are static variables loaded in memory?

They get loaded when the class loader is loading the class.

### What it is heap space?

Heap memory is used to store objects and corresponding instance variable.

Heap area gets created when we start the JVM.

As method area, heap area is shared among all the threads.

### What is String pool?

It is a spacial memory area present inside of the heap space.
It stores string literals. When we create a string that already exists in the String pool, 
JVM will not allocate space for this duplicate. It will instead return the reference to the already existing string.

### What is Stack memory?

 Stack memory is used for the execution of a thread. 
 It contains method-specific values that are short-lived. Any objct created inside will reference the heap.
 
 Stack memory is always referenced in LIFO (Last-In-First-Out) order. 
 Whenever a method is invoked, a new block is created in the stack memory for the method to hold local primitive values 
 and reference to other objects in the method.

As soon as the method ends, the block becomes unused and becomes available for the next method.
Stack memory size is very less compared to Heap memory.

### What is stack frame? What does it consits of?

Each entry in the stack is called stack frame.

It consists of:
    1. Local variable array: stores local variables and corresponding values related to any method.
    2. Operand stack: a runtime workspace for JVM to perform any intermediate operations.
    3. Frame data: stores all symbolds corresponding to any method.
    
    
* For every method, one stack frame is created.

### How are heap and stack interrelated?

Local variables are stores in the stack and objets in the heap.

For every object in the heap, there is a pointer that references to that object.
This pointer is stored in the stack.

### How can we get information about heap memory?

By creating an instancce of Runtime via the getInstance (Singleton).

then call the maxMemory method, totalMemory and freeMemory methods.

### What happens when JVM runs out of memory space?

An OutOfMemoryException is thrown.

### How to set minimum and maximum heap size?

-Xmx: to specify the maximum heap size
-Xms: to specify the minimum heap size

### What PC registers are for?

They keep track of the current executing instruction. 







 
 
