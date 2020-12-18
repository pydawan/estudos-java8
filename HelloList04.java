import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HelloList04 {
    public static void main(String[] args) {
        List<String> familyMembers = Arrays.asList(
                "Tiago",
                "Ester",
                "Adriano",
                "Poliana",
                "Lucas",
                "Yaná",
                "Antônio",
                "Sandro",
                "Camila",
                "Carla",
                "Lara",
                "Pedro",
                "Carla",
                "Romário",
                "Evilásio"
        );
        System.out.println("\nUNORDERED FAMILY MEMBER NAMES\n");
        familyMembers.forEach(System.out::println);

        Collections.sort(familyMembers);

        System.out.println("\nORDERED FAMILY MEMBER NAMES\n");

        System.out.println("\nASCENDING ORDER\n");
        familyMembers.forEach(System.out::println);

        System.out.println("\nDESCENDING ORDER\n");
        Collections.sort(familyMembers, Collections.reverseOrder());
        familyMembers.forEach(System.out::println);
    }
}
