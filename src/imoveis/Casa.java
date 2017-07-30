package imoveis;

public class Casa extends Imovel {
	private int numQuartos;
	public Casa(int numQuartos,String rua,String bairro,String cidade,String estado,int numCasa,int vagasCaragem,boolean venda_aluga,float valor,float area){
		super(rua,bairro,cidade,estado,numCasa,vagasCaragem,venda_aluga,valor,area);
		this.numQuartos=numQuartos;
	}
	
}
