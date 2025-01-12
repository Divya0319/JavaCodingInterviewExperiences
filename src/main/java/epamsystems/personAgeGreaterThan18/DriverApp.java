package epamsystems.personAgeGreaterThan18;

/* Given a Entity class with List of person as member, and getters and setters
        Next class given Person containing age and name as data member,

       We have this List of entities passed into a method, we need to return a filtered list of person names which have age greater than 18.

 Keep in mind that given List contains another list in it(List of entities containing List of persons at every entry of it) */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DriverApp {

    public static void main(String[] args) {
        List<Entity> entities = new ArrayList<>();

        Entity entity1 = new Entity();
        entity1.setPersons(List.of(new Person("Alice",20), new Person("Bob", 17)));

        Entity entity2 = new Entity();
        entity2.setPersons(List.of(new Person("Charlie", 25), new Person( "David", 16)));

        entities.add(entity1);
        entities.add(entity2);

        List<String> filteredNames = getFilteredPersonNames(entities);
        System.out.println(filteredNames);
    }

    public static List<String> getFilteredPersonNames(List<Entity> entities) {
        return entities.stream()
                .flatMap(entity -> entity.getPersons().stream())
                .filter(person -> person.getAge() > 18)
                .map(Person::getName)
                .collect(Collectors.toList());
    }
}
