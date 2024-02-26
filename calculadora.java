import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double num_1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double num_2 = scanner.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char c = scanner.next().charAt(0);
        scanner.close();
        double result;

        switch (c) {
            case '+':
                result = num_1 + num_2;
                break;
            case '-':
                result = num_1 - num_2;
                break;
            case '*':
                result = num_1 * num_2;
                break;
            case '/':
                result = num_1 / num_2;
                break;
            default:
                System.out.println("Inválido!!!");
                return;
        }

        System.out.println(num_1+" "+c+" "+num_2+" = "+result);

    }
}