public class Out {
    int x = 10;

    class InnerClass {
        int y = 5;

        // Metoda InnerClass
        void metodaAdunare() {
            System.out.println("Suma este: " + (x + y));
        }
    }
}

class Nic {
    public static void main(String[] args) {
        Out myOut = new Out();
        Out.InnerClass myInner = myOut.new InnerClass();
        myInner.metodaAdunare();
    }
}