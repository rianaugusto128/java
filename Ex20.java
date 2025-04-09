import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count0a100 = 0, count101a200 = 0, countMaior200 = 0;
        
        System.out.println("Digite 20 números:");
        
        for (int i = 0; i < 20; i++) {
            int num = scanner.nextInt();
            
            if (num >= 0 && num <= 100) {
                count0a100++;
            } else if (num >= 101 && num <= 200) {
                count101a200++;
            } else if (num > 200) {
                countMaior200++;
            }
        }
        
        scanner.close();
        
        System.out.println("Quantidade de números entre 0 e 100: " + count0a100);
        System.out.println("Quantidade de números entre 101 e 200: " + count101a200);
        System.out.println("Quantidade de números maiores que 200: " + countMaior200);
    }
}
    
    