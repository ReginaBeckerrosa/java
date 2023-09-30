package extruturaepeticao;

import java.awt.*;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String usuario;
        String senha;
        System.out.println("Digite o nome do usuario: ");
        usuario = leitor.nextLine();

        System.out.println("Digite a sua senha: ");
        senha = leitor.nextLine();

        if (!usuario.equals("Admi && Senha123")) ;
        {
            System.out.println("Usuario incorreto");

        }
     else if (usuario.equals("Admin && Senha123")) ;
        {
            System.out.println("Usuario incorreto");

        }
    }
}

