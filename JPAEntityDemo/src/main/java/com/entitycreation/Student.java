package com.entitycreation;
import javax.persistence.*;

@Entity  
@Table(name="Student")  
public class Student {
	@Id  
    private int id;  
    private String name;  
      
    public Student(int id, String name) {  
        super();  
        this.id = id;  
        this.name = name;         
    }  
  
    public Student() {  
        super();  
    }  
  
    public int getid() {  
        return id;  
    }  
  
    public void setid(int id) {  
        this.id = id;  
    }  
  
    public String getname() {  
        return name;  
    }  
  
    public void setname(String name) {  
        this.name = name;  
    }  
  
    
      
  
}
