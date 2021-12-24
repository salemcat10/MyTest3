package test.prog;

public class Dog extends Canine implements PetHome{

    public Dog(String theName) {
        super(theName);
    }


    public Dog(){
        this("noNameDog");
    }

    @Override
    public void play() {
        System.out.println("Play Home Dog");
    }


}

