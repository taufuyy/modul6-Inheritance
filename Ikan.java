public class Ikan extends Hewan {
    String jenis;

    public Ikan (){
        super("Arwana",1);
        this.jenis = "Air Tawar";
    }

    @Override
    public void makan(String pakan){
        System.out.println("Ikan makan" + pakan);
    }
}
