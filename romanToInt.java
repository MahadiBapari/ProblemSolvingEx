import java.util.Scanner;

public class romanToInt{
    public static void main(String[] args){
        System.out.println("Please enter a roman number: ");
        Scanner input = new Scanner(System.in);
        
        String roman = input.next();

        System.out.println("the roman num is: " + roman);

       int num = RomToInt(roman);
       System.out.println("the integer num is: " + num);
    }

    public static int RomToInt(String s){

        int result = 0;
        int num = 0;
        int prevNum = 0;
        for(int i = s.length() - 1; i >= 0; i--){

            char c = s.charAt(i); 
            

            switch(c){
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;

            }
            if(num < prevNum){
                result = result - num;
            }else{
                result = result + num;
            }

            prevNum = num;
           
        }

        return result;
    }
}