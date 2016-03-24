import java.util.Scanner;

public class Converter{
  
  private double value;
  
  Scanner input = new Scanner(System.in);
    //@param System.in
         //retrieves input
  
 
  public void setValue(double value){
        value = input.nextDouble();
    }
  //@param value
          //sets input value
    
    
    public double getValue(){
        return value;
    }
    //@return returns converted value
    
    
    public void resetValue(){
        value=0;
    }
    
}