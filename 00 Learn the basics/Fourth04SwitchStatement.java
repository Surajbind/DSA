// Question Link: https://www.geeksforgeeks.org/problems/java-switch-case-statement3529/1

import java.util.Scanner;

public class Fourth04SwitchStatement {

    public void calculateCircle(double r)
    {
        double val = r * r * 3.14;
        System.out.println(val);
    }

     public void calculateRectangle(double l, double b)
    {
        double val = l * b;
        System.out.println(val);
    }

    public static void main(String [] args)
    {
        Fourth04SwitchStatement f1 = new Fourth04SwitchStatement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: 
            System.out.println("Enter Radius");
            int data = sc.nextInt();
            f1.calculateCircle(data);
                break;
            case 2:
            System.out.println("Enter Length");
            int datas = sc.nextInt();
            System.out.println("Enter Height");
            int datas2 = sc.nextInt();
            f1.calculateRectangle(datas,datas2);
                break;
            default:
            System.out.println("Something Went Wrong!!");
                break;
        }
    }
}