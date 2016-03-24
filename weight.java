//unit coonverter will only convert a unit into a unit in the same class
//this way it will keep you from converting something like temperature into distance
public class weight extends Converter{
    
    public void fromOz(double value){
        value = value*28.3495; 
        //@param value
           //converts value to base unit
    }
    public void fromPound(double value){
    value = value*453.592; 
    //@param value
           //converts value to base unit
    }
    public void fromGram(double value){
    value = value*1; 
    //@param value
           //converts value to base unit
    }
    public void fromKilogram(double value){
    value = value*1000;
    //@param value
           //converts value to base unit
    }
    public void fromStone(double value){
    value = value*6350.29; 
    //@param value
           //converts value to base unit
    }
    
    
    //After converting to the base unit (gram) the program will use methods
    //to convert units into the desired unit
    
    public void convertOz(double value){
        value = value/28.3495;
        //@param value
           //converts value to unit in method
    }
    public void convertPound(double value){
    value = value/453.592; 
     //@param value
           //converts value to unit in method
    }
    public void convertGram(double value){
    value = value/1; 
     //@param value
           //converts value to unit in method
    }
    public void convertKilogram(double value){
    value = value/1000;
     //@param value
           //converts value to unit in method
    }
    public void convertStone(double value){
    value = value/6350.29; 
     //@param value
           //converts value to unit in method
    }
   
}