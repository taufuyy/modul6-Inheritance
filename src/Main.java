//Taufik Hafit Zakaria - 103112430093

public class Main {
    public static void main(String[] args) {
        // dosen
        Dosen dsn1 = new Dosen("Andi Prasetyo", "D001");
        Dosen dsn2 = new Dosen("Siti Aminah", "D002");

        // 2. prodi
        Prodi pr1 = new Prodi("Teknik Informatika");

        // 3. Hubungkan Dosen ke Prodi
        pr1.tambahPengajar(dsn1);
        pr1.tambahPengajar(dsn2);

        // 4. fakultas
        Fakultas f1 = new Fakultas("Fakultas Teknik");

        // 5. Hubungkan Prodi ke Fakultas
        f1.tambahProdi(pr1);

        System.out.println("=== INFORMASI KAMPUS ===");
        f1.cetakDaftarProdi();
        System.out.println(); // Spasi
        pr1.cetakDaftarDosen();
        System.out.println(); // Spasi

        dsn1.infoMengajar();
        dsn2.infoMengajar();
    }
}