package fr.benali.myApi.fr.philliance.model;

public class User {
    private int id;
    private String name;
    private int age;

    public User(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
public int getId(){
    return this.id;
}    

public String getName(){
    return this.name;
}
public int getAge(){
    return this.age;
}    
 
public void setName(String name){
    this.name=name;
}
public void setAge(int age){
    this.age=age;
}
 public void deleteUser(int id) {
}
public void setId(int i) {
}
}
