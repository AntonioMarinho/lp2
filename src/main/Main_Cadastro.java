/*package main;

import java.util.Scanner;

import login.Cadastro;
import login.Users;

public class Main_Cadastro extends Users{
	Scanner input = new Scanner(System.in);
	
	public Main_Cadastro(int num){
		if(!verificarCpf(1)){
			Cadastro cadas = new Cadastro("admin", 1997, 1, 1, 1, "admin", 1);
			adicionarUsuario(cadas);
		}
		if(num==1){
			System.out.println("Insira o Login:");
			String log = input.next();
			System.out.println("Insira a senha:");
			int sen = input.nextInt();
			if(verificarLogin(log, sen)){
			}else{
				System.out.println("Login ou senha incorreto.");
			}
		}else{
			System.out.println("Insira seu nome: ");
			String nome = input.next();
			System.out.println("Insira seu Dia de nascimento: ");
			int dia_nasc = input.nextInt();
			System.out.println("Insira o Mes de nascimento: ");
			int mes_nasc = input.nextInt();
			System.out.println("Insira a Data de nascimento: ");
			int data_nasc = input.nextInt();
			System.out.println("Insira seu Cpf: ");
			int cpf = input.nextInt();
			if(verificarCpf(cpf)){
				System.out.println("Esse CPF ja foi cadastrado");
			}else{
				System.out.println("Insira seu Login: ");
				String login = input.next();
				if(verificarNick(login)){
					while(verificarNick(login)){
						System.out.println("Esse Login ja foi cadastrado");
						System.out.println("Insira Um novo login");
						login = input.next();
					}
				}else{
					System.out.println("Insira uma senha numerica: ");
					int senha1 = input.nextInt();
					System.out.println("Por Favor Repita a senha: ");
					int senha2 = input.nextInt();
					while(senha1!=senha2){
						System.out.println("Por favor Digite senhas iguais.");
						System.out.println("Insira uma senha numerica: ");
						senha1 = input.nextInt();
						System.out.println("Por Favor Repita a senha: ");
						senha2 = input.nextInt();
					}
					Cadastro cadas = new Cadastro(nome, dia_nasc, mes_nasc, data_nasc, cpf, login, senha1);
					adicionarUsuario(cadas);
					System.out.println("cadastrado com sucesso");
					Main a = new Main();
				}
			}
		}		
	}
}
*/