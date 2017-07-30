package menus;
import java.util.ArrayList;
import java.util.Scanner;

import login.Usuario;

public class menu {

		
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario> ();
	private int atual;
	
	//Scanner input = new Scanner(System.in);
	

	public void telaInicial() throws UserNotEException{
		Scanner input = new Scanner(System.in);
		System.out.println("Qual Opção voce deseja realizar?");
		System.out.println("1 - Fazer login");
		System.out.println("2 - Fazer cadastro de novo Usuário");
		int esc = input.nextInt();
		if(esc==1){
			System.out.println("\n-----------------------------------------------------------------------------------\n");
			System.out.println("Informe seu nome para login:");
			String login = input.next();
			System.out.println("Informe sua senha:");
			String senha = input.next();
			login(login,senha);
		}else{
			if(esc==2){
				cadastrar();
			}else{
				System.out.println("Opção invalida");
				telaInicial();
			}
			
		}
		
	}
	
	
	private void cadastrar() throws UserNotEException {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe seu nome completo:");
		String nome = input.nextLine();
		System.out.println("Informe seu CPF(apenas numeros):");
		String cpf = input.nextLine();
		System.out.println("Informe seu nome para login:");
		String login = input.nextLine();
		System.out.println("Informe sua senha:");
		String senha = input.nextLine();
		System.out.println("Informe seu ano de nascimento:");
		int anoNasc = input.nextInt();
		System.out.println("Informe seu mes de nascimento:");
		int mesNasc = input.nextInt();
		System.out.println("Informe seu dia de nascimento:");
		int diaNasc = input.nextInt();
		Usuario aux = new Usuario(nome,cpf,anoNasc,mesNasc,diaNasc,login,senha);
		usuarios.add(aux);
		telaInicial();
	}


	private void login(String nome, String senha) throws UserNotEException{
			for(int i=0;i<usuarios.size();i++){
				if(nome.equals(usuarios.get(i).getLogin()) && senha.equals(usuarios.get(i).getSenha())){
					atual=i;
					telaUsuario(atual);
				}
			}
			
			throw new UserNotEException();
			
	}

	private void telaUsuario(int logado) throws UserNotEException{
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
				//cadastroImovel(esc,true);
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
				if(esc==1){
					usuarios.get(logado).preencherCasa();
				}else{
					if(esc==2){
						usuarios.get(logado).preencherApartamento();
					}else{
						usuarios.get(logado).preencherPComercial();
					}
				}
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
			telaUsuario(logado);
			break;
			}
		}
		
	private  void busca(boolean venda) {
		
	}


	private boolean loginValido(String nome) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
