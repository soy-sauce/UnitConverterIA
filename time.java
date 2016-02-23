//unit coonverter will only convert a unit into a unit in the same class
//this way it will keep you from converting something like temperature into distance
public class time extends Converter{
    
    public void fromSec(double value){
        value = value*86400; //sec to day
    }
    public void fromMin(double value){
    value = value*1440; //min to day
    }
    public void fromHour(double value){
    value = value*24; 
    }
    public void fromDay(double value){
    value = value*1;
    }
    public void fromWeek(double value){
    value = value*0.142857; 
    }
    public void fromYear(double value){
    value = value*0.00273973; 
    }
    
    
    //After converting to the base unit (days) the program will use methods
    //to convert units into the desired unit
    
    public void convertSec(double value){
        value = value/86400; //day to sec
    }
    public void convertMin(double value){
    value = value/1440; //day to min
    }
    public void convertHour(double value){
    value = value/24; 
    }
    public void convertDay(double value){
    value = value/1;
    }
    public void convertWeek(double value){
    value = value/0.142857; 
    }
    public void convertYear(double value){
    value = value/0.00273973; 
    }
    
}