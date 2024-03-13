//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package UserPackage;

import TaskPackage.Task;
import java.util.Vector;
import UtilPackage.Util;

import static UtilPackage.Util.*;

public class User {
    public String first_name;
    public String last_name;
    public String email;
    private String username;
    private String password;
    public int streak;

    Vector<Task> TaskList = new Vector<Task>();

    public Task createTask(String taskName) {
        Task task1 = new Task();
        task1.name = taskName;
        if(!isTaskReptative(taskName)){
            TaskList.add(task1);
            return task1;
        }
        else {
            System.out.println("Task is REPTATIVE!!! try again...");
        }
        return task1;
    }

    public boolean isTaskReptative(String TaskName){
        for(Task test : TaskList){
            if(test.name == TaskName){
                return true;
            }
        }
        return false;
    }

    public String getFullName() {
        String FullName = "";
        FullName = this.first_name + " " + this.last_name;
        return FullName;
    }

    public User(String user, String pass, String Fname, String Lname, String mail) {
        this.username = user;
        this.password = pass;
        this.first_name = Fname;
        this.last_name = Lname;
        this.email = mail;
    }

    public User() {

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if(ispasswordvalid(password)) {
            this.password = password;
        }
        else
            System.out.println("Invalid Password");
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
}
