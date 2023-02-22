public class Brackets {
    public static void main(String[] args) {
        System.out.println(checkBrackets("((a)((())))"));
        System.out.println(checkBrackets("(b()))(d)("));
        System.out.println(checkBrackets("((xyz)(abc))(ws)"));
        System.out.println(checkBrackets(")("));
        System.out.println(checkBrackets("((((((((()()))))))))"));
        System.out.println(checkBrackets("(b))("));
    }

    public static boolean checkBrackets(String brackets) {
        int countbrackets = 0;
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') {
                countbrackets++;
            }
            if (brackets.charAt(i) == ')') {
                countbrackets--;
            }
            if (countbrackets < 0) return false;
        }
        return (0 == countbrackets);
    }
}
