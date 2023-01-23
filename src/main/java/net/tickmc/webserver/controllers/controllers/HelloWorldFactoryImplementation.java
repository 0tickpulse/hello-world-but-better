package net.tickmc.webserver.controllers.controllers;

import net.tickmc.webserver.models.IHelloWorld;
import net.tickmc.webserver.models.IHelloWorldFactory;

public class HelloWorldFactoryImplementation implements IHelloWorldFactory {
    public static IHelloWorldFactory instance;

    public static IHelloWorldFactory getInstance() {
        if (instance == null) {
            instance = new HelloWorldFactoryImplementation();
        }
        return instance;
    }

    @Override
    public IHelloWorld createHelloWorld() {
        return new HelloWorldImplementation();
    }

    private HelloWorldFactoryImplementation() {
    }
}
