public class Correcao_2 {
    public static void main(String[] args) {
        //Exemplo 2: Divisao por zero
        int a = 10;
        int b = 0;
            try {
                System.out.println(a/b); //ArithmeticException
            }
            catch(ArithmeticException e){
                System.out.println("Exceção: " + e.getMessage());
        }
    }
}
