package OO;

public class Animal {
	private String raca = "Pastor-Alemão";
	private String nomeCintifico = "Canis lupus familiaris";
	private String nomePopular = "Alfredo";
	private int quantidade = 0;
	

	
	//metodos
	public Animal(String nomeCintifico, String nomePopular, String raca){
		this.nomeCintifico = nomeCintifico;
		this.nomePopular = nomePopular;
		this.raca = raca;
	}
//	public interface filtro(String nomeCintifico, String nomePopular, String raca) {	
//	}
	
	//Get
	public String getNomeCintifico() {
		 return nomeCintifico;
		 }
	public String getNomePopular() {
		 return nomePopular;
		 }
	public String getRaca() {
		 return raca;
		 }	
	public int getQuantidade(int quantidade) {
		int cont=1;
		cont++;
		 return quantidade;
		 }
	@Override
	public String toString(){
		return "Nome do Aninal: " + this.nomePopular+"\n" +
               "Raça: " + this.raca+"\n"+
               "Nome cientifico: " + this.nomeCintifico+"\n";
    }
		
		
	
	
	
}
