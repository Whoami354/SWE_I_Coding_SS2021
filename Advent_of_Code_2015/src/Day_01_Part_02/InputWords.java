package Day_01_Part_02;

import java.io.BufferedReader;
import java.io.FileReader;

public class InputWords {
    public String inputWords(String line)throws Exception{
        FileReader wort = new FileReader(line);
        BufferedReader words = new BufferedReader(wort);
        String readLines;
        StringBuilder lines = new StringBuilder();
        while ((readLines = words.readLine()) != null ) {
            lines.append(readLines);
        }
        return lines.toString();
    }
}