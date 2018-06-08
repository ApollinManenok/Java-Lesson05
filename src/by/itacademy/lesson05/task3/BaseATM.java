package by.itacademy.lesson05.task3;

public abstract class BaseATM implements CashCycle, CashInfo, NominalInfo {
    private int banknote20;
    private int banknote50;
    private int banknote100;

    public BaseATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    @Override
    public void cashIn(int sum) {
        if (sum % 10 != 0 || (sum < 50 && sum % 20 != 0))
            System.out.println("Wrong inserted cash nominal!\nPlease, mind that you can insert cash only in '100', '50', or '20' nominal");
        else {
            banknote100 += sum / 100;
            sum = sum % 100;
            if (sum < 50 && sum % 20 != 0) {
                banknote100--;
                banknote50++;
                banknote20 += (sum + 50) / 20;
            } else if (sum / 10 % 10 % 2 != 0) {
                banknote50++;
                banknote20 = (sum - 50) / 20;
            } else {
                banknote20 = sum / 20;
            }
        }
    }

    @Override
    public void cashOut(int sum) {
        if ((sum > (banknote100 * 100 + banknote50 * 50 + banknote20 * 20)) || sum % 10 != 0 || (sum < 50 && sum % 20 != 0)) {
            System.out.println("Wrong request!");
            return;
        }
        int cash100 = 0;
        int cash50 = 0;
        int cash20 = 0;
        cash100 += sum / 100;
        sum = sum % 100;
        if (sum < 50 && sum % 20 != 0) {
            cash100--;
            cash50++;
            cash20 += (sum + 50) / 20;
        } else if (sum / 10 % 10 % 2 != 0) {
            cash50++;
            cash20 = (sum - 50) / 20;
        } else {
            cash20 = sum / 20;
        }
        boolean term100 = banknote100 >= cash100;
        boolean term50more = banknote50 >= cash50 + (cash100 - banknote100) * 2;
        if (banknote20 < cash20 || banknote50 < cash50) {
            System.out.println("Not enough cash in ATM");
        } else if (term100) {
            banknote100 -= cash100;
            banknote50 -= cash50;
            banknote20 -= cash20;
        } else if (!term100 && term50more) {
            banknote50 -= cash50 + (cash100 - banknote100) * 2;
            banknote100 = 0;
            banknote20 -= cash20;
        } else if (!term100 && !term50more) {
            int temp50 = banknote50 - cash50;
            cash50 = temp50 % 2 == 0 ? ((cash100 - banknote100) * 2 - temp50) : ((cash100 - banknote100) * 2 - temp50 + 1);
            temp50 = temp50 % 2 == 0 ? (0) : (1);
            int temp100 = 0;
            if (banknote20 >= cash20 + cash50 /2 * 5){
                banknote100 = temp100;
                banknote50 = temp50;
                banknote20 -= cash20 + cash50 / 2 * 5;
            }
            else{
                System.out.println("Not enough cash in ATM");
            }
        }
    }

    @Override
    public void printCash() {
        System.out.println("Total cash amount: " + (banknote20 * 20 + banknote50 * 50 + banknote100 * 100));
    }

    @Override
    public void printNominal() {
        System.out.println("Nominal '100' banknotes: " + banknote100 + "\nNominal '50' banknotes: " + banknote50 + "\nNominal '20' banknotes: " + banknote20);
    }
}
