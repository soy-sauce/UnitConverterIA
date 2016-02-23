//unit coonverter will only convert a unit into a unit in the same class
//this way it will keep you from converting something like temperature into distance

public class distance extends Converter{
    
    public void fromInch(double value){
        value = value*0.0254; //inches to meter
    }
    public void fromFoot(double value){
    value = value*0.3048; //feet to meter
    }
    public void fromMile(double value){
    value = value*1609.34; 
    }
    public void fromYard(double value){
    value = value*0.9144;
    }
    public void fromMeter(double value){
    value = value*1; 
    }
    public void fromCentimeter(double value){
    value = value*0.01; 
    }
    public void fromMiliimeter(double value){
    value = value*0.001;
    }
    public void fromKilometer(double value){
    value = value*1000;
    }
    
    //After converting to the base unit (meters) the program will use methods
    //to convert units into the desired unit
    
    public void convertInch(double value){
        value = value/0.0254; //meters to inches
    }
    public void convertFoot(double value){
    value = value/0.3048; //meters to feet
    }
    public void convertMile(double value){
    value = value/1609.34; 
    }
    public void convertYard(double value){
    value = value/0.9144;
    }
    public void convertMeter(double value){
    value = value/1; 
    }
    public void convertCentimeter(double value){
    value = value/0.01; 
    }
    public void convertMiliimeter(double value){
    value = value/0.001;
    }
    public void convertKilometer(double value){
    value = value/1000;
    }
   
}