# Java Main Method Interview Questions

1. Can we overload main in Java

    Yes we can. However, when running the application, the main method with the String[] input argument will be called.

2. Can we override main in Java
    No because main method is a static method.

    Static methods are a type of static polymorphism: they are resolved during compile time.

3. Can we make main final in Java

    Yes, we can 

4. How to call a non static method from main in Java?

    We can't call a non static method from main, since main is a static method.
    
    The reason why in Java, a static method cannot invoke a non static method is because, 
    when calling the non instance method in the static method, this non instance method does not exist yet 
    (static method is tight to the class, whereas a non static method is tight to an instance of the class (an object))
   
    

5. Can we make main synchronized in Java?
    
    Yes, but since this method (main) is called only once by the JVM, it should protect us against nothing.
    