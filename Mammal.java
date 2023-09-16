public class Mammal extends Animal {

    public Mammal(String genericMammal, int i, String brown) {
        super();
    }

    // Method to make a mammal-specific sound
    @Override
    public void makeSound() {
        System.out.println("Mammal makes a sound");
    }

}