package imoveis;

public class Apartamento extends Casa {
	int andar;
	int numApartamento;
	float codominio;
	
	public Apartamento(int numQuartos,String rua,String bairro,String cidade,String estado,int numCasa,int vagasCaragem,boolean venda_aluga,float valor,int andar,int numApartamento,float codominio,float area){
		super(numQuartos,rua,bairro,cidade,estado,numCasa,vagasCaragem,venda_aluga,valor,area);
		this.andar=andar;
		this.numApartamento=numApartamento;
		this.codominio=codominio;
	}
	
	

}
