interface Reader {
    String read();
}

interface Writer {
    void write(String text);
}

class KeyboardReader implements Reader {

    @Override
    public String read() {
        return "Hello from keyboard";
    }
}

class ConsoleWriter implements Writer {

    @Override
    public void write(String text) {
        System.out.println("Output: " + text);
    }
}

class CopyProgram {
    private Reader reader;
    private Writer writer;

    public CopyProgram(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void execute() {
        String data = reader.read();
        writer.write(data);
    }
}

public class Program6 {

    public static void main(String[] args) {

        Reader reader = new KeyboardReader();
        Writer writer = new ConsoleWriter();

        CopyProgram program = new CopyProgram(reader, writer);

        program.execute();
    }
}