
namespace FizzBuzz
{

//Create a function that takes a number as an argument and returns "Fizz", "Buzz" or "FizzBuzz".

//If the number is a multiple of 3 the output should be "Fizz".
//If the number given is a multiple of 5, the output should be "Buzz".
//If the number given is a multiple of both 3 and 5, the output should be "FizzBuzz".
//If the number is not a multiple of either 3 or 5, the number should be output on its own as shown in the examples below.
//The output should always be a string even if it is not a multiple of 3 or/and 5.
    
    class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Plase enter the number");
            int x = Convert.ToInt32(Console.ReadLine());
            FizzBuzz(x);
            
        }

        public static void FizzBuzz(int x)
        {
            if (x % 3 == 0 && x % 5 == 0)
            {
                Console.WriteLine("FizzBuzz");
            }
            else if (x % 3 == 0)
            {
                Console.WriteLine("Fizz");
            }
            else if (x % 5 == 0)
            {
                Console.WriteLine("buzz");
            }
           
            else
            {
                Console.WriteLine(x);
            }
        }
    }
}