// Aceasta este o clasa abstracta
public abstract class Anim {
    // Metoda abstracta: trebuie implementata in clasele copil
    public abstract void animSunet();
    public void sleep(){
        System.out.println("zzz");
    }
}
// Clasa Caine extinde Anim -> MOSTENIRE
// Caine este o subclasa (child) a clasei Anim (parinte)
class Caine extends Anim {
    // Implementarea metodei abstracte din Anim
    public void animSunet() {
        System.out.println("Cainele face Ham-Ham");
    }
}
// Clasa Pisica extinde Anim -> MOSTENIRE
// Pisica este o subclasa (child) a clasei Anim (parinte)
class Pisica extends Anim {
    public void animSunet() {
        System.out.println("Pisica face Miau-Miau");
    }
}
// Clasa care contine metoda main -> punctul de intrare al programului
class Sun {
    public static void main(String[] args) {
        // Crearea unui obiect de tip Caine, tip Pisica
        Caine myCaine = new Caine();
        Pisica myPisica = new Pisica();
        // Apelarea metodei abstracte implementate in Caine si Pisica
        myCaine.animSunet();
        myPisica.animSunet();
    }
}