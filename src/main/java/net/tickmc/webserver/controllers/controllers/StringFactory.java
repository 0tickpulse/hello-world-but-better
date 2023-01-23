package net.tickmc.webserver.controllers.controllers;

import net.tickmc.webserver.models.IStringFactory;

public class StringFactory implements IStringFactory {

    public static StringFactory instance;

    public static StringFactory getInstance() {
        if (instance == null) {
            instance = new StringFactory();
        }
        return instance;
    }

    private StringFactory() {
    }

    @Override
    public String createString(char[] chars) {
        // purposely use the most convoluted way to create a string
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        return sb.toString();
    }
}
