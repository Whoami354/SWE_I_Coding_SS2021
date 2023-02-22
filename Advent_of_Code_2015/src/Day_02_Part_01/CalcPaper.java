package Day_02_Part_01;

public class CalcPaper {

    public int minValue(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public int calcPaperSize(String paper) {
        String[] rectangleValues = paper.split("x");
        int length_width = Integer.parseInt(rectangleValues[0])*Integer.parseInt(rectangleValues[1]);
        int width_height = Integer.parseInt(rectangleValues[1])*Integer.parseInt(rectangleValues[2]);
        int height_length = Integer.parseInt(rectangleValues[2])*Integer.parseInt(rectangleValues[0]);
        int minSize = minValue(minValue(length_width, width_height), height_length);
        return (2 * length_width) + (2 * width_height) + (2 * height_length) + minSize;
    }
}
