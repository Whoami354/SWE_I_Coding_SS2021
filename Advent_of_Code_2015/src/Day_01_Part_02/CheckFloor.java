package Day_01_Part_02;

public class CheckFloor {
    private InputWords in = new InputWords();
    private UI ui = new UI();
        public int whatPosition() throws Exception {
            String line = in.inputWords("C:\\Coding_SS21\\Software_Engineering1Coding\\Advent_of_Code_2015\\src\\Day_01_Part_02\\PathtoFloor.txt");
            int counter = 0;
            int position = 0;
            for (int i = 0; i < line.length(); i++) {
                if(counter == -1) break;
                if(line.charAt(i) == '(')counter++;
                if(line.charAt(i) == ')')counter--;

                position++;
            }
            return position;
        }
        public void printPosition() throws Exception {
            ui.whatPosition(whatPosition());
        }
}


