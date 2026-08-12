//Given an integer array nums, 
// return true if any value appears more than once in the array, 
// otherwise return false.
import java.util.HashSet;

public class DuplicateArray
{
    public int checkDuplicate(int[] data)
    {
        HashSet<Integer> Set = new HashSet<>();

        for(int num:data)
        {
            if(Set.contains(num))
            {
                return 1;
            }
            Set.add(num);
        }
        return 0;
    }
    public static void main()
    {
        int[] value = {1,2,3,4,2};
        DuplicateArray c1 = new DuplicateArray();
        System.out.println(c1.checkDuplicate(value));
    }
}