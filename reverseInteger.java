class reverseInteger{
    public static void main(String[] args) {
        int num = 38477;
        reverse(num);
        System.out.println( "the num is " + reverse(num));
    }
    public static int reverse(int x) {
        
        int reverseNum = 0;

        int remainder = 0;

        while(x != 0){
            remainder = x % 10;
            x /= 10;

            if (reverseNum > Integer.MAX_VALUE / 10 || (reverseNum == Integer.MAX_VALUE / 10 && remainder > 7)) {
                return 0;  // Handle overflow for positive numbers
            }
            if (reverseNum < Integer.MIN_VALUE / 10 || (reverseNum == Integer.MIN_VALUE / 10 && remainder < -8)) {
                return 0;  // Handle underflow for negative numbers
            }
            reverseNum = (reverseNum*10) + remainder;

        }

        return reverseNum;

    }
}