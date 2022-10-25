import java.util.Scanner;
import java.io.IOException;

public class exercicio4 {
	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);
		
		while (true) {

		System.out.println("Calculadora científica");
		System.out.print("Digite um número: ");
		double num1 = entrada.nextDouble();
		double num2 = 0;
		System.out.println("Escolha operação a ser realizada \n"
				+ " 1 -> Soma\n"
				+ " 2 -> Subtração\n"
				+ " 3 -> Multiplicação\n"
				+ " 4 -> Divisão\n"
				+ " 5 -> Resto\n"
				+ " 6 -> Raiz Quadrada\n"
				+ " 7 -> Potência\n"
				+ " 8 -> Seno\n"
				+ " 9 -> Cosseno\n"
				+ " 10 -> Tangente\n"
				+ "Caso queira encerrar o programa, digite 0");
		int opcao = entrada.nextInt();
		if ((opcao == 1) || (opcao == 2) || (opcao == 3) || (opcao == 4) || (opcao == 5) || (opcao == 7)) {
			System.out.print("Digite outro número: ");
			num2 = entrada.nextDouble();
		}
		
		switch (opcao) {
		case 1:
			double result =  num1 + num2;
			System.out.printf("%.2f + %.2f = %.2f\n",num1, num2, result);
			break;
		case 2:
			result = num1 - num2;
			System.out.printf("%.2f - %.2f = %.2f\n",num1, num2, result);
			break;
		case 3:
			result = num1 * num2;
			System.out.printf("%.2f * %.2f = %.2f\n",num1, num2, result);
			break;
		case 4:
			result = num1 / num2;
			System.out.printf("%.2f / %.2f = %.2f\n",num1, num2, result);
			break;
		case 5:
			result = num1 % num2;
			System.out.printf("%.2f mod %.2f = %.2f\n",num1, num2, result);
			break;
		case 6:
			result = Math.sqrt(num1);
			System.out.printf("A raiz quadrada de %.2f = %.2f\n",num1, result);
			break;
		case 7:
			result = Math.pow(num1,num2);
			System.out.printf("A potência de %.2f a %.2f = %.2f\n",num1, num2, result);
			break;
		case 8:
			result = Math.sin(Math.toRadians(num1));
			System.out.printf("O seno de %.2f = %.2f\n",num1, result);
			break;
		case 9:
			result = Math.cos(Math.toRadians(num1));
			System.out.printf("O cosseno de %.2f = %.2f\n",num1, result);
			break;
		case 10:
			result = Math.tan(Math.toRadians(num1));
			System.out.printf("A tangente de %.2f = %.2f\n",num1, result);
			break;
		case 0:
			System.out.println("Programa encerrado.");
			break;
		default:
			System.out.println("O número escolhido é inválido! Digite um número de 0 a 10.");
		}
		
		if (opcao == 0) {
			break;
		}
		
		}
	}
}