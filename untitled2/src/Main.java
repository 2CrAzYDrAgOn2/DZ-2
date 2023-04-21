interface Instrument {
    String KEY = "До мажор";
    void play();
}

class Guitar implements Instrument {
    private int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public void play() {
        System.out.println("Играет гитара с количеством струн: " + numberOfStrings);
    }
}

class Drum implements Instrument {
    private int size;

    public Drum(int size) {
        this.size = size;
    }

    public void play() {
        System.out.println("Играет барабан размером: " + size);
    }
}

class Trumpet implements Instrument {
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public void play() {
        System.out.println("Играет труба с диаметром: " + diameter);
    }
}

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum(22);
        instruments[2] = new Trumpet(3);

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}