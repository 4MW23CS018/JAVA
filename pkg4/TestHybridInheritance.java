package pkg4;

class Grandfather {
    void oldcar() {
        System.out.println("Brand Ambassador");
    }
}

class Father extends Grandfather {
    void moderncar() {
        System.out.println("Kia Carens");
    }
}

interface Mother {
    void scooter();
}

class Son extends Father implements Mother {
    public void scooter() {
        System.out.println("Dio");
    }
}

public class TestHybridInheritance {
    public static void main(String[] args) {
        Son s = new Son();
        s.oldcar();      
        s.moderncar();    
        s.scooter();      
    }
}
