
package interfaceinjava;


public interface ThirdInterface extends SecondInterface,FourthInterface {
     int maximam_Length=100;
     final String ab="hh";
  //   public abstract int ab=5;    //Variable cant be abstract .they can only be public ,static ,final.
    public abstract void swim();
    public void eatPlants();
    public int Numbers(int a);
    
   // public double getTemperature();     // we can reprsent default methods as abstract methods .
    public default double getTemperature(){
    
    return 23;
    }
    //Static Methods in interfaces
    
    static int getJump(){
        return 2;
    }
   
}
