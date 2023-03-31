/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

/**
 *
 * @author nithy
 */
public class User {
    
    private String username;
    private String password;
    private int points;
    
    public User(String username, String password, int points) {
        
        this.username = username;
        this.password = password;
        this.points = points;
    }
    
    public void login()
    {
    }
    
    public void logout()
    {
    }
    
    public boolean verification(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public String loginError(String username, String password) {
        if (!this.username.equals(username)) {
            return "Username is incorrect.";
        } else if (!this.password.equals(password)) {
            return "Password is incorrect.";
        } else {
            return "Error. Retry the program.";
        }
    }            
    
}
