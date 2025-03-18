package pkg;
import java.util.Scanner;

public class Carro_Construtor {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ma,mo;
		System.out.println("Digite a marca do carro: ");
		ma = sc.nextLine();
		System.out.println("Digite o modelo do carro:");
		mo = sc.nextLine();
		Carro c = new Carro(ma,mo);
		System.out.println("Carro 1");
		c.exibirDados();
		
		System.out.println("Carro 2");
		Carro c2 = new Carro("Saveiro");
		c2.marca = "Vw";
		c2.exibirDados();
				
		Carro c3 = new Carro();
		c3.marca = "Fiat";
		c3.modelo = "Uno";
		c3.exibirDados();
	}

}
