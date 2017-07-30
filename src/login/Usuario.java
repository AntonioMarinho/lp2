package login;
import imoveis.*;


import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

	private String nome;
	private int data_nasc;
	private int dia_nasc;
	private int mes_nasc;
	private String cpf;
	private String login;
	private String senha;
	ArrayList<Imovel> imoveis = new ArrayList<Imovel>(); 
	//ArrayList<imovel> pontosComercias;
	//ArrayList<Apartamento> apartamentos;
	//ArrayList<Casa> casas;
	
	
	
	public Usuario(String nome,String cpf,int data_nasc,int dia_nasc,int mes_nasc,String login,String senha){
		if((2017-data_nasc)>18){
			this.nome = nome;
			this.data_nasc = data_nasc;
			this.dia_nasc = data_nasc;
			this.mes_nasc = data_nasc;
			this.cpf = cpf;
			this.login = login;
			this.senha = senha;
		}else{
			System.out.println("Insira um Usuario de maior Por Favor");
		}
		
	}
	
	public String getSenha() {
		return senha;
	}
	
	public String getLogin() {
		return login;
	}

	public String getNome() {
		return nome;
	}

	public int getData_nasc() {
		return data_nasc;
	}

	public String getCpf() {
		return cpf;
	}
	
	
	public void AlugarImovel(Imovel a){
		//add historico
		imoveis.remove(a);
	}
	
	public void Comprar(Imovel a){
		
		//add historico
		imoveis.remove(a);
	}
	
	public  void preencherPComercial(){
		Scanner input = new Scanner(System.in);
		System.out.println("Insira as informações do Imovel");
		System.out.println("Insira o estado: ");
		String estado = input.next();
		System.out.println("Insira a cidade ");
		String cidade = input.next();
		System.out.println("Insira o bairro: ");
		String bairro = input.next();
		System.out.println("Insira a rua : ");
		String rua = input.next();
		System.out.println("Insira o numero da casa: ");
		int num = input.nextInt();
		System.out.println("Insira o area em m²(metros quadrados): ");
		int area = input.nextInt();
		System.out.println("Quantas vagas para estacionar tem:");
		int vagasCaragem = input.nextInt();
		float valor;
		do{
		System.out.println("Digiti 1 para colocar a venda e 2 para colocar para alugar:");	
		valor = input.nextInt();
		if(valor!=1 || valor!=2){
			System.out.println("NUMERO INVALIDO, digite novamente");
		}
		}while(valor!=1 || valor!=2);
		
		boolean venda_aluga;// se true, esta em venda se false esta para alugar
		
		if(valor==1){
			venda_aluga=true;
			System.out.println("Digite o valor da venda do imovel");
			valor = input.nextFloat();
		}else{
			venda_aluga=false;
			System.out.println("Digite o valor do aluguel do imovel");
			valor = input.nextFloat();
		}
		Imovel aux = new Imovel(rua,bairro,cidade,estado,num,vagasCaragem,venda_aluga,valor,area);
		imoveis.add(aux);
		
	}

	public  void preencherCasa(){
		Scanner input = new Scanner(System.in);
		System.out.println("Insira as informações do Imovel");
		System.out.println("Insira o estado: ");
		String estado = input.next();
		System.out.println("Insira a cidade ");
		String cidade = input.next();
		System.out.println("Insira o bairro: ");
		String bairro = input.next();
		System.out.println("Insira a rua : ");
		String rua = input.next();
		System.out.println("Insira o numero da casa: ");
		int num = input.nextInt();
		System.out.println("Insira o area em m²(metros quadrados): ");
		int area = input.nextInt();
		System.out.println("Quantas vagas para estacionar tem:");
		int vagasCaragem = input.nextInt();
		float valor;
		do{
		System.out.println("Digiti 1 para colocar a venda e 2 para colocar para alugar:");	
		valor = input.nextInt();
		if(valor!=1 || valor!=2){
			System.out.println("NUMERO INVALIDO, digite novamente");
		}
		}while(valor!=1 || valor!=2);
		
		boolean venda_aluga;// se true, esta em venda se false esta para alugar
		
		if(valor==1){
			venda_aluga=true;
			System.out.println("Digite o valor da venda do imovel");
			valor = input.nextFloat();
		}else{
			venda_aluga=false;
			System.out.println("Digite o valor do aluguel do imovel");
			valor = input.nextFloat();
		}
		System.out.println("Insira o numero de quartos: ");
		int numQ = input.nextInt();
		Casa aux = new Casa(numQ,rua,bairro,cidade,estado,num,vagasCaragem,venda_aluga,valor,area);
		imoveis.add(aux);
		
	}
		
	public void preencherApartamento(){
		Scanner input = new Scanner(System.in);
		System.out.println("Insira as informações do Imovel");
		System.out.println("Insira o estado: ");
		String estado = input.next();
		System.out.println("Insira a cidade ");
		String cidade = input.next();
		System.out.println("Insira o bairro: ");
		String bairro = input.next();
		System.out.println("Insira a rua : ");
		String rua = input.next();
		System.out.println("Insira o numero da casa: ");
		int num = input.nextInt();
		System.out.println("Insira o area em m²(metros quadrados): ");
		int area = input.nextInt();
		System.out.println("Quantas vagas para estacionar tem:");
		int vagasCaragem = input.nextInt();
		float valor;
		do{
		System.out.println("Digiti 1 para colocar a venda e 2 para colocar para alugar:");	
		valor = input.nextInt();
		if(valor!=1 || valor!=2){
			System.out.println("NUMERO INVALIDO, digite novamente");
		}
		}while(valor!=1 || valor!=2);
		
		boolean venda_aluga;// se true, esta em venda se false esta para alugar
		
		if(valor==1){
			venda_aluga=true;
			System.out.println("Digite o valor da venda do imovel");
			valor = input.nextFloat();
		}else{
			venda_aluga=false;
			System.out.println("Digite o valor do aluguel do imovel");
			valor = input.nextFloat();
		}
		System.out.println("Insira o numero de quartos: ");
		int numQ = input.nextInt();
		System.out.println("Insira qual o andar apartemento: ");
		int andar = input.nextInt();
		System.out.println("Insira qual o numero do apartemento: ");
		int nAp = input.nextInt();
		System.out.println("Insira qual o valor do condominio do predio: ");
		float codominio = input.nextFloat();	
		
		Apartamento aux = new Apartamento(numQ,rua,bairro,cidade,estado,num,vagasCaragem,venda_aluga,valor,andar,nAp,codominio,area);
		imoveis.add(aux);
	}
	
}