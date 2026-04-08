import java.util.Scanner;
public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlMhs = 5;

        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04(jmlMhs);

         for (int i = 0; i < jmlMhs; i++) {
            System.out.println("\nMasukkan Data Mahasiswa ke-" + (i+1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa04 m = new Mahasiswa04(nim, nama, kelas, ipk);
            list.tambah(m);

            System.out.println("---------------------------");
        }

        System.out.println("\nData mahasiswa: ");
        list.tampil();

        System.out.println("Pencarian Data");
        System.out.println("----------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan binary search");
        double posisi2 = list.findBinarySearch(cari, 0, list.idx-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
