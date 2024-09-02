import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = new Random().nextInt(5);
        Scanner sc = new Scanner(System.in);
        int tentativas = 0;
        System.out.println("JOGO DO ADIVINHA\nVOCÊ TEM 10 CHANCES PARA ACERTAR\n");

        while (true){
            System.out.println("Digite um numero entre 0 e 100");
            int numeroDigitado = sc.nextInt();

            tentativas++;

            if (tentativas == 10 && numeroDigitado != num){
                System.out.println("Acabaram as suas tentativas! O numero gerado era: " + num);
                break;
            }

            if (numeroDigitado < 0 || numeroDigitado > 100){
                System.out.println("O numero deve ser entre 0 e 100");
            } else if (numeroDigitado < num) {
            System.out.println("O número digitado é menor que o número gerado.");
            } else {
            System.out.println("O número digitado é maior que o número gerado.");
            }

            if(numeroDigitado == num){
                System.out.printf("numero encotrado! você digitou: %d%nE o numero do adivinha era: %d ", numeroDigitado,num);
                break;
            }


        }

    }
}