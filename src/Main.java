public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 5);
        Dog dog = new Dog("Buddy", 3, "Labrador");

        animal.eat();
        animal.sleep();

        dog.eat();
        dog.sleep();
        dog.bark();
    }
}