public class Bird extends Animal {

    public Bird(String genericBird, int i, double v) {
        super();
    }

    // Method to make a bird-specific sound
    @Override
    public void makeSound() {
        System.out.println("Bird makes a sound");
    }

}