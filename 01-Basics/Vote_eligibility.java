import java.util.Scanner;
public class Vote_eligibility{
    public static void main(String[]args){
        System.out.println("enter your age");
        Scanner age = new Scanner (System.in);
        int ag = age.nextInt();
        if (ag>=18){
            System.out.println("You are eligible");
        }
        else{
            System.out.println("You are not eligible");
        }
    }
}