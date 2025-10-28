package OOPClass;

public class PrametarizedConstructor {
    public PrametarizedConstructor(int qty,int amount){
        int productPrice=qty*amount;
        System.out.println(productPrice);
    }

    public static void main(String[] args) {
        PrametarizedConstructor pc=new PrametarizedConstructor(10,20);
    }
}
