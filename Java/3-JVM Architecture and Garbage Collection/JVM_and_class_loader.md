Table Of Contents
+ [Whats a Virtual Machine?](#whats-a-virtual-machine-)
+ [What is a Java VM?](#what-is-a-java-vm-)
+ [Is JVM a compiler or interpreter?](#is-jvm-a-compiler-or-interpreter-)
+ [What are JRE, JDK and how are they different from JVM?](#what-are-jre--jdk-and-how-are-they-different-from-jvm-)
+ [How JVM Works?](#how-jvm-works-)
+ [What it is Classloader?](#what-it-is-classloader-)
+ [What activities are performed by the clasloader subsytem?](#what-activities-are-performed-by-the-clasloader-subsytem-)
  - [Loading Activity](#loading-activity)
  - [Linking Activity](#linking-activity)
  - [Initialization Activity](#initialization-activity)
+ [What are the different class loaders used by JVM?](#what-are-the-different-class-loaders-used-by-jvm-)
  - [Bootstrap class loader](#bootstrap-class-loader)
  - [Extension class loader](#extension-class-loader)
  - [Application class loader](#application-class-loader)
+ [How does JVM load the classes?](#how-does-jvm-load-the-classes-)
+ [What is the difference between static and dynamic class loading?](#what-is-the-difference-between-static-and-dynamic-class-loading-)
+ [What it is the difference betweem Class.forName() and ClassLoader.loadClass()?](#what-it-is-the-difference-betweem-classforname---and-classloaderloadclass---)
    
# JVM Interview Questions

### Whats a Virtual Machine?

A VM is a running program that simulated the behavior of a physical machine.

### What is a Java VM?
 It's a running application that provides a runtime environment in which Java programs are executed.
 
                       compiled into   
        .java clases         =>        .class files (byte code)
 
 then the JVM loads the .class files and executes them
 
 
 Since the JVM executes the byte code, Java is considered as platform independent. 
 
 So, once we have compiled a program and got a jar, 
 we can run this jar on any operating system, giving that this operating system has a JVM.
 
 ### Is JVM a compiler or interpreter?
 JVM is an interpreter, since it reads and executes the byte codes.
 
 
 ### What are JRE, JDK and how are they different from JVM?
 
 JRE (Java Runtime Environment): it is a set of librairies that are used to run a Java program.
 
    JVM is a subset of JRE: it consumes the librairies available in JRE to execute a Java program. 
 
 JDK (Java Development Kit): it is a software development environment which is used to develop Java applications. 
    It contains JRE + development tools.
    
### How JVM Works?
The class loaders load the .class byte code into specialized memory areas. 
Then the execution engine executes these byte codes.

### What it is Classloader?
It is a aprt of the JRE that dynamically loads at runtime Java classes into the JVM. 
These classes are not loaded all at once: when the application requires a paritcular class, the Classloader loads that class into memory.

### What activities are performed by the clasloader subsytem?

    1- Loading then
    2- Linking then
    3- Initialization

#### Loading Activity
The classloader reads the class and generates the binary data that gets stored inside the JVM (in method area).
    * method area: a part of JVM that stores class related data
    
With all the class info, JVM creates an object of type: java.lang.Class for that loaded class in the heap area.
This java.lang.Class encapsulates all the necessary information on that class.

Q: if we call a class more than once, will there be more than one java.lang.Class object for that exact same class?
A: No, 

#### Linking Activity
It is the process of taking the loaded class or interface and combining it with the runtime of the JVM, preparing it for execution

#### Initialization Activity
 Any static fields and static initializers are invoked. 

### What are the different class loaders used by JVM?


    1- Bootstrap class loader (or Primordial class loader)
    2- Extension class loader
    3- Application class loader (or System class loader)

#### Bootstrap class loader
This is the parent of all other class loaders.
It loads the core Java API classes (which are present in the bootstrap path jdk->jre->lib->rt.jar)

* rt.jar consists of core Java APIs

#### Extension class loader
This is an implementation of the bootstrap class loader.
It loads the classes present in the extension path jre->lib->ext/*.jar)

#### Application class loader
This is an implementation of the extension class loader.
It loads the classes from the classpath environment variable

 
### How does JVM load the classes?
The classloader subsystem works using the delegation principle. 
A Child classloader delegates the responsability for loading a class to their parent.
If the parent does not find the class, they the child loads the class by itself.

### What is the difference between static and dynamic class loading?

static loading is the default process of class loading: classes are statically loaded when we call them.

for ex: new Foo() => static loading

dynamic loading is a technique for programmatically invoking the functions of a class loader at run time.
It allows the loading of java code that is not known about before a program starts. 

for ex: Class c = ClassLoader.loadClass("Foo");

### What it is the difference betweem Class.forName() and ClassLoader.loadClass()?
They both try to load a class dynamically.

However they do it differently.

Class.forName("SomeClass") will:

    - use the class loader that loaded the class which calls this code
    - initialize the class (that is, all static initializers will be run)

ClassLoader.getSystemClassLoader().loadClass("SomeClass") will:

    - use the "system" class loader (which is overridable)
    - not initialize the class (for ex, if you use it to load a JDBC driver, it won't get registered, and you won't be able to use JDBC!)



















