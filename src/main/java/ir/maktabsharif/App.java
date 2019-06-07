package ir.maktabsharif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {


        List<Cat> cats = new ArrayList<>();

        // Create an array of BreedType
        BreedType[] breeds = BreedType.values();

        // Create list of cats with their name and breed type
        for (int i = 0; i < 99; i++) {

            Cat cat = new Cat("cat" + (i + 1));
            cat.setBreed(breeds[i]);
            cats.add(cat);
        }


        // part 2-1
        // Create stream of cats that their breed type start with only these characters {A, C, P}
        Stream<Cat> StartsWithACP = cats.stream().filter(cat -> cat.getBreed().startsWith("A") || cat.getBreed().startsWith("C") || cat.getBreed().startsWith("P"));
//        StartsWithACP.forEach(System.out::println);


        // part 2-2
        // Return cats witch their name's numbers is EVEN
        List<Cat> evenIndexCats = new ArrayList<>();
        StartsWithACP.forEach(cat -> {
            String nameIndex = "";
            Integer nameIndexInInteger = null;

            for (int i = 0; i < cat.name.length(); i++) {

                Character eachCharacter = cat.name.charAt(i);

                if (Character.isDigit(eachCharacter)) {
                    nameIndex += eachCharacter;
                    if (i == cat.name.length() - 1) {
                        nameIndexInInteger = Integer.parseInt(nameIndex);
                        if (nameIndexInInteger % 2 == 0) {
                            evenIndexCats.add(cat);
                        }
                    }
                }
            }
        });

//        evenIndexCats.forEach(System.out::println);

        // part 2-3
        // Map cats with their breed type
        Stream<BreedType> breedTypeStream = evenIndexCats.stream().map(Cat::getBreed2);
//        breedTypeStream.forEach(System.out::println);

        // part 2-4
        // Create a list of (part 2-3) step
        List<BreedType> breedTypeList = breedTypeStream.collect(Collectors.toList());
        breedTypeList.forEach(System.out::println);


    } // End of main
} // End of class


