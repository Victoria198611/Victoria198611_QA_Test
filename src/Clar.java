
public class Clar {
    int a = 5;
    int b = 2;

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Clar mm = new Clar();
        System.out.println("Rezultatul este: " + mm.add(mm.a, mm.b));
    }
}

