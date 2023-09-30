package extruturaepeticao;

public class Exemplo3 {
    public static void main(String[] args)throws InterruptedException {
        String[] listaCarros = {"Up", "Fusca", "Taus", "logus"};
        for (String cadaCarro:listaCarros  ) {
            System.out.println(cadaCarro);
            Thread.sleep(1000);
        }

    }
}
