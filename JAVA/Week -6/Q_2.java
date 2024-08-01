// // Define an interface named Animal
// interface Animal {
//     void makeSound(); // Abstract method to make a sound
// }

// // Implement the Animal interface in the Dog class
// class Dog implements Animal {
//     @Override
//     public void makeSound() {
//         System.out.println("Dog barks: Woof! Woof!");
//     }
// }

// // Implement the Animal interface in the Cat class
// class Cat implements Animal {
//     @Override
//     public void makeSound() {
//         System.out.println("Cat meows: Meow! Meow!");
//     }
// }

// // Main class to test the Animal interface
// public class Q_2 {
//     public static void main(String[] args) {
//         // Create instances of Dog and Cat
//         Dog dog = new Dog();
//         Cat cat = new Cat();

//         // Call makeSound method for each animal
//         dog.makeSound();
//         cat.makeSound();
//     }
// }
interface Car {
    void makeSound();
    }
    class Cadillac implements Car { public void makeSound() {
    System.out.println("It's an American Car");
    }
    }
    class Audi implements Car { public void makeSound() {
    System.out.println("It's a German Car");
    }}
    public class Q_2 {
    public static void main(String[] args) { Cadillac ca = new Cadillac();
    Audi au = new Audi(); ca.makeSound(); au.makeSound();
    }}
    
