package net.tickmc.webserver.controllers.controllers;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class LineBreaker {
    public static void newline(PrintStream stream) {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stream));
        try {
            writer.newLine();
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
