//unit coonverter will only convert a unit into a unit in the same class
//this way it will keep you from converting something like temperature into distance
public class measurement extends Converter{
    
    public void fromTsp(double value){
        value = value*0.00492892; //tsp to liter
    }
    public void fromTbsp(double value){
    value = value*0.0147868; //tbsp to liter
    }
    public void fromCup(double value){
    value = value*0.236588; 
    }
    public void fromOz(double value){
    value = value*0.0295735;
    }
    public void fromPint(double value){
    value = value*0.473176; 
    }
    public void fromQuart(double value){
    value = value*0.01; 
    }
    public void fromGallon(double value){
    value = value*3.78541;
    }
    public void fromLiter(double value){
    value = value*1;
    }
    public void fromMililiter(double value){
    value = value*0.001;
    }
    
    //After converting to the base unit (liters) the program will use methods
    //to convert units into the desired unit
    
    public void convertTsp(double value){
        value = value/0.00492892; //liter to tsp
    }
    public void convertTbsp(double value){
    value = value/0.0147868; //liter to tbsp
    }
    public void convertCup(double value){
    value = value/0.236588; 
    }
    public void convertOz(double value){
    value = value/0.0295735;
    }
    public void convertPint(double value){
    value = value/0.473176; 
    }
    public void convertQuart(double value){
    value = value/0.01; 
    }
    public void convertGallon(double value){
    value = value/3.78541;
    }
    public void convertLiter(double value){
    value = value/1;
    }
    public void convertMililiter(double value){
    value = value/0.001;
    }
   
}