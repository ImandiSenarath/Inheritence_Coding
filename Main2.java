public class Main2 {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 5);
        Mammal mammal = new Mammal("Generic Mammal", 3, "Brown");
        Bird bird = new Bird("Generic Bird", 2, 1.5);

        animal.makeSound(); // Output: Animal makes a sound
        mammal.makeSound(); // Output: Mammal makes a sound
        bird.makeSound(); // Output: Bird makes a sound
    }
}