package GroupProject;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter any Number : ");
        int base = sc.nextInt();

        System.out.print(" Please Enter the power : ");
        int power = sc.nextInt();
        int result = 1;

        for(int i = 1; i <= power; i++)
        {
            result = result * base;

        }
    System.out.println("The power of your number : " + result);


    }

}
