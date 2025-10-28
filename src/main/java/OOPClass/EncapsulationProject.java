package OOPClass;

public class EncapsulationProject {
    public String name="jamal";
    private int Nid;

    public void getNid(){
        System.out.println(Nid);
    }

    public void setNid(int Nid){
        this.Nid=Nid;
    }
    private int age;
    public void getAge(){
        System.out.println(Nid);
    }
    public void setAge(int age){
        this.age=age;
    }

}
class CheckAccess{
    public static void main(String[] args) {
        EncapsulationProject encapsulationProject=new EncapsulationProject();
        String name = encapsulationProject.name;
        encapsulationProject.setNid(12144845);
        encapsulationProject.setAge(20);

        System.out.println(name);
        encapsulationProject.getAge();
        encapsulationProject.getNid();
    }
}
