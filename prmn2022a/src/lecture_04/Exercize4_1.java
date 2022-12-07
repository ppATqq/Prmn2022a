package lecture_04;

import java.sql.SQLOutput;

public class Exercize4_1 {

    public static void main(String[] args) {

        Fighter fighter1 = new Fighter(210,100,"Fighter1");
        Fighter fighter2 = new Fighter(180,150,"Fighter2");

        while(true){

            fighter1.attack(fighter2);
            System.out.println(fighter2.getName() + "の残り" + "hitPoint : " + fighter2.getHitPoint());
            if(fighter2.isAlive() == false){

                System.out.println(fighter2.getName() + "は倒れた。");
                break;
            }
            fighter2.attack(fighter1);
            System.out.println(fighter1.getName() + "の残り" + "hitPoint : " + fighter1.getHitPoint());
            if(fighter1.isAlive() == false){

                System.out.println(fighter1.getName() + "は倒れた。");
                break;
            }
        }


    }
}
