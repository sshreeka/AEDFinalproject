/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;
import java.util.ArrayList;

/**
 *
 * @author nikhil
 */
public class PersonDirectory {
    private ArrayList<Person> PersonList;
   
    private Person person;
    public ArrayList<Person> getCustList() {
        return PersonList;
    }
    
    
    
    public void setPersonList(ArrayList<Person> PersonList) {
        this.PersonList = PersonList;
    }
    
    
    
    public PersonDirectory(){
        this.PersonList=new ArrayList<Person>();
    }
    
    
    
    public Person createCustomer(String uName){
        person= new Person(uName);
        PersonList.add(person);
        return person;
    }
    
    public void deleteCustomer(String username){
        for(int i=0;i<PersonList.size();i++){
            if(PersonList.get(i).getUserName().equals(username)){
                PersonList.remove(i);
            }
        }
    }
    
}
