package org.example.jr_back_courses.fileio;

import org.example.dsa.array.Array;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private final static String FILE_NAME = "file.txt";
    private final static String COUPLET_NAME = "^(\\d+)\\.\\s+(\\w.+)";
    private final static String REFRAIN_NAME = "^(\\*)\\s+(\\w.+)";
    private final static String SONG_NUMBER = "^\\d+$";
    private final static String SONG_NAME = "^[A-Z].+$";
    private final static String NEW_LINE = "\\n\\n";

    public static void main(String[] args) throws IOException {
        Pattern patternCouplet = Pattern.compile(COUPLET_NAME);
        Pattern patternRefrain = Pattern.compile(REFRAIN_NAME);
        Pattern patternSongNumber = Pattern.compile(SONG_NUMBER);
        Pattern patternSongName = Pattern.compile(SONG_NAME);
        Pattern patternNewLine = Pattern.compile(NEW_LINE);

        ArrayList<Song> songs = new ArrayList<>();
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            boolean newFile = file.createNewFile();
        }

        try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            Song song = new Song();
            String line;
            while ((line = br.readLine()) != null) {
                Matcher matcherCouplet = patternCouplet.matcher(line);
                Matcher matcherRefrain = patternRefrain.matcher(line);
                Matcher matcherSongNumber = patternSongNumber.matcher(line);
                Matcher matcherSongName = patternSongName.matcher(line);
                Matcher matcherNewLine = patternNewLine.matcher(line);

                if (matcherSongNumber.find()) {
                    song.setNumber(Integer.parseInt(line));
                } else if (matcherSongName.find()) {
                    song.setName(line);
                } else if (matcherCouplet.find()) {
                    Verse verse = new Verse();
                    verse.setId(matcherCouplet.group(1));
                    verse.setLine(matcherCouplet.group(2));
                    verse.setRefrain(false);
                    song.getVerses().add(verse);
                } else if (matcherRefrain.find()) {
                    Verse verse = new Verse();
                    verse.setId(matcherRefrain.group(1));
                    verse.setLine(matcherRefrain.group(2));
                    verse.setRefrain(true);
                    song.getVerses().add(verse);
                } else if (line.isEmpty() || line.isBlank()) {
                    songs.add(song);
                    song = new Song();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Song song : songs) {
            System.out.println(song.getNumber());
            System.out.println(song.getName());

            for (Verse verse: song.getVerses()) {
                if (verse.isRefrain()) {
                    System.out.println(verse.getId()+" ");
                } else {
                    System.out.println(verse.getId()+". ");
                }
                System.out.println(verse.getLine());
            }
            System.out.println("**** Fin du cantique ****");
        }
    }
}
