import java.util.Scanner;

public class barang {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan kode barang: ");
        int a = scanner.nextInt();
        
        if (a == 1) {
            System.out.println("Pulpen");
        }
        else if (a == 2) {
            System.out.println("Buku");
        }
        else if (a == 3){
            System.out.println("Pensil");
        }
       
    }
}
