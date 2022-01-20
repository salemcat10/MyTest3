package test.prog;

abstract public class Animal {

    public String name;
    public int weight;
    public String v;

//    public String voice = "Animal voice";

    /*  public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
    */
    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal() {
        name = "No name";
        weight = 0;
    }

    abstract public void voice();

}