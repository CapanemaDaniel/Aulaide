public class Programa {
    public static void main(String[] args) {
        int numero = 10;
        int numero2 = 5;
        int soma = somar(numero, numero2);
        System.out.println("A soma de " + numero + " e " + numero2 + " é: " + soma);


    }

    public static int somar(int a, int b) {
        return a + b;
    }


}
