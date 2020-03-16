# Spring Interview Questions

## Dependency Injection

### What is DI?
It is the process by which a framework establishes the relationships between different parts of an application.

### What are some of the benefits of DI?
- Reduces boilerplate code
- Improves testability of components
- Makes components more reusable and maintainable


### What is the application context?

An application context is a configuration object that instantiates and configures the beans. 
It gets its instructions on which beans to process by reading configuration metadata present in XML, Java annotations, or Java code.

*application context implements ApplicationContext

### Describe the lifecycle of a bean in an applicationcontext

1. An instance of the bean is created using the bean metadata.
2. Properties and dependencies of the bean are set.
3. BeanPostProcessor process the new bean instance before and after initialization.

When the Spring application context is to shut down, the beans will receive destruction
callbacks.

### What are the different bean scopes? What is the default scope?

- singleton: single bean instance per Spring container.
- prototype: each time a bean is requested, a new instance is created.
- request: single bean instance per HTTP request. *Only in web-aware Spring application contexts.
- session: single bean instance per HTTP session. *Only in web-aware Spring application contexts.
- application: single bean instance per ServletContext. *Only in web-aware Spring application contexts.
- websocket: single bean instance per WebSocket. Only in web-aware Spring application contexts.

### Are beans lazily or eagerly instantiated by default? 
Dependeing on the bean scope:
- Singleton beans are eagerly initialized by default
- Prototype beans are lazily initialized by default. An exception to this rule is when a prototype scoped bean is 
a dependency of a singleton scoped bean. In this case. the prototype scoped bean will be eagerly initialized.

### How do you alter this behavior?
By using the @Lazy annotation on the bean.

### What is a property source? 
A property source is a a source of key-value pairs. They can be found in:
- The system properties of the JVM in which the Spring application is executed (can be obtained by calling System.getProperties())
- The system environment variables. (can be obtained by calling System.getenv())
- Properties files. 

### How would you use @PropertySource?
The annotation is applied to classes annotated with @Configuration

