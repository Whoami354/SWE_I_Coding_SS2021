package Run_Length_Compression;

import java.util.ArrayList;
import java.util.List;

public class StringCompression {

    public String doRLC(String original) {
        if (original.equals("")) {
            return "";
        }
        List<String> runs = getRuns(original);
        StringBuilder compression = new StringBuilder();
        for (int i = 0; i < runs.size(); i++) {
            compression.append(compressRun(runs.get(i)));
        }
        return compression.toString();
    }

    private List<String> getRuns(String original) {
        char singleLetter = original.charAt(0);
        StringBuilder result = new StringBuilder();
        List<String> runs = new ArrayList<>();
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == singleLetter) {
                result.append(singleLetter);
            } else {
                runs.add(result.toString());
                result = new StringBuilder(String.valueOf(original.charAt(i)));
                singleLetter = original.charAt(i);
            }
        }
        runs.add(result.toString());
        return runs;
    }

    public String compressRun(String run) {
        String asciiSymbol = "~}" + run.charAt(0);
        int diffascii = run.length() / 95;
        int modulo = run.length() % 95;
        String compress = asciiSymbol.repeat(diffascii);
        if (run.charAt(0) == '~') {
            if(modulo>=2){
                compress += "~" + ((char) (' ' + modulo - 2)) + run.charAt(0);
            }else {
                compress += "~~";
            }
        } else if (modulo >= 4) {
            compress += "~" + ((char) (' ' + modulo - 4)) + run.charAt(0);
        } else {
            compress += run.substring(0, modulo);
        }
        return compress;
    }


}
