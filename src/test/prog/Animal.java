package test.prog;

abstract public class Animal {

    private String name;

    public String getName(){
        return name;
    }

    public Animal(String theName){
        name = theName;
    }

    abstract public void voice();

    public void voiceAnimal() {

        System.out.println("voiceAnimal Bmoooov");
    }

}
