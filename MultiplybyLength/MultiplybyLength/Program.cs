using System;

//    Create a function to multiply all of the values 
//    in an array by the amount of values in the given array.


namespace MultiplybyLength
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = multByLength([2, 3, 1, 0]);
            foreach( int value in arr)
            {
                Console.WriteLine(value);
            }
        }

        static int[] multByLength(int[] mult) 
        {
            int len = mult.Length;

            if (mult.Length == 0)
            {
               return mult;
            }
            else
            {
                for (int i = 0; i < len; i++)
                {
                    mult[i] = mult[i] * len;
                }
            }
           
           
            return mult;
        }
    }
}