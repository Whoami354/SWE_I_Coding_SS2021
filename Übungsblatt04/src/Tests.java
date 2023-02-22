import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tests {
    public static void main(String[] args) {
        try {
            Tests test = new Tests();
            test.testDictionary();
            test.testImport();
            test.testEqualWords();
            test.testUI();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void testImport()throws IOException {
        ImportWords importWords = new ImportWords();
        List<String> words = importWords.fileinputReader("C:\\Users\\gregory\\Desktop\\Coding_SS21\\Software_Engineering1Coding\\Übungsblatt04\\src\\woerter(Aufgabe04).txt");
        System.out.println(words);
    }
    public void testDictionary(){
        List<String> words = new ArrayList<>();
        Dictionary dictionary = new Dictionary(words);
        words.add("Lug");
        words.add("Trug");
        words.add("blabla");
        System.out.println("reime für \"ug\"");
        System.out.println(dictionary.search("ug"));
        System.out.println("reime für \"bla\"");
        System.out.println(dictionary.search("bla"));

    }
    public void testEqualWords(){
        EqualWords compare = new EqualWords();
        System.out.println("Vergleiche \"Trug\" und \"Lug\": " + compare.compare("Trug","Lug"));
        System.out.println("Vergleiche \"Lug\" und \"Trug\": " + compare.compare("Lug","Trug"));
        System.out.println("Vergleiche \"Lug\" und \"Lug\": " + compare.compare("Lug","Lug"));
    }
    public void testUI()throws IOException{
        ImportWords importWords = new ImportWords();
        List<String> words = importWords.fileinputReader("C:\\Users\\gregory\\Desktop\\Coding_SS21\\Software_Engineering1Coding\\Übungsblatt04\\src\\woerter(Aufgabe04).txt");
        Dictionary dictionary = new Dictionary(words);
        UI ui = new UI(dictionary);
        ui.start();


    }


}
