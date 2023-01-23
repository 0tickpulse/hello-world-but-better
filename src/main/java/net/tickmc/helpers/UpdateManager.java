package net.tickmc.helpers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.jar.Manifest;

public class UpdateManager {
    private static URL repoApiUrl;
    private static URL downloadUrl;
    private static Version latestVersion;

    static {
        try {
            repoApiUrl = new URL("https://api.github.com/repos/0tickpulse/hello-world-but-better/releases/latest");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try {
            String assetsUrl = HttpsHelper.getAsJson(repoApiUrl.toString()).getAsJsonObject().get("assets_url").getAsString();
            String downloadUrl = HttpsHelper.getAsJson(assetsUrl).getAsJsonArray().get(0).getAsJsonObject().get("browser_download_url").getAsString();
            UpdateManager.downloadUrl = new URL(downloadUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static Version updateLatestVersion() {
        latestVersion = new Version(HttpsHelper.getAsJson(repoApiUrl.toString()).getAsJsonObject().get("tag_name").getAsString());
        return latestVersion;
    }

    public static Version getLatestVersion() {
        return latestVersion == null ? updateLatestVersion() : latestVersion;
    }

    public static boolean isLatestVersion() {
        return getVersion().compareTo(getLatestVersion()) >= 0;
    }

    public static URL getRepoApiUrl() {
        return repoApiUrl;
    }

    /**
     * Updates the jar file for the plugin, and returns the new file's path.
     */
    public static String updateJar() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public static Version getVersion() {
        try {
            return new Version(new Manifest(UpdateManager.class.getResourceAsStream("/META-INF/MANIFEST.MF")).getMainAttributes().getValue("Version"));
        } catch (IOException e) {
            e.printStackTrace();
            return new Version("0.0.0");
        }
    }
}

