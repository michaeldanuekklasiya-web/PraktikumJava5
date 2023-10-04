package implementasi;

public class Animal {
    protected Integer legs;

    protected Animal(Integer legs){
        this.legs = legs;
    }

    public void walk(){
        System.out.println(this.legs + " berjalan");}

    public void eat(){
        System.out.println(this.legs + " makan ");}
}
