// Given an array of integers nums and an integer target,
// return the indices i and j such that nums[i] + nums[j] == target
// and i != j.

import java.util.HashMap;
import java.util.Arrays;
public class Array3Twosum
{
    public int[] twoSum(int[] num,int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<num.length;i++)
        {
            int needed = target - num[i];
            if(map.containsKey(needed))
            {   
                return new int[] {map.get(needed),i};
            }
            map.put(num[i],i);
        }
        return new int[] {};
    }

    public static void main(String[] args)
    {
        int num[] = {1,2,3,4};
        int target = 7;

        Array3Twosum A3 = new Array3Twosum();
        System.out.println(Arrays.toString(A3.twoSum(num, target)));
    }
}