# Garbage Collection Questions

### What is garbage collector?

It is a component of the execution engine that frees up the memory by collection and removing unreferenced objects.

### What is garbage collections?

It is a mechanism of the JVM that identifies and removes objects that are no more needed by the application. 
It allows JVM to reclaim heap space.

### Which objects are eligible for garbage collection?

Any object in the heap that is not referenced from the stack.

### How to make an object available for garbage collection?

    Way #1: by setting the object to null
    
    Way #2: by reassigning the reference variable.
    
    Way #3: at the end of a method because the stack will be poped out at the end of method execution.
    
    Way #4: through anonymous objects
    
### How to invoke garbage collector?

by calling System.gc();

or Runtime.getRuntime().gc();

### Why it is bad to call gc?

Side note: calling gc does not guarantee us that the JVM will allow gc to run.

Because when gc is called, the JVM temporarily stops all threads in our application. So, our app is temporarily suspended.



