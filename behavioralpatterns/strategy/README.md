# Strategy

This is a behavioral design pattern and it focus on algorithm interchangibility to increase code reusability. This design pattern uses composition to alter code behaviour and we can provide different objects to alter the behaviour of the object.

## Real World Problem

Lets assume we have a project that involves payment methods. As we know there are various methods available such as paypal / credit card and these will require different implementations, we can create different methods in the same class to process these methods, but the code will be messy. 
One day these methods are not enough, we decide to add other payment methods we have to add other methods in the class the handle these processes. We have to check old code for some implementation details. 

## Solution

Strategy solves above problem by providing a pluggable interface that allows algorithm alteration and swapping. We can just make other implementation of the interface and use these algorithms interchangibility.

![UML Diagram of composition](https://i.ibb.co/Z23Y1cV/11491ee4.jpg)
 
The above figure shows the initial payment methods added, now if we want to add paytm as well, we can just implement the payment interface and go as usual no other class need to know what happended.

![UML Diagram of composition](https://i.ibb.co/Pm5RcVw/23e21a51.png)

Here there is a basic interface that we need to implement and a context class that manages the algorithms, this context class contains a variable of interface iterface, so it can hold all the classes that implement this interface. Now with this we can change the object/algorithm as needed in the context method, we can add a setter in context class to set algorithm for the particular object.
