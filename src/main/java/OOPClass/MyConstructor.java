package OOPClass;

public class MyConstructor {
//    public MyConstructor(){
//        System.out.println("Name is NTech");
//    }
    public MyConstructor(int price,int qty){
        System.out.println(price+qty);
    }
    public static void main(String[] args) {
      MyConstructor mc=new MyConstructor(500,2);

    }



}
