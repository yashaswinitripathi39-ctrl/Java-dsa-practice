import java.util.*;
public class Checknum{
    public static void main(String[] args){
        System.out.println("enter no to check +ve or -ve ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Given no is positive ");
        }
        else if (a<0){
            System.out.println("Given no is negative ");
        }
        else {
            System.out.println("Given no is Zero");45
        }
    }
}
