package Day_01_Part_01;

public class CheckFloor {
    private InputWords in = new InputWords();
    private UI ui = new UI();
        public int whatFloor() throws Exception {
            String line = in.inputWords("C:\\Users\\gregory\\Desktop\\Coding_SS21\\Software_Engineering1Coding\\Advent_of_Code_2015\\src\\Day_01_Part_01\\PathtoFloor.txt");
            int counter = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '(') counter++;
                if (line.charAt(i) == ')') counter--;
            }
            return counter;
        }
        public void printFloor() throws Exception {
            ui.whatFloor(whatFloor());
        }
}


