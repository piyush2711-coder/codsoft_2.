import java.util.*;

public class gradecalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum = 0;
        double maths , english ,science , computer , hindi;
        System.out.print("Enter the maths marks out of 100 : ");
        maths = sc.nextInt();
        System.out.print("Enter the english marks out of 100 : ");
        english = sc.nextInt();
        System.out.print("Enter the science marks out of 100 : ");
        science = sc.nextInt();
        System.out.print("Enter the computer marks out of 100 : ");
        computer = sc.nextInt();
        System.out.print("Enter the hindi marks out of 100 : ");
         hindi = sc.nextInt();
        sum = english + maths + science + computer + hindi;
        System.out.println("The Total marks is " + sum+ " out of "+ 500);
        float avg = (float)((sum / 5.0)/100)*100;
        System.out.println("The average percentage is " + avg);
     if(avg<100 && avg>80)
     System.out.print("The Grade is A");
     else if(avg<=80 && avg>70)
     System.out.print("The Grade is B");
     else if(avg<=70 && avg>60)
     System.out.print("The Grade is C");
     else if(avg<=60 && avg>50)
     System.out.print("The Grade is D");
     else if(avg<=50 && avg>40)
     System.out.print("The grade is E");
     else if(avg<40)
     System.out.print("fail");
    }
}