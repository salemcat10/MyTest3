package test.prog;

public class MyAnimalList {

    private Animal[] animals = new Animal[5];
    private int x = 0;

    public void add (Animal a){
        if (x < animals.length){
            animals[x] = a;
            System.out.println("Animal добавлен в ячейку " + x);
            x++;
        }
    }
}
