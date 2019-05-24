/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {

        PrintFibonacci();
    }

    public static void PrintFibonacci() {

        int firstNum = 0;
        int secondNum = 1;
        int sum = 0;
        int count = 10;

        System.out.print(firstNum + " " + secondNum);
        for(int i=2;i<count;i++)
        {
            sum = firstNum + secondNum;
            System.out.print(" " + sum);
            firstNum = secondNum;
            secondNum = sum;
        }
    }
}