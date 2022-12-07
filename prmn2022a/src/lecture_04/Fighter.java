package lecture_04;

public class Fighter {

    private int hitpoint;
    private int power;
    private String name;

    public Fighter(int hitpoint,int power,String name){

        this.hitpoint = hitpoint;
        this.power = power;
        this.name = name;

    }


    public void attack(Fighter enemy){

        enemy.setHitPoint(enemy.hitpoint - this.power);
        System.out.println(this.name + "は" + enemy.name + "に" + this.power +"ダメージを与えた。");

    }

    public boolean isAlive(){

        boolean a = true;
        boolean b = false;

        if(this.hitpoint > 0){
            return a;
        }else{
            return b;
        }

    }


    public int getHitPoint(){

        return this.hitpoint;

    }


    public void setHitPoint(int hitpoint){

        this.hitpoint = hitpoint;

    }


    public String getName(){

        return this.name;

    }
}
