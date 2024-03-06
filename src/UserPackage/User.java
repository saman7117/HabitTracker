package UserPackage;
import TaskPackage.Task;

import java.util.Scanner;

public class User {
    public String first_name,last_name,email;
    private String username,password;
    public int streak;
    public Task createTask(){
        Task task1 = new Task();
        Scanner inp = new Scanner(System.in);
        String taskName = inp.next();
        task1.name = taskName;
        return task1;
    }
    public String getFullName(){
        String FullName = "";
        FullName = first_name+" "+last_name;
        return FullName;
    }

    public User(String user,String pass,String Fname,String Lname,String mail){
        username = user;
        password = pass;
        first_name = Fname;
        last_name = Lname;
        email = mail;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
