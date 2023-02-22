package Run_Length_Compression;

import java.util.ArrayList;
import java.util.List;

public class RLCFunction {
    private FileHandler handler;

    public RLCFunction(String filename) {
        this.handler = new FileHandler(filename);
    }

    public void compressFiles(){
        StringCompression compression = new StringCompression();
        List<String> result = handler.readFile();
        List<String> saveall = new ArrayList<>();
        for (String help : result){
            saveall.add(compression.doRLC(help));
        }
        handler.saveFiles(saveall);

    }

    public void decompressFiles(){
        StringDecompression decompression = new StringDecompression();
        List<String> result = handler.readFile();
        List<String> saveall = new ArrayList<>();
        for (String help : result){
            saveall.add(decompression.expand(help));
        }
        handler.saveFiles(saveall);

    }
}
