package com.designpatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mesut on 04.08.2016.
 */
public class LetterManager {

    private static LetterManager manager = new LetterManager();
    private List<Letter> letters = new ArrayList<Letter>();
    private Letter[][] document = new Letter[50][50];

    private LetterManager() {
    }

    public static LetterManager getManager() {
        return manager;
    }

    public static Letter getLetter(String str) {
        Letter letter = null;

        for (int i = 0; i < manager.letters.size(); i++) {
            Letter temp = manager.letters.get(i);
            if (temp.getLetter().equals(str)) {
                letter = temp;
                break;
            }
        }

        if (letter == null) {
            letter = new Letter(str);
            manager.letters.add(letter);
        }

        return letter;
    }

    public void addRow(String row, int rowNo) {
        for (int i = 0; i < row.length(); i++) {
            String letter = row.substring(i, i+1);
            document[rowNo][i] = getLetter(letter);
        }
    }

    public static void getDocument() {
        for (int x = 0; x < 50; x++) {
            for (int y = 0; y < 50; y++) {
                if (manager.document[x][y] != null) {
                    System.out.print(manager.document[x][y].getLetter());
                } else {
                    break;
                }
            }

            if (manager.document[x][0] != null) {
                System.out.println("");
            }
        }

        System.out.println("Letters number: " + manager.letters.size());
    }

    public List<Letter> getLetters() {
        return letters;
    }

    public void setLetters(List<Letter> letters) {
        this.letters = letters;
    }

    public void setDocument(Letter[][] document) {
        this.document = document;
    }
}
