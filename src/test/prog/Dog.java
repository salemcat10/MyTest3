package test.prog;

public class Dog extends Canine implements PetHome{

    public String v = "Gav Gav";

    public Dog(String name, int weight) {
        super(name, weight);
    }


    public void voice() {
        System.out.println("Gav Gav");
    }


    public void play() {
        System.out.println("Play like Dog");
    }
}

