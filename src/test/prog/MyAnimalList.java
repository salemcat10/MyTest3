package test.prog;

public class MyAnimalList {

    private int x = 0;
    private Animal[] animals = new Animal[3];

    public void add(Animal a) {
        if (x <= animals.length) {
            animals[x] = a;
            System.out.println(a + " " + a.name + " Добавлен в ячейку " + x);
            x++;
        }
    }
    public void makeVoice(){
        for (int i = 0; i < animals.length; i++){
                animals[i].voice();
        }
    }
    public void getVoice(Animal[] a){
        for (int i = 0; i < a.length; i++){
            a[i].voice();
        }
    }
    public void getData() {
        for (int i = 0; i < animals.length; i++) {
            System.out.println("Имя " + animals[i] + " " + animals[i].name + " " + "Вес(кг) " + animals[i].weight);
        }
    }

}
