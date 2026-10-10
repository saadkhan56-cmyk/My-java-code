
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // calculate the sum of all number from 1 to 100 using for loop
        int i = 1;
        int sum = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of all even numbers from 1 to 100 is: " + sum);

//   multiplication table
        System.out.println("enter a number to find its multiplication table");
        int n = input.nextInt();
        int j = 1;
        for (j = 1; j <= 10; j++) {
            int table = j * n;

            System.out.println(j + "x" + n + "=" + table);
        }
//Print numbers from 50 down to 1, but skip every number divisible by 5.

        for (int num = 50; num >= 1; num--) {
            if (num % 5 != 0) {
                System.out.println(num);
            }
        }

//Count digits and sum of digits
        int y=9877;
        int summ=0;
        for (y = 9877; y > 0; ) {
            int digit=y%10;
            y=y/10;
            summ+=digit;
        }
        System.out.println("sum is" + summ);

//pprime number check
        int number=9;
        boolean isPrime=true;
        if (number<=1)
            isPrime=false;
        for(int p=2;p<=number-1;p++){
            if (number % p == 0) {
                isPrime = false;
                break;            }
            }
            if (isPrime) {
                System.out.println("Prime number");
            } else
                System.out.println("Not Prime number");

         // making traingle
        int rows = 5;
        int i = 1;
        int j = 1;
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //number pyramid
        for (i = 1; i <= rows; i++) {
            for (int k = 1; k <= rows - i; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j);

            }
            for (int s = i - 1; s >= 1; s--) {
                System.out.print(s);
            }
            System.out.println();
        }


        //fibonici series
        int a = 0;
        int b = 1;

        for (i = 1; i <= 10; i++) {     //fibonaci series of 10 numbers
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        //  check Armstrong number
        int num = 153;
        //you can assume any number or can take from user
        int original=num;       //save copy

        int sum = 0;
        for (i = num; i >0; i/=10) {
        int digit = i % 10;
            sum = sum + digit * digit * digit;
        }
        if (original == sum) {
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an Armstrong number");
        }
    }
}