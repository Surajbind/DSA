// Question Link: https://www.naukri.com/code360/problems/find-character-case_58513?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf%5C

import java.util.Scanner;

public class First01UserInputOutput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value Here:");
        int val  = sc.next().charAt(0);

        if(val>='A' && val<='Z')
        {
            System.out.println(1);
        }
        else if(val>='a' && val<='z')
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(-1);
        }
    }
}