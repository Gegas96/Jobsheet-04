import java.util.Scanner;

public class HargaBayar11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String merkBuku;
        int harga, jmlBarang, jmlHalaman;
        double dis, total, bayar, jmlDis;

        System.out.println("Masukkan merek buku");
        merkBuku = input.next();
        System.out.println("Masukkan jumlah halaman: ");
        jmlHalaman = input.nextInt();
        System.out.println("Masukkan Harga barang yang dibeli: ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah lusin barang yang dibeli: ");
        jmlBarang = input.nextInt();
        System.out.println("Masukkan diskon: ");
        dis = input.nextDouble();

        total = harga*jmlBarang;
        jmlDis = total*dis;
        bayar = total-jmlDis;
        System.out.println("Diskon yang anda dapatkan: ");
        System.out.println(jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah ");
        System.out.println(bayar);
    }
}
