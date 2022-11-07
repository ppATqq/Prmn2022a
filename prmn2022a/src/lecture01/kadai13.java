package lecture01;
import java.util.Scanner;

public class kadai13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age;

        System.out.println("age:");
        age = input.nextInt();

        if(age < 0 || age > 120){

            System.out.println("error");
            return ;

        }else if (age < 20) {

            System.out.println("I am " + age + " yeas old so I cannot drink liquor.");

        } else {

            System.out.println("I am " + age + " yeas old so I can drink liquor.");

        }
    }
}
