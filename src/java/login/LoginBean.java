/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.Serializable;

/**
 *
 * @author wathm
 */
public class LoginBean implements Serializable {
    String user;
    String pass;
    
  public LoginBean(){
    
}
  public LoginBean(String user,String pass){
      setUser(user);
      setPass(pass);
  }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
  
  
    
    
}
