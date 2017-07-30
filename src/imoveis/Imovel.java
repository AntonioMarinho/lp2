package imoveis;

public class Imovel {
	
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private int numCasa;
	private float area;
	private int vagasCaragem;
	private boolean venda_aluga;// se true, esta em venda se false esta para alugar
	private float valor;// venda /aluguel
	

	public Imovel(String rua,String bairro,String cidade,String estado,int numCasa,int vagasCaragem,boolean venda_aluga,float valor,float area){
		this.rua=rua;
		this.bairro=bairro;
		this.cidade=cidade;
		this.estado=estado;
		this.numCasa=numCasa;
		this.vagasCaragem=vagasCaragem;
		this.venda_aluga=venda_aluga;
		this.valor=valor;
		this.area=area;
	}
	
	public String getRua(){
		return rua;
	}
	public String getBairro(){
		return bairro;
	}
	public String getCidade(){
		return cidade;
	}
	public String getEstado(){
		return estado;
	}
	

}
