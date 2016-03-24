import java.util.Scanner;

public class Tester extends Converter{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter Fahrenheit: ");
    double value = input.nextDouble();
  
    value = value.fromFarenheit();
    value = value.convertCelcius();
    
    System.out.println("Celcius: " + value);
  }
}