
package comparabletest;

public class ComparableClass{
     private String speciesName;
    private int speciesWeight;
    
    public ComparableClass(String name,int weight){
       this.speciesName=name;
       this.speciesWeight=weight;
    }
   
    public String getName(){return speciesName;}
    public int getWeight(){return speciesWeight;}
    public void setWeight(int weight){
        speciesWeight=weight;
    }
    public String toString(){
        
        return speciesName + " "+ speciesWeight;
    }
    
    
}
