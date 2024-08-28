import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String cpf, numeroConta;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("digite a sua conta: ");
        numeroConta = sc.nextLine();
        System.out.println("informe o seu cpf: ");
        cpf = sc.nextLine();
        Conta conta = new Conta(numeroConta, cpf);

        while (i != 5) {
            System.out.println("Programas \n" +
                    "1 - Saque \n" +
                    "2 - Depositar\n" +
                    "3 - Verificar Saldo \n" +
                    "4 - Verificar suas Imformações\n" +
                    "5 - Sair");
            i = sc.nextInt();

            switch (i) {
                case 1:
                    System.out.println("informe a quantidade: ");
                    double quantidade = sc.nextDouble();
                    conta.sacar(quantidade);
                    break;
                case 2:
                    System.out.println("informe a quantidade: ");
                    double quantidade2 = sc.nextDouble();
                    conta.depositar(quantidade2);
                    break;
                case 3:
                    System.out.println("O seu saldo é: " + conta.getSaldo());
                    break;
                case 4:
                    conta.imprimir();
                    break;
                case 5:
                    System.out.println("finalizando.............");
                    break;
                default:
                    System.out.println("Opção invalida, thank you!");
                    break;
            }
        }
    }
}

