# Design Patterns in Java

Design patterns are standard solutions to common problems in software design. They provide proven templates for solving various design issues in Java. The concept gained popularity through the book `Design Patterns: Elements of Reusable Object-Oriented Software` by the `Gang of Four` (GoF): Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides.

## 1. CREATIONAL PATTERNS

Creational design patterns focus on object creation mechanisms. Key patterns include:

- **Singleton**: Ensures a class has only one instance and provides a global point of access.
- **Factory Method**: Defines an interface for creating objects but lets subclasses alter the type of created objects. It promotes loose coupling by delegating the instantiation process to subclasses.
- **Abstract Factory**: Provides an interface for creating families of related objects without specifying concrete classes. It encapsulates a group of individual factories that share a common goal, allowing for easier management of related object creation.
- **Builder**: Creates complex objects step by step, without the need of a constructor that takes many parameters.
- **Prototype**: Creates new objects by copying an existing object.

## 2. STRUCTURAL PATTERNS

Structural patterns deal with how classes and objects are composed. Key patterns include:

- **Adapter**: Facilitates communication between incompatible interfaces.
- **Decorator**: Adds functionality to existing objects without altering their structure.
- **Facade**: Provides a simplified interface to a complex subsystem.
- **Composite**: Unifies handling of individual and composite objects in hierarchies.
- **Proxy**: Acts as an intermediate to manage requests to an object.
- **Bridge**: Decouples an abstraction from its implementation so that the two can vary independently.
- **Flyweight**: Reduces the cost of creating and managing a large number of similar objects by sharing common data while also allowing for some aspects to be unique.

## 3. BEHAVIORAL PATTERNS

Behavioral patterns focus on object interaction and responsibility. Key patterns include:

- **Observer**: Enables one-to-many dependency so that when one object changes state, all its dependents are notified automatically.
- **Command**: Encapsulates a request as an object for parameterization.
- **Strategy**: Encapsulates a family of algorithms and makes them interchangeable.
- **Chain of Responsibility**: Passes a request along a chain of handlers, where each handler decides to process or forward the request.
- **Template Method**: Defines the skeleton of an algorithm, letting subclasses override specific steps without changing the algorithm's structure.
- **Mediator**: Centralizes complex communication and control between objects by encapsulating all interactions within a mediator object.
- **State**: Alters object behavior based on its internal state.
- **Iterator**: Provides a way to sequentially access elements of a collection without exposing its underlying structure.
- **Visitor**: Represents an operation to be performed on elements of an object structure.
- **Momento**: Captures an object's state so it can be restored later without breaking encapsulation, useful for undo functionality.
- **Interpreter**: Defines a grammar for a language and provides an interpreter to process and evaluate sentences in that language, useful for parsing and interpreting structured data.

---

# Docker Instructions for a Simple Java Application

`docker build -t java-design-patterns .`

`docker run --rm java-design-patterns`
