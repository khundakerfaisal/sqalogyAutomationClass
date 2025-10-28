package OOPClass;

public class MethodOverloading {

    public void addNumber(int a,int b){
        int sumOfNumber=a+b;
        System.out.println(sumOfNumber);
    }
    public void addNumber(int a,int b,int c){
        int sumOfNumber=a+b+c;
        System.out.println(sumOfNumber);
    }
    public static void main(String[] args) {
        MethodOverloading methodOverloading=new MethodOverloading();
        methodOverloading.addNumber(10,5,6);

    }
}
