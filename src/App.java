import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String[] menu = { "Nasi Goreng", "Mie Ayam", "Bakso" };
        int[] harga = { 15000, 10000, 13000 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String namaPemesan = scanner.nextLine();

        System.out.println("\nMenu Makanan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }

        System.out.print("\nMasukkan nomor menu yang ingin dipesan: ");
        int nomorMenu = scanner.nextInt();

        if (nomorMenu >= 1 && nomorMenu <= menu.length) {

            System.out.print("Masukkan jumlah pesanan: ");
            int jumlahPesanan = scanner.nextInt();

            int totalBayar = harga[nomorMenu - 1] * jumlahPesanan;

            System.out.println("\n=====================================");
            System.out.println("Terima kasih atas pesanan Anda, ");
            System.out.println("Nama: " + namaPemesan);
            System.out.println("Pesanan Anda: " + menu[nomorMenu - 1]);
            System.out.println("Jumlah pesanan: " + jumlahPesanan);
            System.out.println("Total bayar: Rp" + totalBayar);
            System.out.println("=====================================");

        } else {
            System.out.print("Maaf anda salah memilih nomer menu");
        }

        scanner.close();
    }
}
