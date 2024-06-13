import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception {
		// TODO: Conhecer e importar a classe scanner
		Scanner scan = new Scanner(System.in);

		// Declarar variáveis
		int numero = 0;
		String agencia, nomeCliente = "";
		double saldo = 0.0;

		// Exibir as mensagens para nosso usuário e obter os valores digitados pelo
		// terminal
		System.out.println("Por favor, digite o número da sua conta: ");
		numero = scan.nextInt();

		System.out.println("Agora, digite o número da sua agencia: ");
		scan.nextLine();
		agencia = scan.nextLine();

		System.out.println("Por favor,informe seu nome: ");
		nomeCliente = scan.nextLine();

		System.out.println("Por favor, digite o saldo da conta: ");
		saldo = Double.parseDouble(scan.nextLine());

		// Exibir a mensagem conta criada
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: "+ agencia + ", conta: " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");

	}
}
