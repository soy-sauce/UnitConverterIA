//unit coonverter will only convert a unit into a unit in the same class
//this way it will keep you from converting something like temperature into distance
public class temperature extends Converter{

    public void fromFarenheit(double value){
        value = (value-32)/1.8000; //F to C
    }
    public void fromCelcius(double value){
    value = value*1; //C to C
    }
    public void fromKelvin(double value){
    value = value-273.15; 
    }
    
    
    //After converting to the base unit (Celcius) the program will use methods
    //to convert units into the desired unit
    
    public void convertFarenheit(double value){
        value = (value*1.8000)+32.00; //C to F
    }
    public void convertCelcius(double value){
    value = value/1; //C to C
    }
    public void convertKelvin(double value){
    value = value+273.15; 
    }
    
}