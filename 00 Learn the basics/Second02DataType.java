// Question Link: https://www.geeksforgeeks.org/problems/data-type-1666706751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=data-type


public class Second02DataType{
   
    public void getData(String val)
    {
        if(val.equals("Byte")){
            System.out.println("1");
        }
        else if(val.equals("Character"))
        {
            System.out.println("2");
        }
        else if(val.equals("Integer"))
        {
            System.out.println("4");
        }
        else if(val.equals("Float"))
        {
            System.out.println("4");
        }
        else if(val.equals("Double"))
        {
            System.out.println("8");
        }
        else if(val.equals("Long"))
        {
            System.out.println("8");
        }
    }

    public static void main(String[] args)
    {
        Second02DataType s2 = new Second02DataType();
        s2.getData("Long");
    }
}