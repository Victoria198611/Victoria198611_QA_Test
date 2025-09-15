public class Vari{
String name;
int varsta;
double inaltimea;

// Constructor
public Vari(String name, int varsta, double inaltimea) {
    this.name = name;
    this.varsta = varsta;
    this.inaltimea = inaltimea;
}
public static void main (String[] args) {
    Vari myObj = new Vari("Victoria", 39, 1.65);
    System.out.println("Name=" + myObj.name + " " + "varsta=" + myObj.varsta + " " + "inaltime=" + myObj.inaltimea);
}
}


