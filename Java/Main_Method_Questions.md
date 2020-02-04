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
    
6. Why main method is public static?
    
    Public: so that the JVM can call it from outside the class/package
    
    Static: so that the JVM can invoke the main method without creating an object                
    

7. What will happen if we declare the main method non-static?
    
    A runtime error will be thrown (the compilation will be successful)

8. Can we define a class without a main method?
    
    From Java v7, no
    
9. Can we declare main method with different access modifier (other than public)?

    No, a runtime error will be thrown (the compilation will be successful)
    
10. Can we change return type of main method?

    No, a runtime error will be thrown (the compilation will be successful)
    
    