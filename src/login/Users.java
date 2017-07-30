/*package login;

import java.util.ArrayList;
import java.util.Scanner;

import main.Cadastro;
import main.Main_Login;

public abstract class Users {

	ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario> ();
	
	private void telaInicial(){
		Scanner input = new Scanner(System.in);
		System.out.println("Qual Opção voce deseja realizar?");
		System.out.println("1 - Fazer login");
		System.out.println("2 - Fazer cadastro de novo Usuário");
		int esc = input.nextInt();
		if(esc==1){
			usuarios.login();
		}else{
			if(esc==2){
			Main_Login main = new Main_Login();
			}else{
				System.out.println("Opção invalida");
				telaInicial();
			}
			
		}
		
	}
	
	private static void telaUsuario(){
		Scanner input = new Scanner(System.in);
		System.out.println("Qual Opção voce deseja realizar?");
		System.out.println("1 - Comprar imovel");
		System.out.println("2 - Vender imovel");
		System.out.println("3 - Alugar imovel proprio(Locador)");
		System.out.println("4 - Alugar imoveis terceiros(inquilino)");
		System.out.println("5 - Historicos operações");
		System.out.println("6 - sair");
		int esc = input.nextInt();
		switch(esc){
		case 1:
			busca(true);
			break;
		case 2:
			do{
				System.out.println("Qual o tipo do imovel:");
				System.out.println("1 - Casa");
				System.out.println("2 - Apartamento");
				System.out.println("3 - Ponto Comercial");
				esc = input.nextInt();
				if(esc!=1 || esc!=2 || esc!=3){
					System.out.println("Opção invalida");
				}
				}while(esc!=1 || esc!=2 || esc!=3);
				cadastroImovel(esc,true);
			break;
		case 3:
			do{
				System.out.println("Qual o tipo do imovel:");
				System.out.println("1 - Casa");
				System.out.println("2 - Apartamento");
				System.out.println("3 - Ponto Comercial");
				esc = input.nextInt();
				if(esc!=1 || esc!=2 || esc!=3){
					System.out.println("Opção invalida");
				}
			}while(esc!=1 || esc!=2 || esc!=3);
			cadastroImovel(esc,false);
			break;
		case 4:
			busca(false);
			break;
		case 5:
			//historico
			break;
		case 6:
			telaInicial();
			break;
		default:
			System.out.println("Opção invalida");
			telaUsuario();
			break;
			}
		}
		
	private static void busca(boolean venda) {
		
	}

	
	private static void cadastroImovel(int Tipo, boolean venda){
		Scanner input = new Scanner(System.in);
				
		System.out.println("Insira seu Dia de nascimento: ");
		int dia_nasc = input.nextInt();
		System.out.println("Insira o Mes de nascimento: ");
		int mes_nasc = input.nextInt();
		System.out.println("Insira a Data de nascimento: ");
		int data_nasc = input.nextInt();
		System.out.println("Insira seu Cpf: ");
		int cpf = input.nextInt();
	}

	private static void preencherCasa(boolean venda){
		Scanner input = new Scanner(System.in);
		System.out.println("Insira as informações do Imovel");
		System.out.println("Insira a rua : ");
		String rua = input.next();
		System.out.println("Insira o bairro: ");
		String bairro = input.next();
		System.out.println("Insira o numero da casa: ");
		int num = input.nextInt();
		System.out.println("Insira a cidade ");
		String cidade = input.next();
		System.out.println("Insira o estado: ");
		String estado = input.next();
		System.out.println("Insira o numero de quartos: ");
		int numQ = input.nextInt();
		if(venda){
			System.out.println("Insira o valor da venda: ");
			float valorvenda = input.nextFloat();
			float valoraluguel = 0;
		}else{
			System.out.println("Insira o valor da venda: ");
			float valoraluguel = input.nextFloat();
			float valorVenda=  0 ;
		}
	}
		
		private static void preencherApartamento(boolean venda){
			Scanner input = new Scanner(System.in);
			System.out.println("Insira as informações do Imovel");
			System.out.println("Insira a rua : ");
			String rua = input.next();
			System.out.println("Insira o bairro: ");
			String bairro = input.next();
			System.out.println("Insira o numero do Predio: ");
			int num = input.nextInt();
			System.out.println("Insira o numero do apartamento: ");
			int numA = input.nextInt();
			System.out.println("Insira o Andar que fica o Apartamento: ");
			int andar = input.nextInt();
			System.out.println("Insira a cidade ");
			String cidade = input.next();
			System.out.println("Insira o estado: ");
			String estado = input.next();
			System.out.println("Insira o numero de quartos: ");
			int numQ = input.nextInt();
			
			if(venda){
				System.out.println("Insira o valor da venda: ");
				float valorvenda = input.nextFloat();
				float valoraluguel = 0;
			}else{
				System.out.println("Insira o valor da venda: ");
				float valoraluguel = input.nextFloat();
				float valorVenda= 0;
			}
				
		}
		public void adicionarUsuario(Usuario user){
			listaUsuarios.add(user);
		}
		
		public boolean verificarCpf(int cpf){
			for (Usuario cadastro : listaUsuarios) {
				if(cpf==cadastro.getCpf()){
					return true;
				}
			}
			return false;
		}
		
		public boolean verificarNick(String login){
			for (Usuario cadastro : listaUsuarios) {
				if(login.equals(cadastro.getLogin())){
					return true;
				}
			}
			return false;
		}
		
		public boolean verificarLogin(String login, int senha){
			for (Cadastro cadastro : users) {
				if(login.equals(cadastro.getLogin()) && senha==cadastro.getSenha()){
					return true;
				}
			}
			return false;
		}
		
	}
}	
*/


	
	
	
	
