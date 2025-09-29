// Question Link:  https://www.geeksforgeeks.org/problems/java-if-else-decision-making0924/0?category%255B%255D=Java&difficulty%255B%255D=-2&page=1&query=category%255B%255DJavadifficulty%255B%255D-2page1category%255B%255DJava

import java.util.Scanner;

public class Third03IfElse{
    
    // Using Normal If and Else Condition 
   
    public String checkFirstWay(int n,int m)
    {
        if(n<m){
            System.out.println("Lesser");
            return "Lesser";
        }
        else if(n==m){
             System.out.println("Equal");
            return "Equal";
        }
        else if(n>m)
        {
            System.out.println("Bigger");
            return "Greater";
        }
        else{
            return "Undefined";
        }
    }

    public String checkSecondWay(int n,int m)
    {
        return (n>m) ? ("Greater") : (n<m) ? ("Lesser") : ("Equals");
    }

    public static void main(String []args)
    {
        Third03IfElse t1 = new Third03IfElse();
        // t1.checkFirstWay(6,4);
        t1.checkSecondWay(6,9);
    }
}