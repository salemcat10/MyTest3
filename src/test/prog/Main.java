package test.prog;

public class Main {

    public static void main(String[] args) {

        Animal cow = new Cow();
        Animal cat = new Cat();
        Animal dog = new Dog();
        Cat cat2 = new Cat();


        Test test = new Test();
        test.test("dog");
        test.test(cat);
        test.test(cow);
        System.out.println(cat2.getClass());
        System.out.println(cat2.toString());
/*        MyAnimalList list = new MyAnimalList();
        list.add(dog);
        list.add(cat);
*/

    }
}
