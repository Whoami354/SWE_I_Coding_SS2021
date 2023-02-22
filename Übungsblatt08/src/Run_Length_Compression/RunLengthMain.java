package Run_Length_Compression;


public class RunLengthMain {
    public static void main(String[] args) {
        StringCompression compression = new StringCompression();
        StringDecompression decompression = new StringDecompression();
        RLCFunction rlcFunction = new RLCFunction("C:\\Users\\gregory\\Desktop\\Coding_SS21\\Software_Engineering1Coding\\Übungsblatt08\\src\\Run_Length_Compression\\Übungsblatt08.txt");
        System.out.println(compression.compressRun("~".repeat(93)));
        System.out.println(compression.doRLC("aaaaaaahhhhhhhhgggggggg"));
        System.out.println(compression.doRLC("a".repeat(570)));
        System.out.println(compression.doRLC("hhhhhhhhhhhhggggggggggggggggeeeeeeeeeeeeeeeezzzzzzzzzzzzzzzzzzzz"));
        System.out.println(decompression.expand("~#a~$h~$g"));

        System.out.println("**********************************************************************************************");

        System.out.println();
        rlcFunction.compressFiles();
    }
}
