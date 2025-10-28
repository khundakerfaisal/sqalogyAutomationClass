package OOPClass;

import java.util.Scanner;

public class MatchNumberWithRandom {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
//        int randomNumber = 25;
        int randomNumber = (int) Math.round(Math.random()*100);
        System.out.println(randomNumber);

        System.out.print("Input your number: ");
        int userNumber = inputNumber.nextInt();

        if (userNumber == randomNumber) {
            System.out.println("Woohoo! You found the correct number!!!");
        } else if (userNumber > randomNumber) {
            System.out.println("Number is too large.");
        } else {
            System.out.println("Number is too short.");
        }
    }
}
