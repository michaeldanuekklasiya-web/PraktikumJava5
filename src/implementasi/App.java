package implementasi;

public class App {
    public static void main(String[] args){
        Spider spider = new Spider();
        spider.eat();
        System.out.println();

        Dog anjing = new Dog();
        anjing.getName("");
        anjing.play();
        anjing.eat();
        anjing.walk();
        System.out.println();

        Cat Kucing = new Cat(4, "Ekklasiya ");
        Kucing.getName("");
        Kucing.play();
        Kucing.eat();
        System.out.println();
    }
}
