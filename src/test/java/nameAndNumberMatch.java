import java.util.Scanner;

public class nameAndNumberMatch {
    public static void main(String[] args) {
        //Write a program input name  until not match
        Scanner sc = new Scanner(System.in);

//        String name = "";
//
//        while (true) {
//            System.out.println("Please enter name : ");
//            name = sc.nextLine();
//
//            if (!name.equals("q")) {
//                System.out.println("name is match!!");
//                break;
//            } else {
//                System.out.println("Please enter the correct name !!");
//            }
//        }


        //Write a program input number  until not match

        int number;
        while(true){
            System.out.println("Please enter number : ");
            number=sc.nextInt();

            if (number==7){
                System.out.println("Number is match!!");
                break;
            }
            else {
                System.out.println("Please enter the correct Number !!");
            }
        }
    }
}
