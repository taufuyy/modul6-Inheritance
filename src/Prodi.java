//Taufik Hafit Zakaria - 103112430093

import java.util.ArrayList;

public class Prodi {
    String namaJurusan;
    ArrayList<Dosen> daftarPengajar;

    public Prodi(String nama) {
        this.namaJurusan = nama;
        this.daftarPengajar = new ArrayList<>();
    }

    // Method untuk menambah dosen ke list (Relasi Aggregation)
    public void tambahPengajar(Dosen dsn) {
        daftarPengajar.add(dsn);
    }

    public void cetakDaftarDosen() {
        System.out.println("Daftar Dosen di Prodi " + namaJurusan + ":");
        for (Dosen d : daftarPengajar) {
            System.out.println("- " + d.namaLengkap + " (" + d.idDosen + ")");
        }
    }
}