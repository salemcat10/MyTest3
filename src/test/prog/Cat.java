package test.prog;

public class Cat extends Canine implements PetHome{


    public Cat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void voice() {
        System.out.println("Mey Mey");
    }

    @Override
    public void play() {
        System.out.println("Jumping");
    }
}
