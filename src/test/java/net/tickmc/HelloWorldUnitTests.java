package net.tickmc;

import org.junit.jupiter.api.DisplayName;

import static net.tickmc.Main.getString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldUnitTests {
    public void main() {
        test();
    }
    @org.junit.jupiter.api.Test
    @DisplayName("Ensure hello world string matches")
    public void test() {
        String str = getString();
        assertEquals("Hello, world", str, "Hello World string should match");
    }
}
