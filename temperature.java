//unit coonverter will only convert a unit into a unit in the same class
//this way it will keep you from converting something like temperature into distance
public class temperature extends Converter{

    public void fromFarenheit(double value){
        value = (value-32)/1.8000; 
        //@param value
           //converts value to base unit
    }
    public void fromCelcius(double value){
    value = value*1; 
    //@param value
           //converts value to base unit
    }
    public void fromKelvin(double value){
    value = value-273.15; 
    //@param value
           //converts value to base unit
    }
    
    
    //After converting to the base unit (Celcius) the program will use methods
    //to convert units into the desired unit
    
    public void convertFarenheit(double value){
        value = (value*1.8000)+32.00; 
        //@param value
           //converts value to unit in method
    }
    public void convertCelcius(double value){
    value = value/1; 
     //@param value
           //converts value to unit in method
    }
    public void convertKelvin(double value){
    value = value+273.15; 
     //@param value
           //converts value to unit in method
    }
    
}