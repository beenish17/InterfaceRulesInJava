
package interfaceinjava;

public class FirstClass implements ThirdInterface,FourthInterface{  //Class always implements an interface
   
    public void FirstMethod(){
        System.out.println("I am first method of this class");
        System.out.println("NOTE: Any class implementing interfeace must implement all abstract methods of an interface.");
    }

    
    public void fly(int speed) {
        System.out.println("this class has to implement all methods that all interfaces are implementing");
    }

    
    public void fly1(int speed) {
        
    }

    @Override
    public void swim() {
        
    }

    @Override
    public void eatPlants() {
        System.out.println("secnd method");
    }

//    @Override         // will not compile because interfaces are implementing method with data types
//    public int Numbers(int a) {
//        return 2;
//    }

    @Override
    public int Numbers(int a) {
        System.out.println("when we change no of parameters they become two diff functions.");
        return 10;
    }

    @Override
    public int Numbers(int a, int b) {
       return 2;
    }

    @Override
    public double getTemperature() {
        return 24;  //In interfaces "in case of default methods " class implementing same methods will introduce a new version of this method.
    }
}
