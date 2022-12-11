package lecture_06;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Exersize6_2 {
    public static void main(String[] args) {

        ArrayList<Integer> arrays = new ArrayList<>();
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        for(int i = 0;i < 5;i++){
            arrays.add(random.nextInt(7));
        }

        System.out.println("サイコロを5つ振りました。");
        System.out.println("何番目のサイコロの値を確認しますか？");

        try{
            int index = input.nextInt();
            System.out.println(index + "番目のサイコロの目は" + arrays.get(index));
        }catch(IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました。");
            System.out.println("プログラムを終了します。");
        }



    }
}
