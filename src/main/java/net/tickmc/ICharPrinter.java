package net.tickmc;

/**
 * This is the interface for a character printer.
 * The character printer is a class that prints an array of characters into a specified {@link java.io.OutputStream}.
 * It allows the developer to easily print an array of characters.
 * Implementations should allow the developer to specify the {@link java.io.OutputStream} to print to,
 * ideally when creating an instance of said implementation.
 *
 * @author 0TickPulse
 * @since 1.0
 */
public interface ICharPrinter {
    /**
     * A method that prints the array of characters to the specified {@link java.io.OutputStream}.
     * In addition to printing the array of characters, this method should also print a line break.
     * This method should not print a line break if the array of characters is empty.
     */
    void println();
}
