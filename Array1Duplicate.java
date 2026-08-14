//Given an integer array nums, 
// return true if any value appears more than once in the array, 
// otherwise return false.
import java.util.HashSet;

public class Array1Duplicate
{

    public int dupSearch(int[] num)
    {
        HashSet<Integer> data = new HashSet<>();
        for(int val:num)
        {
            if(data.contains(val))
            {
                return 1;
            }
            data.add(val);
        }
        return 0;
    }

    public static void main(String[] args)
    {
        int[] num = {1,2,3,13};
        Array1Duplicate A1 = new Array1Duplicate();
        System.err.println(A1.dupSearch(num));
    }
}