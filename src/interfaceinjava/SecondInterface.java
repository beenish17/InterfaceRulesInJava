
package interfaceinjava;

public abstract interface SecondInterface extends FirstInterface { 
                                            //Interfaces are not compulsory to implement any method.
                                            //Interfaces cant be marked as final ,Protected.
                                            //Must have public and abstract modifiers.
    void fly(int speed);
    // is equilent to
    //public abstract fly(int speed);
    
    abstract void fly1(int speed);
    // is equilent to
    // public abstract void fly1(int speed).    //Compiler automatically inserts "public abstrcat" keyword in the start.
    
    
    
}
