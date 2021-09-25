/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.classnobject;

/**
 *
 * @author dell
 */
public class Mobile {
    int ram;
    String version;
    int battery;
    float cameraPixels;
    boolean isWifi = true;
    
    public void call(){
        System.out.println("TRING TRING");
    }
    
    public void takePic(){
        System.out.println("Click photo");
    }
    
    public void playGame(){
        System.out.println("Play game");
    }
    
    
}
