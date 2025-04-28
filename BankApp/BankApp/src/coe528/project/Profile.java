
package coe528.project;

public abstract class Profile {
    protected String username;
    protected String password;
    protected String Position;

    public void setPass(String pass) {
        this.password = pass;
    }

    public String getPass() { 
        return password;
    }

    public String getPosition() {   
        return Position;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public abstract void setPosition();    
}


