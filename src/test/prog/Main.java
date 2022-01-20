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

        Animal[] a = new Animal[3];
        a[0] = cow;
        a[1] = cat;
        a[2] = dog;

        list.getData();
        list.makeVoice();
        list.getVoice(a);
//        a.play();

    }
}
