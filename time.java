//unit coonverter will only convert a unit into a unit in the same class
//this way it will keep you from converting something like temperature into distance
public class time extends Converter{
    
    public void fromSec(double value){
        value = value*86400; 
        //@param value
           //converts value to base unit
    }
    public void fromMin(double value){
    value = value*1440; 
    //@param value
           //converts value to base unit
    }
    public void fromHour(double value){
    value = value*24; 
    //@param value
           //converts value to base unit
    }
    public void fromDay(double value){
    value = value*1;
    //@param value
           //converts value to base unit
    }
    public void fromWeek(double value){
    value = value*0.142857; 
    //@param value
           //converts value to base unit
    }
    public void fromYear(double value){
    value = value*0.00273973; 
    //@param value
           //converts value to base unit
    }
    
    
    //After converting to the base unit (days) the program will use methods
    //to convert units into the desired unit
    
    public void convertSec(double value){
        value = value/86400; 
        //@param value
           //converts value to unit in method
    }
    public void convertMin(double value){
    value = value/1440; 
     //@param value
           //converts value to unit in method
    }
    public void convertHour(double value){
    value = value/24; 
     //@param value
           //converts value to unit in method
    }
    public void convertDay(double value){
    value = value/1;
     //@param value
           //converts value to unit in method
    }
    public void convertWeek(double value){
    value = value/0.142857; 
     //@param value
           //converts value to unit in method
    }
    public void convertYear(double value){
    value = value/0.00273973; 
     //@param value
           //converts value to unit in method
    }
    
}