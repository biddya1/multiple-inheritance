public interface father {
    void showFather();
}

interface Mother {
    void showMother();
}

class Child implements father, Mother {
    public void showFather() {
        System.out.println("I am from Father.");
    }

    public void showMother() {
        System.out.println("I am from Mother.");
    }

    void showChild() {
        System.out.println("I am the Child.");
    }
}
    


