package pkg;

public class Carro {
	public String marca;
	public String modelo;

	
	public Carro() {
		
	}
	
	public Carro(String modeloCarro) {
		modelo = modeloCarro;
		
	}
	public Carro (String modeloCarro, String marcaCarro) {
	marca = marcaCarro;
	modelo = modeloCarro;
	}
	
		
	public void exibirDados() {
		
		System.out.println("Marca:"+marca);
		System.out.println("Modelo:"+modelo);
	}
	

}
