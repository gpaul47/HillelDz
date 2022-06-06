public class Main { //Dz29
    static class Car {
        private String color;
        private String brand;
        Car() {}
        public Car setColor(String color) {
            this.color = color;
            return this;
        }
        public Car setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        void showCar() {System.out.println("Show Car =" + " " + color + " " + brand);}
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Black").setBrand("BMW").showCar();
        new Car().setColor("Red").setBrand("Audi").showCar();
    }
}


// ДЗ 29.
//Реализовать следующую цепочку вызовов для методов объекта класса Car:
//car.setColor(<any_color>).setBrand(<any_brand_name>).showCar();
//или
//Сar().setColor(<any_color>).setBrand(<any_brand_name>).showCar();
//
//Метод showCar() - должен вывести в терминал значения свойств объекта: цвет, и наимено-вание бренда.
//
// Ответом на задание, прислать ссылку на репозиторий GitHub, с соответствующими *.java файлами.
// Для данного задания, должна быть создана отдельная ветка с име-нем: ‘java26’.