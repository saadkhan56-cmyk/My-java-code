import java.util.Scanner;
public class LeapYearPractice{
    public static void main(String[] args){



//LEAP YEAR
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the year");
        int year = sc.nextInt();
        boolean isleap = false;
        if(year%400==0 || year%4==0 && year%100!=0){
            isleap = true;
        }
        if (isleap){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");

    }
            
    }
}