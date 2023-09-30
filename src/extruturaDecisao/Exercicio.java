package extruturaDecisao;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public interface Exercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");

        double numero = leitor.nextDouble();
        System.out.println();

        if (numero > 0) {
        }
        else if (numero == 0){
            System.out.println("Neutro");
        }
        else{
            System.out.println("Negativo");
        }
    }
}

