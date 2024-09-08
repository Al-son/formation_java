package org.example.jr_back_courses.fileio;

import java.awt.desktop.PreferencesEvent;

public class Verse implements Comparable<Verse> {
    private String id;
    private String line;
    private boolean isRefrain;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public boolean isRefrain() {
        return isRefrain;
    }

    public void setRefrain(boolean refrain) {
        isRefrain = refrain;
    }

    @Override
    public String toString() {
        return "Verse{" +
                "id=" + id +
                ", line='" + line + '\'' +
                ", isRefrain=" + isRefrain +
                '}';
    }

    @Override
    public int compareTo(Verse o) {
        return this.id.compareTo(o.id);
    }

}
