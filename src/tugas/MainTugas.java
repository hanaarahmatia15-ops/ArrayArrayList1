/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author ASUS
 */
public class MainTugas {
    public static void main(String[] args) {

        KelasKuliah kelas = new KelasKuliah();

        // Array Mata Kuliah
        String[] mataKuliah = {
            "Pemrograman Java",
            "Basis Data",
            "Jaringan Komputer"
        };

        System.out.println("=== DAFTAR MATA KULIAH ===");

        for (String mk : mataKuliah) {
            System.out.println(mk);
        }

        System.out.println();

        // Tambah 5 mahasiswa
        kelas.tambahMahasiswa(
                new Mahasiswa("BAqis", "2410010076", 100));

        kelas.tambahMahasiswa(
                new Mahasiswa("Rico", "2410010076", 55));

        kelas.tambahMahasiswa(
                new Mahasiswa("Oksi", "2410010103", 90));

        kelas.tambahMahasiswa(
                new Mahasiswa("Zara", "2410010299", 70));

        kelas.tambahMahasiswa(
                new Mahasiswa("Elyz", "2410010431", 40));

        kelas.tampilkanSemua();

        System.out.println();

        System.out.println("Rata-rata nilai: "
                + kelas.hitungRataRata());

        System.out.println("Jumlah lulus: "
                + kelas.jumlahLulus());

        System.out.println();

        // Tambah mahasiswa baru
        kelas.tambahMahasiswa(
                new Mahasiswa("Aqis", "231006", 95));

        System.out.println("Jumlah mahasiswa terbaru: "
                + kelas.jumlahMahasiswa());
    }
}
