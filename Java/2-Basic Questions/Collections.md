# Java Collections Interview Questions

## Overview Questions

### What is collections framework?
It is a set of interfaces and classes that are used to store and process data in an effecient way.

It was introduces in JDK v1.2. 
Prior to that, Java had some utilisity classes for storing data like Vector and HashTable.

### What are the benefits of collection framework?

- Easy to learn and implement
- Reduces programming effort and time due to the ready to use code.
- Increases performance of app because of the high-performance implementations of data structures.

### What are the main interfaces of collection framework?

    1. Collection
    2. List
    3. Set
    4. Queue
    5. Map
    
### Describe the collection api hierarchy

Collection and Map are two root interfaces.

Collection interface is extended by Set, List and Queue interfaces.

Map interface represents group of object as key:value pairs. The keys are unique.

#### Collection Implementation Details

- List is a sub interface of Collection. It is extended by ArrayList, LinkedList and Vector classes.

- Set is a sub interface of Collection. It is extended by HashSet and SortedSet.

- Queue is a sub interface of Collection. It follows the First In First Out principle. It is extended by LinkedList and PriorityQueue. 


### What is the difference between Collection and Collections?

Collections is a class that provided utility methods for the Collection interface.

## Collections Implementation Compraison

### What is the difference between Array and Arraylist data structures?

    1. Array can contain primitive data types and objects, whereas Arraylist can only contain objects.
    2. Arrays are fixed in size, whereas Arraylist are dynamic.
    3. Arraylist has more methods to manipulate the data.
    
### What is the difference between LinkedList and Arraylist data structures?

    1. Their implemntaton structure:
        Arraylist is an index based data structure, built on top of a resisable array.
        Linkedlist is a node based data structure.
        
    2. Arraylist provides random access to its elements => O(1) to access an element.
       Whereas with a linkedlist the time complexity to access an element by index is O(n) 
       (since we have to iterate over the whole list).
       
    3. Linkedlist is faster in general to add or remove elements because no element shift is required. 
        We just have to insert a new node and update the pointers address accordingly.
        
    4. Linkedlist consumes more memory space because it has to store the reference of next element on every node.     

    


## Illustrations

![](images/collection-interface-hierarchy.png)
Source: https://dzone.com/articles/an-introduction-to-the-java-collections-framework

![](images/map-interface-hierarchy.png)
Source: https://dzone.com/articles/an-introduction-to-the-java-collections-framework