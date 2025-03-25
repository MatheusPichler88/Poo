public class Correcao_3 {
    public static void main(String[] args) {
        //Exemplo 3: tentando converter uma String em um número
        String numero = "abc";
        try {
            int num = Integer.parseInt(numero);
            System.out.println("Convertido: " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("Exceção de formato: "+e.toString());
        }
        catch (Exception e) {
            System.out.println("Exceção: "+e.toString());
        }
        System.out.println("O sistema continua");
    }
}
