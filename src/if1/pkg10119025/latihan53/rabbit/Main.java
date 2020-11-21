/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan53.rabbit;

/**
 *
 * @author User
 * * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi tentang Rabbit
 */

  
   public class Main{
    public static void main(String[] args) {
        Rabbit oo1 = new Rabbit("Peter",true,"Grass",4,"Grey");
        System.out.println("Hello, his name is " + oo1.getName());
        System.out.println(oo1.getName() + " is Vegetarian? " + oo1.isVegetarian());
        System.out.println(oo1.getName() + " eat " + oo1.getEats());
        System.out.println(oo1.getName() + " has " + oo1.getNoOfLegs() + " legs");
        System.out.println(oo1.getName() + " color is " + oo1.getColor());
        System.out.println();
        System.out.println("by. Adhira Fahri Gathan");
    }
}
