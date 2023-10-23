public class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Call the constructor of the base class
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}
