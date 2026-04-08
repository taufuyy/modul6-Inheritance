public class Main{
    public static void main(String[] args) {
        // Pria p = new Pria("Abdul", "123456789");
        // p.tampilNama();
        Kucing kucing = new Kucing();
        Ikan ikan = new Ikan();

        kucing.makan();
        kucing.makan("ikan");
        ikan.makan("Cacing");
        ikan.makan();
    
    }
}