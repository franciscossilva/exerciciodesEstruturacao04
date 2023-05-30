import java.util.Scanner;

public class AumentoSalarial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário do colaborador: ");
        double salario = input.nextDouble();

        double aumento;
        if (salario <= 280) {
            aumento = salario * 0.2;
        } else if (salario <= 700) {
            aumento = salario * 0.15;
        } else if (salario <= 1500) {
            aumento = salario * 0.1;
        } else {
            aumento = salario * 0.05;
        }

        double novoSalario = salario + aumento;

        System.out.println("Salário antes do reajuste: R$ " + salario);
        System.out.println("Percentual de aumento aplicado: " + (int)(aumento/salario*100) + "%");
        System.out.println("Aumento: R$ " + aumento);
        System.out.println("Nsalário após aumento: R$ " + novoSalario);
    }
}