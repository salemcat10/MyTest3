package test.prog;

public class Cow extends Animal{


    public Cow(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void voice() {
        System.out.println("Mooooo");
    }
}


