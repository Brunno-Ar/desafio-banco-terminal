import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor insira os dados da conta");
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        System.out.println("Digite a agencia:");
        String numeroAgencia = scanner.nextLine();
        System.out.println("Digite o numero da conta:");
        int numeroContaBanco = scanner.nextInt();
        System.out.println("Digite o saldo da conta:");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +
                " e, conta " +  numeroContaBanco + " e seu saldo " + saldoConta + " já está disponível para saque");
    }
}
