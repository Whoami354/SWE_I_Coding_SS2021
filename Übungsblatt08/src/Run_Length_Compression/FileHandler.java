package Run_Length_Compression;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private final String filename;

    public FileHandler(String filename) {
        this.filename = filename;
    }

    public List<String> readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            List<String> result = new ArrayList<>();
            String line = "";
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void saveFiles(List<String> saves) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String string : saves) {
                writer.write(string + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
