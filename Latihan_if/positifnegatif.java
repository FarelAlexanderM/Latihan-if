import java.util.Scanner;

public class positifnegatif {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan angka: ");
        int a = scanner.nextInt();
        
        if (a == 0) {
            System.out.println("Bilangan Nol");
        }
        else if (a < 0) {
            System.out.println("Bilangan negatif");
        }
        else if (a > 0) {
            System.out.println("Bilangan positif");
        }
       
    }
}