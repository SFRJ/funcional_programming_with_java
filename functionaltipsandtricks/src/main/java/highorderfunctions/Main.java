package highorderfunctions;

/**
 * The difference between a method and a function is:
 * -A method is the an OO construct that that represents the behavior of an object.
 * -A function is a FP construct that expresses behavior but does not belong to any object or class.
 * High order functions are functions that:
 *    - takes one or more functions as an input
 *    - outputs a function
 * In Java they can be implemented by anonymous classes.
 *
 */
public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.doSomething();
        Beast beast = new Beast();
        beast.doSomething();
    }
}
