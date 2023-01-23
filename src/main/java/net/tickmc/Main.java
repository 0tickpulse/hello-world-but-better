package net.tickmc;

import net.tickmc.helpers.Base64Helper;
import net.tickmc.helpers.HttpsHelper;
import net.tickmc.helpers.UpdateManager;
import net.tickmc.helpers.Version;
import net.tickmc.webserver.Server;

public class Main {
    public static final Version VERSION = new Version("1.0.3");
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
        System.out.println("Checking for updates...");
        System.out.println("Current version: " + UpdateManager.getVersion());
        if (UpdateManager.FAILED) {
            System.out.println("Failed to check for updates. API is either down or ratelimited.");
            return;
        }
        System.out.println("Latest version: " + UpdateManager.getLatestVersion());
        if (!UpdateManager.isLatestVersion()) {
            System.out.println("Please download the latest version from https://github.com/0tickpulse/hello-world-but-better/releases/latest");
        } else {
            System.out.println("You are running the latest version.");
        }
    }
}