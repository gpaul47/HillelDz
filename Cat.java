public class Cat extends Animal {

    @Override
    public void makeSound() {
        super.run();
        System.out.println("Cat meows.. Meow!");
    }

    public void run() {
        super.run();
        System.out.println("Cat running...");
    }
}
