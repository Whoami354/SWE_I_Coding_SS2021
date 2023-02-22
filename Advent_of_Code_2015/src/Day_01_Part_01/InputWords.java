package Day_01_Part_01;

import java.io.BufferedReader;
import java.io.FileReader;

public class InputWords {
    public String inputWords(String line)throws Exception{
        FileReader wort = new FileReader(line);
        BufferedReader words = new BufferedReader(wort);
        String readLines;
        String lines = "";
        while ((readLines = words.readLine()) != null ) {
            lines += readLines;
        }

        return lines;
    }
}
