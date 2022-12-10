package lecture_04;

import java.util.ArrayList;

public class ATM {

    ArrayList<Account> accountList;

    public ATM(){

        accountList = new ArrayList<Account>();
    }


    public void registerAccount(String name,String number){

        accountList.add(new Account("藤井智子","12345"));
        System.out.println(name + "さんのアカウントを口座番号：" + number + "で登録しました。");
    }


    public boolean existsAccount(String name, String number) {

        for (Account account : accountList) {
            if (account.getName().equals(name) && account.getNumber().equals(number)) {

                System.out.println("名前：" + name + "口座番号：" + number + "は存在します。");
                return true;
            }
        }
        System.out.println("名前：" + name + "口座番号：" + number + "は存在しません。" );
        return false;
    }


    public void deposit(String number,long money){

        for(Account account : accountList){
            if(account.getNumber().equals(number)){
                account.setBalance(account.getBalance() + money);
                System.out.println("口座番号：" + number + "に" + money + "円入金しました。");
                return ;
            }else{
                System.out.println("口座番号：" + number + "は存在しませんでした。");
            }
        }

    }


    public long withdraw(String number,long money){

        for(Account account : accountList) {
            if (account.getNumber().equals(number)) {

                long balance = account.getBalance();
                long newBalance = balance - money;

                if (newBalance < 0) {
                    System.out.println("口座番号：" + number + "から" + money + "円引き出せませんでした。残高：" + balance + "円です。");
                    return 0;
                } else {
                    account.setBalance(newBalance);
                    System.out.println("口座番号：" + number + "から" + money + "円引き出しました。残高：" + newBalance + "円です。");
                    return money;
                }
            }
        }
            System.out.println("口座番号：" + number + "は存在しませんでした。");
            return 0;

    }

}
