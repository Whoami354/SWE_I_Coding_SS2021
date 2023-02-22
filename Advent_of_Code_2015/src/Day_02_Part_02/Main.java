package Day_02_Part_02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ImportValuesRibbon ivr = new ImportValuesRibbon();
        try {
            ivr.importRibbonValues("C:\\Users\\gregory\\Desktop\\Coding_SS21\\Software_Engineering1Coding\\Advent_of_Code_2015\\src\\Day_02_Part_02\\ribbonFeet.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
