package Day_03_Part_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ImportRoute {
    public String inputRoute(String file) throws IOException {
        StringBuilder directions = new StringBuilder();
        FileReader read = new FileReader(file);
        BufferedReader reading = new BufferedReader(read);
        String line;
        while ((line = reading.readLine()) != null) {
            directions.append(line);
        }
        return directions.toString();
    }
}
