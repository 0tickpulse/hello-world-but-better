package net.tickmc.helpers;

import java.util.Base64;

public final class Base64Helper {
    public static String encode(String text) {
        return new String(Base64.getEncoder().encode(text.getBytes()));
    }
    public static String decode(String text) {
        return new String(Base64.getDecoder().decode(text.getBytes()));
    }
}
