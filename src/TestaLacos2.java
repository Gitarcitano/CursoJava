public class TestaLacos2 {
    public static void main(String[] args) {

        for(int linha = 0; linha <= 10; linha++){
            for (int contador = 0; contador <= 10; contador++){
                System.out.print(linha * contador);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
