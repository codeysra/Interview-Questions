# Execution Engine Questions

### What is execution engine?

It is a component of the JVM responsible for executing the byte code which is assigned to the runtime data areas (inside of method area) through the classloader.

The execution engine is made up of three major sub-components:

    1- Interpreter: a program that reads the bytecode instructions and executes them in a sequential manner. But it is slow.
    
    2- JIT (Just In Time) Compiler: counterbalances the Interpreter’s disadvantage of slow execution (improves the performance) by compiling
        the byte code parts which have similar functionalities at the same time.
    
    3- Garbage Collector: frees up the memory by collecting and removing the unreferenced objects

### Which memory area is used to store static variables?
