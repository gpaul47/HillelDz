public class Main { //Dz26
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        System.out.println();
        System.out.println("public static void test(Animal animal)");
        test(dog1);
        test(cat1);
        System.out.println("Finish");
        test(dog1);
    }
    public static void test(Animal animal) {
        animal.makeSound();
        animal.run();
    }
}


//VI. Java
//Что называется "полиморфизмом" в живой природе, и в языках программирования?
//
//Реализовать принцип полиморфизма, на базе предыдущего задания. Описать метод, принимающий в виде параметра объект класса Animal.
// Но, в зависимости от того, объект какого класса (Cat или Dog), будет фактически передан в качестве аргумента, выводит в консоль тот "звук",
// который издает одно, либо другое животное.
//Ответом на задание, прислать скриншот с кодом, упомянутого метода, а также ссылку на репозиторий GitHub,
// с соответствующими *.java файлами. Для данного задания, должна быть создана отдельная ветка с именем: ‘java23’.