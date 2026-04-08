public class Hewan {
    String nama;
    int ekor;

    public Hewan (){
        this.nama = "Anjing";
        this.ekor = 1;
    }

    public Hewan (String nama, int ekor){
        this.nama = nama;
        this.ekor = ekor;
    }

    //overriding method makan
    public void makan (){
        System.out.println("Hewan Makan");
    }

    public void makan (String makanan){
        System.out.println("Hewan Makan " + makanan);
    }
}
