import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

class Person implements Comparable<Person> {

    private int id;
    private String name;
    private String surname;
    private int age;

    private static final Random random = new Random();

    public static final class Comparators {
        public static final Comparator<Person> personNameComparator = (p1, p2) -> p1.getName().compareTo(p2.getName());
        public static final Comparator<Person> personAgeComparator = (p1, p2) -> p1.getAge() - p2.getAge();
    }


    public Person(final String name, final String surname, final int age) {
        this.id = random.nextInt(100);
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false
                ;
        if (getClass() != obj.getClass())
            return false;

        Person other = (Person) obj;
        if (id != other.id)
            return false;

        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Person other) {
        return this.getName().compareTo(other.getName());
    }


    @Override
    public String toString() {
        return String.format("Person [name = %s, surname = %s, age = %d]", name, surname, age);
    }

}

public class HelloList05 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Tiago Alberto", "Moraes Moreira", 38),
                new Person("Lorena", "Rodrigues Lopes Moraes Moreira", 4),
                new Person("Patrícia", "Rodrigues Lopes", 41)
        );
        System.out.println("\nPEOPLE\n");
        people.forEach(System.out::println);

        List<Person> peopleComparedByName = new ArrayList<>(people);
        Collections.sort(peopleComparedByName, Person.Comparators.personNameComparator);
        System.out.println("\nPEOPLE ORDERED ASCEDING BY NAME\n");
        peopleComparedByName.forEach(System.out::println);

        List<Person> peopleComparedByAge = new ArrayList<>(people);
        Collections.sort(peopleComparedByAge, Person.Comparators.personAgeComparator);
        System.out.println("\nPEOPLE ORDERED ASCENDING BY AGE\n");
        peopleComparedByAge.forEach(System.out::println);
    }
}
