import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura dos dados do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita e lê o número da conta
        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a linha nova deixada pelo nextInt
        
        // Solicita e lê o número da agência
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();
        
        // Solicita e lê o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.nextLine();
        
        // Solicita e lê o saldo da conta
        System.out.println("Por favor, digite o saldo da Conta !");
        double saldo = scanner.nextDouble();
        
        // Exibe a mensagem final com as informações fornecidas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fecha o scanner
        scanner.close();
    }
}
