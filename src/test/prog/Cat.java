package test.prog;

public class Cat extends Feline implements PetHome{


    public Cat(String theName) {
        super(theName);
    }

    @Override
    public void voice() {System.out.println("meay");}

    public void voiceAnimal(){
         super.voiceAnimal();
    }

    @Override
    public void play() {
        System.out.println("Play Home Cat");
    }
}