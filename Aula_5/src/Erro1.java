public class Erro1 {
    public static void main(String[] args) {
        //Acessando um elemento fora do índice de um array
        int [] numeros = {1,2,3};
        System.out.println(numeros[3]); //ArrayIndexOutOfBoundsException
    }
}
