package test.prog;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Sharik", 15 );
        Cat cat = new Cat("Barsik", 7);
        Cow cow = new Cow("Marusya", 100);

        MyAnimalList list = new MyAnimalList();
        list.add(dog);
        list.add(cat);
        list.add(cow);



    }
}
