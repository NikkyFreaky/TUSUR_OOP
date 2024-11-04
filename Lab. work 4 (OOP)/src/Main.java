public class Main {

    public static void main(String[] args) {

        double sumDol = 250, sumEuro = 180, sumPound = 300;

        Dollar dollar1 = new Dollar();
        Euro euro1 = new Euro();
        Pound pound1 = new Pound();

        dollar1.setAmount(sumDol);
        euro1.setAmount(sumEuro);
        pound1.setAmount(sumPound);

        System.out.print("\nДоллары: ");
        dollar1.printCash();
        sumDol = dollar1.convertToRub(dollar1.getAmount());
        dollar1.printSum_Rub(sumDol);
        dollar1.printCent(dollar1.convertToCent(dollar1.getAmount()));

        System.out.print("\nЕвро: ");
        euro1.printCash();
        sumEuro = euro1.convertToRub(euro1.getAmount());
        euro1.printSum_Rub(sumEuro);
        euro1.printCent(euro1.convertToCent(euro1.getAmount()));

        System.out.print("\nФунты-стерлинги: ");
        pound1.printCash();
        sumPound = pound1.convertToRub(pound1.getAmount());
        pound1.printSum_Rub(sumPound);
        pound1.printPenny(pound1.convertToPenny(pound1.getAmount()));

        System.out.println("\nРубли: ");
        System.out.print("Общая сумма рублей в кошельке: " );
        dollar1.totalSum(sumDol, sumEuro, sumPound);

    }

}