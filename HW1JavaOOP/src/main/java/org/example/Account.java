package org.example;

import java.util.Scanner;

public class Account {

protected String nameAccount;
protected int balance;
Scanner in = new Scanner(System.in);
public  Account(String nameAccount, int balance){
    this.nameAccount=nameAccount;
    this.balance=balance;
    setNameAccount(nameAccount);
    setBalance(balance);
//    setGetBalance();
    }
    public void setNameAccount(String nameAccount) {

    this.nameAccount = nameAccount;
    }
    public String getNameAccount(){
    return nameAccount;
}
    public void setBalance(int balance){
    this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }

//    public int setBalance() {
//        if(balance>=0){
//            balance= balance;
//        }else {
//            throw  new IllegalArgumentException("У вас отрицательный баланс, пополните счет");
//        }
//        return balance;
//    }

    public int setGetBalance() {
        System.out.println("Введите сумму для пополнения счета: ");
        int put = in.nextInt();
        if ( put >= 0){
            balance= balance + put;
        }else{
            throw new IllegalArgumentException("Неверная сумма");
        }
        return balance;
    }

    public int TakeBalance(){
        System.out.println("Ввведите сумму для снятия");
        int take = in.nextInt();
        if(take <=balance && take >=0){
            balance=balance - take;
        }else {
            throw new IllegalArgumentException("Неверная сумма");
        }
return balance;
}



}









