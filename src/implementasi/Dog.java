package implementasi;

public class Dog extends Animal implements Pet{

    private String name;

    public Dog(){
        super(4);
    }

    public void getName(String name){
        this.name = "Danu " + "Adalah Anjing ";
    }

    @Override
    public String getName() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(this.name + "Adalah Anjing");
    }

    public void play(){
        System.out.println(this.name + "Yang Sedang Bermain");
    }

    public void eat(){
        System.out.println(this.name + "Yang Sedang Makan");
    }

    public void walk(){
        System.out.println(this.name + "Yang Sedang Berjalan");
    }
}
