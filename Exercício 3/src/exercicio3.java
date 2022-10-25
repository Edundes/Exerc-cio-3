import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = 0;
        int	pos = 0;
        System.out.println("Informe 10 números: ");
        for (int i = 1; i <= 10; i++) {
            int num = entrada.nextInt();
            if (maior > num) {
                maior = maior;
                pos = pos;
            } else {
                pos = i;
                maior = num;
            }
        }
        System.out.print("O maior número é o: "+ maior + " e a posição dele é: " + pos);
    }
}
