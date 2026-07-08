public class Programa {
    public static void main(String[] args) {
        int numero = 20000;
        int numero2 = 500000;
        int soma = somar(numero, numero2);
        System.out.println("A soma de " + numero + " e " + numero2 + " é: " + soma);

        System.out.println("terminou");


    }

    //metodo de somar
    public static int somar(int a, int b) {
        return a + b;
    }


}
