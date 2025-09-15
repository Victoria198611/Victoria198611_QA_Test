public class Encap {
    public static void main(String[] args) {

        Person myObj = new Person();
        myObj.setName("Victoria");
        myObj.setVarsta(23);

        System.out.println(myObj.getName() + ", " + myObj.getVarsta());
    }
}

class Person {
    private String name;
    private int varsta;


    public String getName() {
        return name;
    }


    public void setName(String newName) {
        this.name = newName;
    }


    public int getVarsta() {
        return varsta;
    }


    public void setVarsta(int newVarsta) {
        this.varsta = newVarsta;
    }
}