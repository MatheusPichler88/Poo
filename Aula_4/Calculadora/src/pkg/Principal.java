package pkg;

public class Principal {

	public static void main(String[] args) {
		Calculadora cal = new Calculadora();
		cal.n1 = 7.14;
		cal.n2 = 8.23;
		
		double retorno;
		retorno = cal.somar();
		System.out.println("Resultado da soma:" +retorno);
		
		System.out.println("Resultado da soma2: "+cal.somar());

		
		cal.multiplicar();
		cal.dividir(4.17, 5.43);
		
		retorno = cal.subtrair(5.44, 2.17);
		System.out.println("Resultado da subtraçao: "+retorno);
	}

}
