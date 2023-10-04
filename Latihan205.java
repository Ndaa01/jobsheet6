import java.util.Scanner;

public class Latihan205 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jenis Buku (Kamus, Novel, Lainnya): "); // Input Jenis Buku
        String jenisBuku = input.next();
        System.out.print("Masukkan Jumlah Buku: "); // Input Jumlah Buku
        int jumlahBuku = input.nextInt();
        System.out.print("Masukan Harga Buku: "); // Input Harga Buku
        int harga = input.nextInt();

        double diskon = 0;

        if (jenisBuku.equalsIgnoreCase("kamus")) { // Apabila Memasukan Jenis Buku Kamus
            diskon = 0.1; // Diskon 10%
            if (jumlahBuku > 2) { // Jika Buku Lebih Dari 2
                diskon += 0.02; // Diskon ditambah 2% atau 0.02
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) { // Apabila Memasukan Jenis Buku Novel
            diskon = 0.07; // Diskon 7%
            if (jumlahBuku > 3) { // Apabila Buku Lebih dari 3
                diskon += 0.02; // Diskon Ditambah 2%
            } else if (jumlahBuku <= 3) { // Apabila Buku kurang dari 3
                diskon += 0.01; // Diskon Ditambah 1%
            }
        } else if (jumlahBuku > 3) { // Apabila Memasukan Jenis Buku Lain Dan Jumlah Buku lebih dari 3
            diskon = 0.05; // Diskon 5%
        }

        double hargaJumlah = harga * jumlahBuku; // Rumus Harga Sebelum Diskon
        System.out.println("Harga Sebelum diskon: " + hargaJumlah);
        double totalDiskon = diskon * hargaJumlah; // Rumus Total Diskon yang Didapat
        System.out.println("Jumlah diskon yang didapat: " +totalDiskon);
        double totalHarga = hargaJumlah - totalDiskon; // Rumus Total Yang Harus DIbayarkan
        System.out.println("Total Harga yang harus dibayar: " + totalHarga);

    }
}
