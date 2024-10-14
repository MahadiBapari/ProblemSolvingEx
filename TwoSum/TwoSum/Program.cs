
using System;
using System.Collections.Generic;

namespace TwoSum
{
    public class Solution
    {
        static void Main(string[] args)
        {
            int[] nums = { 2, 7, 11, 15 };  
            int target = 9;
            int[] result = TwoSum(nums, target);
            if (result.Length == 2)
            {
                Console.WriteLine(result[0] + ", " + result[1]);
            }
            else
            {
                Console.WriteLine("No solution found.");
            }
        }

        public static int[] TwoSum(int[] nums, int target)
        {
            Dictionary<int,int> result = new Dictionary<int,int>();
            
            for (int i = 0; i < nums.Length; i++)
            {
                int compliment = target - nums[i];
                if (result.ContainsKey(compliment))
                {
                    return new int[] { result[compliment], i };

                }
                result[nums[i]] = i;

            }
            return new int[0];
        }
    }
}










