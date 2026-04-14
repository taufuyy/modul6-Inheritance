//Taufik Hafit Zakaria - 103112430093

import java.util.ArrayList;

public class Fakultas {
    String namaFakultas;
    ArrayList<Prodi> listProdi;

    public Fakultas(String nama) {
        this.namaFakultas = nama;
        this.listProdi = new ArrayList<>();
    }

    // Method untuk menambah prodi ke list (Relasi Composition)
    public void tambahProdi(Prodi pr) {
        listProdi.add(pr);
    }

    public void cetakDaftarProdi() {
        System.out.println("Daftar Program Studi di " + namaFakultas + ":");
        for (Prodi p : listProdi) {
            System.out.println("- " + p.namaJurusan);
        }
    }
}