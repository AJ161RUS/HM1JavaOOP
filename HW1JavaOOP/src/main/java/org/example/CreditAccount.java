package org.example;

public class CreditAccount extends Account {

    public CreditAccount(String nameAccount, int balance){
        super(nameAccount, balance);
    }

    public int TakeBalance2(){
        System.out.println("Ввведите сумму для снятия c процентом");
        int take = in.nextInt();
        take += (int)Math.round(take*0.01);
        if(take <= balance && take >=0){
            balance=balance - take;
        }else {
            throw new IllegalArgumentException("Неверная сумма");
        }
        return balance;

    }

}
