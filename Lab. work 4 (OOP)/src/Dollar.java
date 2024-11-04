public class Dollar extends Currency implements Purse {
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
        result = sum * 61.08;
        return result;
    }

    public double convertToCent(double sum){
        double cent = sum * 100;
        return cent;
    }

    @Override
    public void totalSum(double sumDol, double sumEuro, double sumPound){
        System.out.println(sumDol + sumEuro + sumPound);
    }

    @Override
    void printSum_Rub(double result) {
        System.out.printf("После обмена на рубли вы получили %.2f руб. \n", result);
    }

    void printCent(double cent) {
        System.out.printf("После пересчета в центы вы получили %.2f центов. \n", cent);
    }

    @Override
    public void printCash() { System.out.printf("\nСумма долларов в кошельке: %.2f $\n", amount); }

}
