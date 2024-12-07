import java.util.Scanner;
public class Tugas {
    static int Rekursif(int n, int[] nilai){
        if(n == 0){
            return 0;
        } else{
            return nilai[n-1] + Rekursif(n-1, nilai);
        }
    }
    static int Interatif(int n, int[] nilai){
        int jumlah = 0;
        for (int i = 0; i < n; i++) {
            jumlah += nilai[i];
        }
        return jumlah;
    }
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int n;
        
        System.out.print("Masukkan jumlah angka yang akan dihitung : ");
        n = input21.nextInt();
        int[] nilai = new int[n];

        for (int i = n-1; i >=0 ; i--) {
            System.out.print("Masukkan angka ke-" + (i+1) + " : ");
            nilai[i] = input21.nextInt();
        }
        System.out.println("Total nilai rekursif: " + Rekursif(n, nilai));
        System.out.println("Total nilai iteratif: " + Interatif(n, nilai));
    }
}
