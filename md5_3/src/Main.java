public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setMoneyAmount(1_000); // передайте в банкомат сумму на счету
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
        bankAccount.withdrawAll(1_000); // вызовите метод вывода средств
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}

class BankAccount {
    private long moneyAmount;

    // допишите код методов
    // используйте параметр newMoneyAmount для установки нового значения
    public long getMoneyAmount(){
        return moneyAmount;
    }

    public void setMoneyAmount(long moneyAmount){
        this.moneyAmount = moneyAmount;
    }

    public void withdrawAll(long moneyAmount){
        System.out.println("Со счёта снято " + moneyAmount + " р.");
        this.moneyAmount -= moneyAmount;
    }
}