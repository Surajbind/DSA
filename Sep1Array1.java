import java.util.HashSet;

public class Sep1Array1
{

    public boolean checkDuplicat(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr)
        {
            if(set.contains(num))
            {
                return true;
            }
            set.add(num);
        }
        return false;
    }


    public static void main(String[] args) {
        int[] num = {1,2,3,3};
        Sep1Array1 s1 = new Sep1Array1();
        System.out.println(s1.checkDuplicat(num));
    }
}