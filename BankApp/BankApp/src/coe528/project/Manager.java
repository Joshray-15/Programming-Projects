
package coe528.project;

public class Manager extends Profile{
    public Manager() {
        super.setUsername("admin");
        super.setPass("admin");        
        setPosition();
    }

    
    @Override
    public void setPosition() {
    super.Position="Manager";
    }
}