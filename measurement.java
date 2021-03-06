//unit coonverter will only convert a unit into a unit in the same class
//this way it will keep you from converting something like temperature into distance
public class measurement extends Converter{
    
    public void fromTsp(double value){
        value = value*0.00492892; 
        //@param value
           //converts value to base unit
    }
    public void fromTbsp(double value){
    value = value*0.0147868; 
    //@param value
           //converts value to base unit
    }
    public void fromCup(double value){
    value = value*0.236588; 
    //@param value
           //converts value to base unit
    }
    public void fromOz(double value){
    value = value*0.0295735;
    //@param value
           //converts value to base unit
    }
    public void fromPint(double value){
    value = value*0.473176; 
    //@param value
           //converts value to base unit
    }
    public void fromQuart(double value){
    value = value*0.01; 
    //@param value
           //converts value to base unit
    }
    public void fromGallon(double value){
    value = value*3.78541;
    //@param value
           //converts value to base unit
    }
    public void fromLiter(double value){
    value = value*1;
    //@param value
           //converts value to base unit
    }
    public void fromMililiter(double value){
    value = value*0.001;
    //@param value
           //converts value to base unit
    }
    
    //After converting to the base unit (liters) the program will use methods
    //to convert units into the desired unit
    
    public void convertTsp(double value){
        value = value/0.00492892; 
        //@param value
           //converts value to unit in method
    }
    public void convertTbsp(double value){
    value = value/0.0147868;
     //@param value
           //converts value to unit in method
    }
    public void convertCup(double value){
    value = value/0.236588; 
     //@param value
           //converts value to unit in method
    }
    public void convertOz(double value){
    value = value/0.0295735;
     //@param value
           //converts value to unit in method
    }
    public void convertPint(double value){
    value = value/0.473176; 
     //@param value
           //converts value to unit in method
    }
    public void convertQuart(double value){
    value = value/0.01; 
     //@param value
           //converts value to unit in method
    }
    public void convertGallon(double value){
    value = value/3.78541;
     //@param value
           //converts value to unit in method
    }
    public void convertLiter(double value){
    value = value/1;
     //@param value
           //converts value to unit in method
    }
    public void convertMililiter(double value){
    value = value/0.001;
     //@param value
           //converts value to unit in method
    }
   
}