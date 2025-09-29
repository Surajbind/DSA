// Question Link: https://www.geeksforgeeks.org/problems/data-type-1666706751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=data-type


public class Second02DataType {
    public int dataType(String val){
        if(val.equals("Byte"))
        {
            System.out.println(1);
            return (1);
        }
        else if(val.equals("Char"))
        {
            return (2);
        }
        else if(val.equals("Integer"))
        {
            return (4);
        }
        else if(val.equals("Float"))
        {
            return (4);
        }
        else if(val.equals("Double"))
        {
            return (8);
        }
        else if(val.equals("Long"))
        {
            return (8);
        }
        else 
        {
            return -1;
        }
    }

    public static void main(String[] args)
    {
        Second02DataType s2 = new Second02DataType();
        s2.dataType("Long");
    }
}