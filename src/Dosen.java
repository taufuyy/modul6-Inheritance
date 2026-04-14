//Taufik Hafit Zakaria - 103112430093

public class Dosen {
    String namaLengkap;
    String idDosen; 

    // Constructor untuk isi data
    public Dosen(String nama, String id) {
        this.namaLengkap = nama;
        this.idDosen = id;
    }

    // Method aksi dosen
    public void infoMengajar() {
        System.out.println("Dosen " + namaLengkap + " sedang memberikan materi kuliah.");
    }
}