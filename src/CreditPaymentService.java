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
