package by.itacademy.lesson05.task3;

public class Task3 {
    public static void main(String[] args) {
        MTBank atm = new MTBank(11, 1,0,"MTBank", "Unknown");
        atm.printCash();
        //atm.cashIn();
        atm.printNominal();
        //atm.printCash();
        atm.cashOut(220);
        atm.printNominal();
        atm.printCash();
    }


}
