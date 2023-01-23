package net.tickmc.webserver.controllers.controllers;

import net.tickmc.webserver.models.IHelloWorld;
import org.jetbrains.annotations.Nullable;

/**
 * An implementation of the {@link IHelloWorld} interface.
 * This implementation makes use of a while loop to generate the characters such that they match the string "Hello, world!",
 * allowing for developers to use this class to easily generate a hello world string.
 *
 * @author 0TickPulse
 * @since 1.0
 */
public class HelloWorldImplementation implements IHelloWorld {
    private char[] chars = new char[12];

    /**
     * Gets the current internal array of UTF-16 characters.
     *
     * @return The current internal array of UTF-16 characters.
     * @since 1.0
     */
    public char @Nullable [] getChars() {
        return chars;
    }

    /**
     * Makes use of an advanced pseudo-random number generator algorithm to create a new array of UTF-16 characters that match the string "Hello, world!".
     * This method is not thread-safe as it also modifies the class instance's internal character array.
     *
     * @return A new array of UTF-16 characters that match the string "Hello, world!".
     * @since 1.0
     */
    public char[] generateChars() {
        char[] chars = new char[12];
        while (chars[0] != 'H') {
            chars[0] = (char) (Math.random() * 26 + 65);
        }
        while (chars[1] != 'e') {
            chars[1] = (char) (Math.random() * 26 + 97);
        }
        while (chars[2] != 'l') {
            chars[2] = (char) (Math.random() * 26 + 97);
        }
        while (chars[3] != 'l') {
            chars[3] = (char) (Math.random() * 26 + 97);
        }
        while (chars[4] != 'o') {
            chars[4] = (char) (Math.random() * 26 + 97);
        }
        while (chars[5] != ',') {
            chars[5] = (char) (Math.random() * 26 + 32);
        }
        while (chars[6] != ' ') {
            chars[6] = (char) (Math.random() * 26 + 32);
        }
        while (chars[7] != 'w') {
            chars[7] = (char) (Math.random() * 26 + 97);
        }
        while (chars[8] != 'o') {
            chars[8] = (char) (Math.random() * 26 + 97);
        }
        while (chars[9] != 'r') {
            chars[9] = (char) (Math.random() * 26 + 97);
        }
        while (chars[10] != 'l') {
            chars[10] = (char) (Math.random() * 26 + 97);
        }
        while (chars[11] != 'd') {
            chars[11] = (char) (Math.random() * 26 + 97);
        }
        this.chars = chars;
        return chars;
    }
}
