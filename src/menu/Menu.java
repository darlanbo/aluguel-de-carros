package menu;

public class Menu {

	
	
	public static void bemVindo() {
		System.out.println("======================");
		System.out.println("Bem vindo ao sistema de aluguel de carros");
		System.out.println("Para come�ar, digite seu cpf: ");
		System.out.println("Para sair, digite 0");
	}
	
	
	public static void opcoesCliente() {
		System.out.println();
		System.out.println("Digite o n�mero referente a sua op��o");
		System.out.println("1 - Alugar um ve�culo");
		System.out.println("2 - Devolver um ve�culo");
	}
	
	
	public static void opcoesAdmin() {
		System.out.println();
		System.out.println("Digite o n�mero referente a sua op��o");
		System.out.println("1 - Cadastrar um cliente");
		System.out.println("2 - Remover um cliente");
		System.out.println("3 - Cadastrar um ve�culo");
		System.out.println("4 - Remover um ve�culo");
		System.out.println("5 - Cadastrar um vendedor");
		System.out.println("6 - Remover um vendedor");
	}
	
	public static void opcoesVendedor() {
		System.out.println();
		System.out.println("Digite o n�mero referente a sua op��o");
		System.out.println("1 - Ver carros alugados");
		System.out.println("2 - Ver seu sal�rio + comiss�o atual");
		
	}
	
}
