import java.util.Scanner;
    public class LargestofthreeNumbers {
        public static void main(String[]agrs){
            Scanner in = new Scanner(System.in);
            System.out.println("enter no to compare");
            float num1= in.nextFloat();
            float num2 = in.nextFloat();
            float num3 = in.nextFloat();
            if(num1>num2){
                if(num1>num2){
                    System.out.println(num1+":"+"is the largest no ");
                }
            }
            if(num2>num1){
                if(num2>num3) {
                    System.out.println(num2 + ":" + "is the largest no");
                }
            }
            else{
                System.out.println(num3+":"+"is the largest no");
            }

        }
    }
