# Код Java находящийся в этом репозитории

```Java
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
```
```Java
public class CreditPaymentService {
    public double calculate(int loanAmount, int loanTerm) {
        double monthlyInterestRate = 9.99 / 12 / 100;                                   //Ежемесячная процентная ставка
        double baseDegree = (1 + monthlyInterestRate);                                  //Основание степени
        double subResult = Math.pow(baseDegree, loanTerm);                              //Промежуточный результат
        double annuityCoefficient = monthlyInterestRate * subResult / (subResult - 1);  //Коэффициент аннуитета
        double creditPayment = (loanAmount * annuityCoefficient);                       //Ежемесячный платеж
        return (creditPayment);
    }
}
```