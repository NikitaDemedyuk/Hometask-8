package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.company.Main.removeSpaces;
import static org.junit.Assert.*;

public class TestMain {
    @Test
    public void testRemoveSpaces1() {
        String lineTestText = "It's a     great             successful     win";
        List<String> testText = new ArrayList();
        for (int i = 0; i < 4; i++) {
            testText.add(lineTestText);
        }

        String lineText = "It's a great successful win";
        List<String> text = new ArrayList();
        for (int i = 0; i < 4; i++) {
            text.add(lineText);
        }

        List <String> text2 = removeSpaces(testText);

        assertTrue(text2.equals(text));
    }

    @Test
    public void testRemoveSpaces2() {
        String lineText1 = "Poland's topographically diverse territory extends from the beaches along the Baltic Sea";
        String lineText2 = "The history of human activity on Polish soil spans thousands of years";
        String lineText3 = "With the passing of prominence and prosperity, the country was partitioned by neighbouring states at the end of the 18th century, and regained independence in 1918 with the Treaty of Versailles";

        List<String> text = new ArrayList();

        for (int i = 0; i < 3; i++) {
            text.add(lineText1);
            text.add(lineText2);
            text.add(lineText3);
        }

        String lineTestText1 = "Poland's topographically          diverse territory extends          from the beaches          along the Baltic Sea";
        String lineTestText2 = "The         history of         human activity on Polish soil spans thousands           of years";
        String lineTestText3 = "With the passing of prominence          and prosperity, the         country was         partitioned by neighbouring           states at the end of the 18th        century, and regained independence    in 1918    with the Treaty   of Versailles";
        List<String> testText = new ArrayList();

        for (int i = 0; i < 3; i++) {
            testText.add(lineTestText1);
            testText.add(lineTestText2);
            testText.add(lineTestText3);
        }

        List <String> text2 = removeSpaces(testText);

        assertTrue(text2.equals(text));
    }
}

