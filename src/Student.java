public class Student {
    String nume;
    int varsta;

    public void afiseazaDate() {
        System.out.println(nume + ", " + varsta);

    }

    public static void main(String[] args) {
        Student s = new Student();
        s.nume = "Victoria";
        s.varsta = 39;
        s.afiseazaDate();

    }
}
