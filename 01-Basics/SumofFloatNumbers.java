import java.util.Scanner;
public class SumofFloatNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no to sum");
        float num_1=input.nextFloat();
        float num_2=input.nextFloat();
        float sum= num_1+num_2;
        System.out.println("sum is"+" "+sum);


    }
}
