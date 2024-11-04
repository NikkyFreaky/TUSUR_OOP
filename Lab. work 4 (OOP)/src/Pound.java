public class Pound extends Currency implements Purse {
    double amount;

    public void setAmount(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    @Override
    public double convertToRub(double sum) {
        double result = 0;
        result = sum * 69.50;
        return result;
    }

    public double convertToPenny(double sum){
        double penny = sum * 100;
        return penny;
    }

    @Override
    public void totalSum(double sumDol, double sumEuro, double sumPound){
        System.out.println(sumDol + sumEuro + sumPound);
    }

    @Override
    void printSum_Rub(double result) {
        System.out.printf("После обмена на рубли вы получили %.2f руб. \n", result);
    }

    void printPenny(double penny) {
        System.out.printf("После пересчета в центы вы получили %.2f центов. \n", penny);
    }

    @Override
    public void printCash() { System.out.printf("\nСумма фунтов стерлингов в кошельке: %.2f £\n", amount); }
}
