package OOPClass;

public class MyAbstract {
    public static void main(String[] args) {
        Fruits apple=new Apple();
        apple.taste();
        Fruits lemon=new Lemon();
        lemon.taste();

    }

}

abstract class Fruits {
    abstract void taste();
}

class Apple extends Fruits {
    void taste() {
        System.out.println("Sweet");
    }
}
class Lemon extends Fruits {
    void taste() {
        System.out.println("sour");
    }
}
