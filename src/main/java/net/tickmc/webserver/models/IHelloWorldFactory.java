package net.tickmc.webserver.models;

/**
 * A factory that manages instances and creation of {@link IHelloWorld} objects.
 */
public interface IHelloWorldFactory {
    IHelloWorld createHelloWorld();
}
