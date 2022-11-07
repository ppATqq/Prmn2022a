package lecture01;

public interface kadai15 {
    public static void main(String[] args) {

        int[] score = {41,85,72,38,80};

        //成績判定
        for(int i = 0;i < score.length;i++){

            System.out.print(i + "番 " + score[i] + "点" + " ");

            if(score[i] < 60){
                System.out.println("不可");
            }else if(score[i] < 70){
                System.out.println("可");
            }else if(score[i] < 80){
                System.out.println("良");
            }else if(score[i] < 90){
                System.out.println("優");
            }else{
                System.out.println("秀");
            }

        }


        max(score);
        min(score);
        average(score);

    }

    static void max(int[] a){

        int max = a[0];

        for(int i = 1;i < a.length;i++){
            if(a[i] > max){
                max = a[i];
            }
        }

        System.out.println("最高点：" + max + "点");

    }
    static void min(int[] a){

        int min = a[0];

        for(int i = 1;i < a.length;i++){
            if(a[i] < min){
                min = a[i];
            }
        }

        System.out.println("最低点：" + min + "点");
    }

    static void average(int[] a){

        int sum = 0;
        double ave;

        for(int i = 0;i < a.length;i++){

            sum = sum + a[i];

        }

        ave = (double)sum / a.length;
        System.out.println("平均点：" + ave +"点");

    }
}
