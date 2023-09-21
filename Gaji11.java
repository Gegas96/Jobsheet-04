import java.util.Scanner;

public class Gaji11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk, gaji, potGaji, totGaji;

        System.out.println("Masukkan jumlah masuk anda: ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan jumlah tidak masuk anda: ");
        jmlTdkMasuk = input.nextInt();
        System.out.println("Masukkan gaji: ");
        gaji = input.nextInt();
        System.out.println("Masukkan potongan gaji: ");
        potGaji = input.nextInt();

        totGaji = (gaji*jmlMasuk)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " +totGaji);
    }
}