import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        int temp = num;
        int reverseNum = 0;

        while(num != 0){
            reverseNum = (reverseNum*10) + (num % 10);
            num = num/10;
        }

        System.out.println("Reverse num is: " + reverseNum);

        if(reverseNum == temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
