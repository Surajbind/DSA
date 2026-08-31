import java.util.HashSet;
public class Aug31Array1
{
    public boolean checkDuplicate(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int data:arr)
        {
            if(set.contains(data))
            {
                return true;
            }
            set.add(data);
        }
        return false;
    }

    public static void main(String[] args)
    {   
        int[] num = {1,2,3,3};
        Aug31Array1 A1 = new Aug31Array1();
        System.out.println(A1.checkDuplicate(num));
    }
}