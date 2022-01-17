package test.prog;

abstract public class Animal {

    private String name;
    private int weight;

/*    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
*/
    public Animal(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    abstract public void voice();


}
