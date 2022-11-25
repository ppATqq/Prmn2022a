package lecture03;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        System.out.print("何行分入力しますか？：");
        int a = input.nextInt();
        //改行コードが残るため、nextLine()に読み込ませる。
        String c = input.nextLine();

        for(int i=0;i < a;i++){

            System.out.println(i + "行目：");

            strings.add((new String(input.nextLine())));

        }

        System.out.println("入力した文字列:");
        for(int j=0;j < a;j++){
            System.out.print("[" + j + "]");
            System.out.println(strings.get(j));
        }

    }

}
