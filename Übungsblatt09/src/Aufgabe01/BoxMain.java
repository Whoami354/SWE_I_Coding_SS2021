package Aufgabe01;

import java.util.ArrayList;
import java.util.List;

public class BoxMain {
    public static void main(String[] args) {
        List<Boxer> boxers = new ArrayList<Boxer>();
        List<Kampf> fights = new ArrayList<>();
        Rangliste raenge = new Rangliste(boxers);

        boxers.add(new Boxer("Gregory"));
        boxers.add(new Boxer("Alexej"));
        boxers.add(new Boxer("Gustav"));
        boxers.add(new Boxer("Felix"));
        boxers.add(new Boxer("Martin"));

        fights.add(new Kampf(new Boxer[]{boxers.get(0),boxers.get(1)},0));
        fights.add(new Kampf(new Boxer[]{boxers.get(1),boxers.get(2)},0));
        fights.add(new Kampf(new Boxer[]{boxers.get(2),boxers.get(3)},1));
        fights.add(new Kampf(new Boxer[]{boxers.get(3),boxers.get(4)},-1));

        System.out.println(boxers);

        raenge.update(fights);

        System.out.println(boxers);

    }
}
