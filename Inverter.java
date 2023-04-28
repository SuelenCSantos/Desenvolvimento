import java.util.Scanner;

public class Inveter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
    
        String palavra = input.nextLine(), invertida = "";

        for(int i = palavra.toCharArray().length - 1; i >= 0; i--){
            invertida += palavra.toCharArray()[i];
        }

        System.out.println("Palavra invertida: " + invertida);
        
    }
}
