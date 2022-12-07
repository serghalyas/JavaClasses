import java.util.Scanner;
public class LinuxTerminal {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please put a number so we can see if its odd or even");
        int input1 = sc.nextInt();

        if (input1 % 2==0) {
            System.out.println("Your number is even");

        }else{

            System.out.println("Your number is not even");


        }
    }
}
