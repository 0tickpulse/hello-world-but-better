package net.tickmc;

import net.tickmc.webserver.controllers.controllers.LineBreaker;

import java.io.PrintStream;

public class CharPrinter implements ICharPrinter {
    private PrintStream stream;
    private char[] chars;

    public CharPrinter(PrintStream stream, char[] chars) {
        this.stream = stream;
        this.chars = chars;
    }

    public CharPrinter(char[] chars) {
        this(System.out, chars);
    }

    @Override
    public void println() {
        for (char c1 : chars) {
            stream.print(String.valueOf(c1));
        }
        if (chars.length != 0) {
            LineBreaker.newline(stream);
        }
    }
}
