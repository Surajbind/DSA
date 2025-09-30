// Question Link:  

public class Third03IfElse{

    public void checkData(int n,int m)
    {
        if(n>m)
        {
            System.out.println("Greater");
        }
        else if(n==m)
        {
            System.out.println("Equals");
        }
        else if(n<m)
        {
            System.out.println("Lesser");
        }
    }

     public void checkDataTwo(int n,int m)
     {
        System.out.println((n>m) ? "Greater" : (n<m) ? "Lesser":"Equals");
    }

    public static void main(String[] args)
    {
        Third03IfElse T1 = new Third03IfElse();
        T1.checkData(4,6);
        T1.checkDataTwo(4,4);
    }
}
