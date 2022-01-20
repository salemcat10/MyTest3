package test.prog;

public class Cat extends Canine implements PetHome{

    private String voice = "Mey Mey";

    public Cat(String name, int weight) {
        super(name, weight);
    }

    public void voice() {
        System.out.println("Mey Mey");
    }

    public void play() {
        System.out.println("Jumping");
    }
}
