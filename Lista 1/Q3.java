import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Q3 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        String nome;
        String sexo;
        String dataNascimento;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite seu sexo: ");
        sexo = sc.nextLine();
        System.out.println("Digite o data de nascimento: ");
        dataNascimento = sc.nextLine();

        Date d = new SimpleDateFormat("ddMMyyyy").parse(dataNascimento);
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("\n");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Data de nascimento: " + dateFormat.format(d));
    }
}
