package Day_02_Part_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ImportValuesRibbon {
    private CalcRibbon cr = new CalcRibbon();
    UI ui = new UI();

    public void importRibbonValues(String file) throws IOException {
        FileReader read = new FileReader(file);
        BufferedReader reads = new BufferedReader(read);
        String line;
        int sum = 0;
        while ((line = reads.readLine()) != null) {
            sum += cr.ribbonFeet(line);
        }
        ui.printRibbonValue(sum);
    }
}
