# JVM Interview Questions

## Whats a Virtual Machine?

A VM is a running program that simulated the behavior of a physical machine.

## What is a Java VM?
 It's running application that provides a runtime environment in which Java programs are executed.
 
                compiled into   
 .java clases         =>        .class files (byte code)
 
 then the JVM loads the .class files and executes them
 
 
 Since the JVM executes the byte code, Java is considered as platform independent. 
 
 So, once we have compiled a program and got a jar, 
 we can run this jar on any operating system, giving that this operating system has a JVM.
 
 ## Is JVM a compiler or interpreter?
 JVM is an interpreter, since it reads and executes the byte codes.
 
 
 ## What are JRE, JDK and how are they different from JVM?
 
 JRE (Java Runtime Environment): it is a set of librairies that are used to run a Java program.
 
    JVM is a subset of JRE: it consumes the librairies available in JRE to execute a Java program. 
 
 JDK (Java Development Kit): it is a software development environment which is used to develop Java applications. 
    It contains JRE + development tools.
    
## How JVM Works?
The class loaders load the .class byte code into specialized memory areas. 
Then the execution engine executes these byte codes.

## What it is Classloader?
It is a set of components which loads the classes during runtime into JVM.
These classes are not loaded all at once: when the application requires a paritcular class, the Classloader loads that class into memory.

## What activities are performed by the clasloader subsytem?

    1- Loading
    2- Linking
    3- Initialization

### Loading Activity






