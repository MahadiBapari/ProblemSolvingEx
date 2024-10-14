import java.util.Scanner;

public class findFutureDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter today's day: ");
        int today = input.nextInt();
        
        weekDays(today);

        System.out.print("Enter the number elapsed since today: ");
        int elaspedDays = input.nextInt();

        int futureDay = (today + elaspedDays) % 7;

        System.out.println("Today is " + weekDays(today) + " and the future day is " + weekDays(futureDay));
        weekDays(futureDay);


     
}
            public static String weekDays(int x){
                String day = null; 

            switch(x){
                case 1: day = "Sunday"; break;
                case 2: day = "Monday"; break;
                case 3: day = "Tuesday"; break;
                case 4: day = "Wednesday"; break;
                case 5: day = "Thursday"; break;
                case 6: day = "Friday"; break;
                case 7: day = "Saturday"; break;
                }
                return day;
            }

}
