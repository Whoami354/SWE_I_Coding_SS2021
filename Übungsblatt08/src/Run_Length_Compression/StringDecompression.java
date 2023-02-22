package Run_Length_Compression;

import java.util.ArrayList;
import java.util.List;

public class StringDecompression {

    public String expand(String compressed) {
        List<String> saveAll =  getRuns(compressed);
        String result = "";
        for (String string : saveAll){
            result += deCompressedRun(string);
        }
        return result;
    }


    public List<String> getRuns(String compressed) {
        List<String> runs = new ArrayList<>();
        for (int i = 0; i < compressed.length(); i++) {
            if (compressed.charAt(i) == '~') {
                runs.add(compressed.substring(i, i + 3));
                i += 2;
            } else {
                runs.add(String.valueOf(compressed.charAt(i)));
            }
        }
        return runs;
    }

    public String deCompressedRun(String derun) {
        if (derun.charAt(0) == '~') {
            int howManySum;
            char howMany = derun.charAt(1);
            String whatLetter = String.valueOf(derun.charAt(2));

            howManySum = (int) howMany - 28;
            return whatLetter.repeat(howManySum);
        } else {
            return derun;
        }

    }


}
