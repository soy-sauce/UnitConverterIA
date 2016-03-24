//unit coonverter will only convert a unit into a unit in the same class
//this way it will keep you from converting something like temperature into distance

public class distance extends Converter{
    
    public void fromInch(double value){
        value = value*0.0254; 
        //@param value
           //converts value to base unit
    }
    public void fromFoot(double value){
    value = value*0.3048;
    //@param value
           //converts value to base unit
    }
    public void fromMile(double value){
    value = value*1609.34; 
    //@param value
           //converts value to base unit
    }
    public void fromYard(double value){
    value = value*0.9144;
    //@param value
           //converts value to base unit
    }
    public void fromMeter(double value){
    value = value*1; 
    //@param value
           //converts value to base unit
    }
    public void fromCentimeter(double value){
    value = value*0.01; 
    //@param value
           //converts value to base unit
    }
    public void fromMiliimeter(double value){
    value = value*0.001;
    //@param value
           //converts value to base unit
    }
    public void fromKilometer(double value){
    value = value*1000;
    //@param value
           //converts value to base unit
    }
    
    //After converting to the base unit (meters) the program will use methods
    //to convert units into the desired unit
    
    public void convertInch(double value){
        value = value/0.0254; 
        //@param value
           //converts value to unit in method
    }
    public void convertFoot(double value){
    value = value/0.3048; 
     //@param value
           //converts value to unit in method
    }
    public void convertMile(double value){
    value = value/1609.34; 
     //@param value
           //converts value to unit in method
    }
    public void convertYard(double value){
    value = value/0.9144;
     //@param value
           //converts value to unit in method
    }
    public void convertMeter(double value){
    value = value/1; 
     //@param value
           //converts value to unit in method
    }
    public void convertCentimeter(double value){
    value = value/0.01; 
     //@param value
           //converts value to unit in method
    }
    public void convertMiliimeter(double value){
    value = value/0.001;
     //@param value
           //converts value to unit in method
    }
    public void convertKilometer(double value){
    value = value/1000;
     //@param value
           //converts value to unit in method
    }
   
}