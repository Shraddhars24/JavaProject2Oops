package org.example.ZooEcosystemSimulation;

//Create the Interface AnimalBehaviour
public interface AnimalBehaviour {
    // Define methods methods eat(), sleep(), and makeSound().
    void eat();

    void sleep();

    void makeSound();

}

//Create an Abstract Animal Class that implements AnimalBehaviour interface
abstract class Animal implements AnimalBehaviour {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    abstract void displayInformation();

}

//Mammal Class extends the Animal Class
class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);

    }
    // Provide an implementation for the eat()  method

    @Override
    public void eat() {
        System.out.println(name + " is eating like a Mammal");

    }
    // Provide an implementation for the makeSound() method

    @Override
    public void makeSound() {
        System.out.println(name + "make a Mammal sound");

    }

    @Override
    void displayInformation() {
        System.out.println("Mammal Name is " + name + " and Age is " + age);

    }
}

//Bird Class extends the Animal Class
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);

    }
    // Provide an implementation for the eat()  method and print

    @Override
    public void eat() {
        System.out.println(name + " likes eating seeds");

    }
    // Provide an implementation for the makeSound() method print

    @Override
    public void makeSound() {
        System.out.println(name + " like chirping");

    }
    // Provide an implementation for the displayInformation() method and print

    @Override
    void displayInformation() {
        System.out.println("Bird Name is " + name + " and Age is " + age);

    }
}

//Lion Class extends the Mammal Class
class Lion extends Mammal {
    public Lion(String name, int age) {
        super(name, age);

    }
    // Provide an implementation for the eat()  method

    @Override
    public void eat() {
        System.out.println(name + " likes to eat meat");

    }
    // Provide an implementation for the makeSound() method

    @Override
    public void makeSound() {
        System.out.println(name + " roars when it is angry");

    }

    @Override
    void displayInformation() {
        System.out.println("Lion's Name is " + name + " and Age is " + age);

    }
}

//Elephant Class extends the Mammal Class
class Elephant extends Mammal {
    public Elephant(String name, int age) {
        super(name, age);

    }
    // Provide an implementation for the eat()  method

    @Override
    public void eat() {
        System.out.println(name + " likes to eat fruits and tree bark");

    }
    // Provide an implementation for the makeSound() method

    @Override
    public void makeSound() {
        System.out.println(name + " makes a trumpet sound");

    }

    @Override
    void displayInformation() {
        System.out.println("Elephant's Name is " + name + " and Age is " + age);

    }
}

//Parrot Class extends the Bird Class
class Parrot extends Bird {
    public Parrot(String name, int age) {
        super(name, age);

    }
    // Provide an implementation for the eat()  method and print

    @Override
    public void eat() {
        System.out.println(name + " likes eating nuts");

    }
    // Provide an implementation for the makeSound() method print

    @Override
    public void makeSound() {
        System.out.println(name + "likes to whistle and talk");

    }
    // Provide an implementation for the displayInformation() method and print

    @Override
    void displayInformation() {
        System.out.println("Parrot's Name is " + name + " and Age is " + age);

    }
}

//Eagle Class extends the Bird Class
class Eagle extends Bird {
    public Eagle(String name, int age) {
        super(name, age);

    }
    // Provide an implementation for the eat()  method and print

    @Override
    public void eat() {
        System.out.println(name + " likes to eat fish");

    }
    // Provide an implementation for the makeSound() method print

    @Override
    public void makeSound() {
        System.out.println(name + " makes a screeching sound");

    }
    // Provide an implementation for the displayInformation() method and print

    @Override
    void displayInformation() {
        System.out.println("Eagle's Name is " + name + " and Age is " + age);

    }
}


