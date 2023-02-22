public class CheckPosition {

    public int[] colorChars(int[] openposition, int[] secretposition) {
        int correct = 0;
        int wrong = 0;
        boolean[] check = new boolean[secretposition.length];
        boolean[] alreadyused = new boolean[openposition.length];
        for (int i = 0; i < secretposition.length; i++) {
            if (secretposition[i] == openposition[i]) {
                correct++;
                check[i] = true;
                alreadyused[i] = true;
            }
        }
        for (int j = 0; j < secretposition.length; j++) {
            for (int k = 0; k < openposition.length; k++) {
                if (openposition[k] == secretposition[j]) {
                    if (j == k || check[k] || alreadyused[j]) {
                        continue;
                    } else {
                        if (secretposition[j] == openposition[k] && !check[k]) {
                            wrong++;
                            check[k] = true;
                            break;
                        }
                    }
                }
            }
        }
        return new int[]{correct, wrong};
    }
}
