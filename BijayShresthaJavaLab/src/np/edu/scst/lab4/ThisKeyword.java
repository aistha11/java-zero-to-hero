/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.lab4;

public class ThisKeyword {

    String name, address;

    public ThisKeyword(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword("Bijay Shrestha", "Kusunti, lalitpur");
        System.out.println(obj.name);
        System.out.println(obj.address);
    }
}
