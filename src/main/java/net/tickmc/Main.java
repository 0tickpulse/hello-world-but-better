package net.tickmc;

import net.tickmc.helpers.Base64Helper;
import net.tickmc.helpers.HttpsHelper;
import net.tickmc.helpers.UpdateManager;
import net.tickmc.webserver.Server;

public class Main {
    public static void main(String[] args) {
        checkVersions();
        String response = getString();
        char[] chars = response.toCharArray();
        CharPrinter printer = new CharPrinter(chars);
        printer.println();
    }
    public static String getString() {
        startWebserver();
        String response = HttpsHelper.get("http://localhost:8080/hello");
        assert response != null;
        return Base64Helper.decode(response);
    }
    public static void startWebserver() {
        System.out.println("Starting SpringBoot webserver...");
        Server.main(new String[0]);
        System.out.println("Started SpringBoot webserver.");
    }
    public static void checkVersions() {
        if (!UpdateManager.isLatestVersion()) {
            System.out.println("There is a new version available: " + UpdateManager.getLatestVersion());
            System.out.println("Please download the latest version from https://github.com/0tickpulse/hello-world-but-better/releases/latest");
        }
    }
}