import java.util.Scanner;
public class Habitantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 10;
        int min = 4;
        int temp[] = new int[12];
        int i = 0;
        int dados = 0;
        int soma = 0;
        while (i < 12) {
            System.out.println("Digite a "+ (i + 1) + "º temperatura");
            dados = scanner.nextInt();
            if (dados > min && dados < max) {
                temp[i] = dados;
                soma += dados;
                i++;
            }
            else {
                System.out.println("Temperatura invalida, digite novamente");
            }

        }
        System.out.println("a media e de: " + soma / 12.0);

    }
    
}
