public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPaymentFor1Year = (int)service.calculate(1_000_000, 12); //Сумма займа, срок займа
        System.out.println("Ежемесячный платеж составит " + monthlyPaymentFor1Year + "руб.");

        int monthlyPaymentFor2Year = (int)service.calculate(1_000_000, 24); //Сумма займа, срок займа
        System.out.println("Ежемесячный платеж составит " + monthlyPaymentFor2Year + "руб.");

        int monthlyPaymentFor3Year = (int)service.calculate(1_000_000, 36); //Сумма займа, срок займа
        System.out.println("Ежемесячный платеж составит " + monthlyPaymentFor3Year + "руб.");
    }
}
