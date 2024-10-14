//    Create a function that takes a number as an argument.
//    Add up all the numbers from 1 to the number you passed to the function.
//    For example, if the input is 4 then your function should return 10
//    because 1 + 2 + 3 + 4 = 10.
using System;

namespace AddUpNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Please enter a number you want to add up to:");
            int x = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("the number you entered is " + x + " and the sum is " + addUp(x));
        }

        public static int addUp(int x)
        {
            int result = 0;
            for (int i = 1; i <= x; i++) 
            { 
                result = result + i;
            }
            return result;
        }

    }

}