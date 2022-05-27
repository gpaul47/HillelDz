public class Dog extends Animal {

    @Override
    public void makeSound() {
        super.run();
        System.out.println("Dog barking");
    }

    public void run() {
        super.run();
        System.out.println("Dog running...");
    }
}