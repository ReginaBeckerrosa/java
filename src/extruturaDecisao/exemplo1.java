package extruturaDecisao;

import java.util.Scanner;

public class  exemplo1 {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);

        System.out.print("Digite o seu Salario: ");

        double salario = Double.parseDouble(Leitor.nextLine());

        if (salario < 1000) {
            double salarioReajustado = salario * 1.1;
            System.out.println(salarioReajustado);
        } else {
            System.out.println("salario sem Ajuste");
        }

    }

}



