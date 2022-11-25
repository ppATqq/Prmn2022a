package lecture03;

import java.util.Scanner;

public class Exercise3_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1つ目の整数を入力してください：");
        String num1 = input.nextLine();
        int number1 = Integer.parseInt(num1);

        System.out.println("2つ目の整数を入力してください");
        String num2 = input.nextLine();
        int number2 = Integer.parseInt(num2);

        int num = number1 + number2;
        System.out.println(number1 + "+" + number2 + "=" + num);
    }

}
