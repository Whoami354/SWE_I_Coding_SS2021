package Day_02_Part_02;

public class CalcRibbon {

    public int minValue(int a, int b){
        if(a < b)return a;
        return b;
    }

    public int ribbonFeet(String values) {
        String[] singleValue = values.split("x");
        int length = Integer.parseInt(singleValue[0]);
        int width = Integer.parseInt(singleValue[1]);
        int height = Integer.parseInt(singleValue[2]);
        int ribbon_to_wrap = 2 * minValue(minValue(length + width,width + height), height + length);
        int ribbon_for_bow = length * width * height;
        return ribbon_to_wrap + ribbon_for_bow;
    }
}
