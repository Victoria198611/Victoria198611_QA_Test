public class Cons {
   public Cons() {
    }
public Cons(String nume){
       System.out.println(nume);
}
    Cons(int a) {
        System.out.println(a);
    }
    public static void main(String[] args) {
        Cons vica = new Cons(18);
       Cons vica1 = new Cons("Victoria");
    }
}
