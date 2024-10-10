import java.util.Scanner;

public class bankApp {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    String accountName;
    int accountNumber;
    int agency;
    double balance;

    System.out.println("Digite seu NOME: ");
    accountName = userInput.next();

    System.out.println("Digite sua NÚMERO DE CONTA: ");
    accountNumber = userInput.nextInt();

    System.out.println("Digite seu AGÊNCIA: ");
    agency = userInput.nextInt();

    System.out.println("Digite seu SALDO: ");
    balance = userInput.nextDouble();

    System.out.println("Obrigado " + accountName + " por abrir sua conta conosco!");
    System.out.println("Seu nº de conta é " + accountNumber + ". Sua agência é " + agency);
    System.out.println("Seu saldo é de R$" + balance);
    }
  }