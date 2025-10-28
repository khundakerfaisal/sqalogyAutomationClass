package OOPClass;

public class MethodOverriding {
    public static void main(String[] args) {
        University university=new Daffodil();
        university.Place();
        university.Transport();

    }
}
class University{
    public void Place(){
        System.out.println("Place banani");
    }
    public void Transport(){
        System.out.println("university has Transport");

    }
}

class Daffodil extends University{
    @Override
    public void Place(){
        System.out.println("Daffodil savar campus");
    }

}