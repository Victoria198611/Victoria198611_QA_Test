class Parinte {
    Parinte() {
        System.out.println("Parintele este major");
    }
}

class copil extends Parinte {
    copil() {
        super();
        System.out.println("Copilul este minor");
    }
}

class Son {
    public static void main(String[] args) {
        copil myCopil = new copil();
    }
}