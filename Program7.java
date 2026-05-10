interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class SimplePrinter implements Printer {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}

class MultiFunctionPrinter implements Printer, Scanner {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class Program7 {

    public static void main(String[] args) {

        SimplePrinter printer = new SimplePrinter();
        printer.print();

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print();
        mfp.scan();
    }
}