public class Main {

	public static void main(String[] args){

		Marca Nike = new Marca("Nike");
		Marca Adidas = new Marca("Adidas");
		Marca Puma = new Marca("Puma");
		Marca Nb = new Marca("Nb");
		Marca Vans = new Marca("Vans");
		

		Tenis AirMax = new Tenis(1, "AirMax");
		Tenis Yeezy = new Tenis(2, "Yeezy");
		Tenis RsFast = new Tenis(3, "RsFast");
		Tenis ZoneXTMetal = new Tenis(4, "ZoneXTMetal");
		Tenis OldSkool = new Tenis(5, "OldSkool");


		salvarMarca(Nike);
		salvarMarca(Adidas);
		salvarMarca(Puma);
		salvarMarca(Nb);
		salvarMarca(Vans);
		salvarTenis(AirMax);
		salvarTenis(Yeezy);
		salvarTenis(RsFast);
		salvarTenis(ZoneXTMetal);
		salvarTenis(OldSkool);

		argo.setNome("Yeezy Bred 350V2");
		atualizaBanco(Yeezy);

		argo.setNome("AirMax 97 White");
		atualizaBanco(AirMax);

		deletaTenis(2, 1);

		visualizaDados("marca", "id", "nome");
	}
}
public class Marca {
	
	public String nome;

	public Marca(String nome) {
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
}
public class Tenis {
	
	public int marca_id;
	public String nome;

	public Tenis(int marca_id, String nome) {
		this.marca_id = marca_id;
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	pubic int getMarcaId(){
		return marca_id;
	}

	public void setMarcaId(int marca_id){
		this.marca_id = marca_id;
	}	
}
