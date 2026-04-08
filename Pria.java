// subclass
public class Pria extends Manusia {
    String nik;

    Pria(String nama, String nik){
        super(nama);// fungsinya untuk manggil constructor di superclass
        this.nik = nik;
    }

    public void tampilNama(){        
        System.out.println("Nama: " + nama);  // ini berasal dari superclass nya
        System.out.println("NIK: " + nik); // ini berasal dari subclass nya

    }
}