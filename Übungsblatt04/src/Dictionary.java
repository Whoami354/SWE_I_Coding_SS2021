import java.util.Collections;
import java.util.List;

public class Dictionary {
    private List<String> words;
    public Dictionary(List<String> words){
        this.words = words;
        Collections.sort(words,new EqualWords());
    }
    public List<String> search(String wordend){
        int startindex =0;
        int endindex = words.size();
        boolean found = false;
        for(int i=0;i<words.size();i++){
            String word = words.get(i);
            int wordlength = word.length();
            if(wordlength<wordend.length()){
                continue;
            }
            String currentEnd = word.substring(wordlength-wordend.length(),wordlength);
            if(!found){
                if(wordend.equals(currentEnd)){
                    startindex = i;
                    found = true;
                }
            }else {
                if(!wordend.equals(currentEnd)) {
                    endindex = i;
                    break;
                }
            }
        }
        return words.subList(startindex,endindex);
    }


}
