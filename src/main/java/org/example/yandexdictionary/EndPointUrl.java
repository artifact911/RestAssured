package org.example.yandexdictionary;

public enum EndPointUrl {

    TRANSLATE("/translate");

    String path;

    EndPointUrl(String path) {
        this.path = path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String addPath(String additionalPath) {
        return path + additionalPath;
    }
}
