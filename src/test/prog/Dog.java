package test.prog;

public class Dog extends Canine implements PetHome{


    public Dog(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void voice() {
        System.out.println("Gav Gav");
    }

    @Override
    public void play() {
        System.out.println("Play like Dog");
    }
}

