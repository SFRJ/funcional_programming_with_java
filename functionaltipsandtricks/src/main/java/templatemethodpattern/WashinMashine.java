package templatemethodpattern;

/*
Use Template Method and higher-order functions as an aid to conform
to the Liskov Substitution Principle.

A practical way to ensure that LSP is satisfied is to use Design by Contract
where you specify allowed properties as one of three kinds of constraints
at the level of individual functions or whole types:
• Precondition: A condition that must be true when entering the function (or all
functions for a type-level precondition). Example: Input parameter x can’t be null .
• Postcondition: A condition that must be true when leaving the function (or all
functions for a type-level postcondition). Example: The return value will never be
null .
• Invariant: A condition that must be true both before and after the function call
(or all functions). Example: Field f will never be null .
*/

public abstract class WashinMashine {

   public final void wash() {
       powder();
       temperature();
       time();
       extras();
   }

    protected abstract void powder();
    protected abstract void temperature();
    protected abstract void time();
    protected abstract void extras();

}
