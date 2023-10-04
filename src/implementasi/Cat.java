package implementasi;

public class Cat extends Animal implements Pet{
    private String name;

    public void Cat(String name){
        this.name = name;
    }
    public Cat(int legs, String name){
        super(4);
        setName(name);
    }
    public void getName(String name){
        this.name = "Ekklasiya " + "Adalah Kucing ";
    }

    @Override
    public String getName() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(this.name + "Adalah Kucing");
    }
    public void play(){
        System.out.println(this.name + "Yang Sedang Bermain");
    }

    public void eat(){
        System.out.println(this.name + "Yang Sedang Makan");
    }

}
