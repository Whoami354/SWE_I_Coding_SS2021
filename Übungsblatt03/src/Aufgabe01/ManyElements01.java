package Aufgabe01;
public class ManyElements01 {
    public static void main(String[] args) {
        int[] test1 = {1,3,3,2,2,2,1,2};
        int[] test2 = {5,5,4,5,1,1,2,2,8,8,5,5,5,5,5,9,9,8,7,6,5};
        int[] test3 = {9,9,9,9,8,7,5,9,1};
        System.out.println(ManyElements(test1));

        System.out.println(ManyElements(test2));

        System.out.println(ManyElements(test3));
    }

    public static int ManyElements(int[] el){
        int arrlength= el.length;
        int number=el[0];
        int counter;
        int countermax=0;
        for(int i = 0; i < arrlength;i++){
            counter=0;
            for (int j=0;j < arrlength;j++){
                if(el[j] == el[i]){
                    counter++;
                }
            }
            if(counter >= countermax){
                countermax = counter;
                number=el[i];
            }
        }
        return number;
    }

}
