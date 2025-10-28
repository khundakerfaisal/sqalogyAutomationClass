package OOPClass;

public class InheritanceProgram {
    public static void main(String[] args) {
        Car car=new Car();
        car.sound();
        car.wheel();
    }

}
class Vehicle{
    public void sound(){
        System.out.println("vehicle has sound");
    }
    public void wheel(){
        System.out.println("vehicle has wheel");

    }
}
class Car extends Vehicle{

}
