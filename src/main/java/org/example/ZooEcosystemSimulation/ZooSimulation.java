package org.example.ZooEcosystemSimulation;

import java.sql.PreparedStatement;

public class ZooSimulation {
    public static void main(String[] args) {
        /*Create an object of the Animal using Lion Class Constructor and
         Call the methods eat(), makeSound(), sleep() and displayInformation()*/

        Animal lion =new Lion("Leo",5);
        lion.eat();
        lion.makeSound();;
        lion.sleep();
        lion.displayInformation();
        System.out.println();

        /*Create an object of the Animal using Elephant Class Constructor and
         Call the methods eat(), makeSound(), sleep() and displayInformation()*/

        Animal elephant=new Elephant("Emily",10);
        elephant.eat();
        elephant.makeSound();
        elephant.sleep();
        elephant.displayInformation();
        System.out.println();

        /*Create an object of the Animal using Parrot Class Constructor and
         Call the methods eat(), makeSound(), sleep() and displayInformation()*/

        Animal parrot=new Parrot("Sweetpea",2);
        parrot.eat();
        parrot.makeSound();
        parrot.sleep();
        parrot.displayInformation();
        System.out.println();

        /*Create an object of the Animal using Eagle Class Constructor and
         Call the methods eat(), makeSound(), sleep() and displayInformation() */

        Animal eagle=new Eagle("Blaze",4);
        eagle.eat();
        eagle.makeSound();
        eagle.sleep();
        eagle.displayInformation();
        System.out.println();

        Registration register=new Registration();
        register.setEmail("userEmail@yahoo.com");
        register.setUserName("ZooEco22");
        register.setPassword("PassCode2025");
        register.displayRegistration();
    }
}
