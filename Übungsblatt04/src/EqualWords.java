import java.util.Comparator;

public class EqualWords implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        for(int i=1;i<=Math.min(o1.length(),o2.length());i++){
            if(o1.charAt(o1.length()-i) > o2.charAt(o2.length()-i)){
                return 1;
            }else if (o1.charAt(o1.length()-i) < o2.charAt(o2.length()-i)){
                return -1;
            }
        }
        return 0;
    }
}
