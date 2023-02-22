import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Turns {
    private List<int[]> turns = new ArrayList<>();

    public void addTurn(int[] guessposition) {
        turns.add(guessposition);

    }

    public List<int[]> getTurns() {
        return turns;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < turns.size(); i++) {
            result += (i + 1) + " " + Arrays.toString(turns.get(i)) + "\n";
        }
        return result;
    }
}
