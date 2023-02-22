import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImportWords {

    public List<String> fileinputReader(String woerter) throws IOException {
        FileReader wort = new FileReader(woerter);
        BufferedReader reader = new BufferedReader(wort);

        String zeilelesen = reader.readLine();
        List<String> result = new ArrayList<>();
        while (zeilelesen != null){
            result.add(zeilelesen);
            zeilelesen = reader.readLine();
        }
        return result;

    }


}
