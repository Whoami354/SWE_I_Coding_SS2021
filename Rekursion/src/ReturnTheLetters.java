public class ReturnTheLetters {
    public static void main(String[] args) {
        ReturnTheLetters rtl = new ReturnTheLetters();
        System.out.println(rtl.findmatch("Hasen(nasen)n"));
        System.out.println(rtl.findmatch("Hasen(nasen"));
        System.out.println(rtl.findmatch("Hasen(asen)(nasen)n"));
        System.out.println(rtl.findmatch("Hasennasen"));


    }

    private String findmatch(String s) {
        return findSymbols(s, 0,false);

    }

    private String findSymbols(String s, int index, boolean safeChars) {
        if (s.length() <= index) {
            return "";
        }
        if (s.charAt(index) == '(') {
            safeChars = true;
        }

        if (s.charAt(index) == ')') {
            return ")";
        }
        if (safeChars) {
            String findsymbol = findSymbols(s, index + 1,true);
            if(findsymbol.length()==0){
                return "";
            }
            if(findsymbol.charAt(findsymbol.length()-1) == ')'){
                return s.charAt(index) + findsymbol;
            }
            return "";
        }
        return findSymbols(s, index + 1, false);
    }
}
