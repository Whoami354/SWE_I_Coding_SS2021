package Aufgabe4;
public class HappyOrSad {
    public static void main(String[] args) {
        int happynumber = 49;
        int sadnumber = 42;
        System.out.println(happyOrSad(happynumber));
        System.out.println(happyOrSad(sadnumber));
    }
    public static boolean happyOrSad(int check){
        while(check != 1 && check != 4){
            System.out.print(check + " ");
            check = sum(check);
        }
        return check == 1;
    }
    public static int sum(int check){
        int sum = 0;
        while (check != 0){
            int tmp = check%10;
            check /= 10;
            int mult = tmp*tmp;
            sum+=mult;
        }
        return sum;
    }
}