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
public class Assembly {
    public static void main(String[] args) {
        Mobile onePlus = new Mobile();
        onePlus.ram = 6;
        onePlus.battery = 5000;
        onePlus.version = "2.01E";
        onePlus.cameraPixels = 16.4f;
        onePlus.call();
        onePlus.takePic();
        onePlus.playGame();
        System.out.println("Specs of Mobile");
        System.out.println("Ram: " + onePlus.ram);
        System.out.println("Battery: " + onePlus.battery);
        System.out.println("Version: " + onePlus.version);
        System.out.println("Camera Pixels: " + onePlus.cameraPixels);
        System.out.println("Wifi Present: " + onePlus.isWifi);
    }
}
