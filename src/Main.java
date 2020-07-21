import java.util.List;

import static algs.KnuthMorrisPrattAlg.searchOccurrencesByKmpAlg;

public class Main {

    public static void main(String[] args) {
        List<Integer> occurrences = searchOccurrencesByKmpAlg("ABACABAD", "ABA");
        System.out.println(occurrences); // [0, 4]
    }
}
