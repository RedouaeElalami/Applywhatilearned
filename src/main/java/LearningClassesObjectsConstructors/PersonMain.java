package LearningClassesObjectsConstructors;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonMain
{
    public static void main(String[] args) {
        List<Person> personnes = Arrays.asList(
                new Person("elalami","Redouane",26),
                new Person("cer","kaka",25)
        );
        Collections.sort(personnes, (p1, p2)->  p2.getLn().compareTo(p1.getLn()));
        printAll(personnes );
    }

    private static void printAll(List<Person> personnes) {
        for(Person p:personnes)
        {
            System.out.println("p = " + p);
        }
    }


}
