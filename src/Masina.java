public class Masina {
    String marca;
    int viteza;
    public void afiseazaDetalii(){
        System.out.println(marca + ", " + viteza); //Metoda de tip void

    }
    public static  void main (String[] args) {
        Masina s = new Masina();
        s.marca="Toyota";
        s.viteza=120;
        s.afiseazaDetalii();

    }
}
