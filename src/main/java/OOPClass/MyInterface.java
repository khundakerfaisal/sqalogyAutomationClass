package OOPClass;

public class MyInterface {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.sound();
        cat.walk();
        cat.eat();




    }

}
interface Animal{

    void sound();
    void walk();

}
interface Food{
    void eat();
}

class Cat implements Animal,Food{
    public void eat(){
        System.out.println("Cate eat fish");
    }
    public void sound(){
        System.out.println("Cate sound Maww ");
    }
    public void walk(){
        System.out.println("Cate walk");
    }



}
