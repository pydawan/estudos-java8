import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HelloList03 {
    public static void main(String[] args) {
    
        // ArrayList initialization
    
        // 1. Using Arrays.asList()
        List<String> names = Arrays.asList("Tonico", "Patrícia", "Lorena");
        names.forEach(System.out::println);

        // 2. Using a Anonymous Inner Class (bloco de inicialização dinâmico)
        List<String> surnames = new ArrayList<String>() {{
            add("Moraes Moreira");
            add("Rodrigues Peixoto");
            add("Rodrigues Peixoto Carneiro");
        }};
        surnames.forEach(System.out::println);

        // 3. Using the Normal way
        List<String> fathersFamily = new ArrayList<>();
        fathersFamily.add("Alberto Morares Moreira");
        fathersFamily.add("Epitácia Moraes Moreira da Silva");
        fathersFamily.add("Camila Moraes Moreira da Silva");
        fathersFamily.forEach(System.out::println);

        // 4. Using the Collections.ncopies()
        ArrayList<String> faithSentences = new ArrayList<>(Collections.nCopies(10, "In god we trust!"));
        faithSentences.forEach(System.out::println);
    }
}
