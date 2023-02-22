package Day_02_Part_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ImportValues {
    private CalcPaper cp = new CalcPaper();
    private UI ui = new UI();
    public void inputFile(String value) throws IOException {
        FileReader read = new FileReader(value);
        BufferedReader reads = new BufferedReader(read);
        String reader;
        int sum = 0;
        while ((reader = reads.readLine()) != null) {
            sum += cp.calcPaperSize(reader);
        }
        ui.printPaperSize(sum);
    }
}
