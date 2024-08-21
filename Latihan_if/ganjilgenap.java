import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan angka: ");
        int a = scanner.nextInt();
        
        if (a == 0) {
            System.out.println("Bilangan Nol");
        }
        else if (a%2 > 0) {
            System.out.println("Bilangan ganjil");
        }
        else {
            System.out.println("Bilangan genap");
        }
       
    }
}
