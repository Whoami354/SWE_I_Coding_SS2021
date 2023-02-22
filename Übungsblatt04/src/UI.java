import java.util.List;
import java.util.Scanner;

public class UI {
    private Dictionary looking;
    public UI(Dictionary looking){
        this.looking = looking;
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        String search;
        do {
            System.out.println("Hallo, ich bin das Reimwörterbuch!\n" + "Gib mir bitte eine Endung ein, wo Du Reime suchst");
            search = sc.nextLine();
            if(search.equals("exit")){
                break;
            }
            List<String> safe = looking.search(search);
            for (String word : safe) {
                System.out.println(word);
            }
        }while (true);

    }


}
