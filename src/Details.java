/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Details {
    private String ID;
    private String Name;
    private String Age;
    private String Fees;
    
    public Details(String ID, String Name, String Age, String Fees){
        this.ID = ID;
        this.Fees = Fees;
        this.Name = Name;
        this.Age = Age;
    }
    
    public Details(){
        
    }
    
    public void setID(String ID){
        this.ID = ID;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setAge(String Age){
        this.Age = Age;
    }
    public void setFees(String Fees){
        this.Fees = Fees;
    }
    
    public String getID(){
        return ID;
    }
    public String getName(){
        return Name;
    }
    public String getAge(){
        return Age;
    }
    public String getFees(){
        return Fees;
    }
}
