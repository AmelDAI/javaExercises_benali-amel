package service.my.Api;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.benali.myApi.fr.philliance.model.User;

@Service
public class UserService {
    private ArrayList<User>users;
   
    
public UserService(){
 this.users = new ArrayList<User>();

 this.users.add(new User(0, "Celine", 28));
 this.users.add(new User(0, "Alex", 34));
 this.users.add(new User(0, "Samanta", 41));
    }
    
     
    public User getUsers( int id){
                for(User user : this.users){
                    if(  user.getId()== id){
                        return user;
                     }   
                } 
        return null;
    }
    public User createUser( String name, int age){      
         User user = new User(this.users.size(), name, age);
         this.users.add(user);
        return user;
    }
    public User updateUser(int id, String name, int age){      
        for(User user : this.users){
            if(  user.getId()== id){
                user.setName(name);
                user.setAge(age);
                return user;       }   
        } 
        return null;
    }
    public User deleteUser( int id){
        for(User user : this.users){
            if(  user.getId()== id){
                int index = this.users.indexOf(user);
                this.users.remove(index);
                return user;
             }   
        } 
return null;
}

}
