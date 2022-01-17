package test.prog;

public class MyAnimalList {

    private int x = 0;
    private Animal[] animals = new Animal[5];

    public void add (Animal a){
        if (x <= animals.length){
            animals[x] = a;
            System.out.println(a + " Добавлен в ячейку " + x);
            x++;
        }
    }
}
