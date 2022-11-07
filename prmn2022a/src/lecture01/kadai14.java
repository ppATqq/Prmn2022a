package lecture01;

public class kadai14 {

    public static void main(String[] args) {

        int[] array = new int[100];
        int sum = 0;

        //配列に値を代入
        //for文を選んだのは、回数が配列の大きさと分かっていたため。
        for(int i = 0;i < array.length;i++){

            array[i] = i + 1;

        }
        //for文を選んだのは、回数が配列の大きさと分かっていたため。
        for(int i = 0;i < array.length;i++){

            if(i % 2 == 0){
                sum = sum + array[i];
            }

        }

        System.out.println("配列番号が偶数の総和は:" + sum);

    }
}
