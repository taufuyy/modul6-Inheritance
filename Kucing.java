public class Kucing extends Hewan {
    String warna;

    public Kucing (){
        super("Kucing", 1);
        this.warna = "Oren";
    }

    @Override
    public void makan (){
        System.out.println("Kucing Makan Ikan");
    }

}

