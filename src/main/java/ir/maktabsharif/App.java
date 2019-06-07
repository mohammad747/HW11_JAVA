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

        BreedType[] breeds = BreedType.values();

        for (int i = 0; i < 99; i++) {

            Cat cat = new Cat("cat" + (i + 1));
            cat.setBreed(breeds[i]);
            cats.add(cat);
        }


        Stream<Cat> catStream = cats.stream().filter(cat -> cat.getBreed().startsWith("A") || cat.getBreed().startsWith("C") || cat.getBreed().startsWith("P"));
//        catStream.forEach(System.out::println);


        List<Cat> catList = new ArrayList<>();
        catStream.forEach(cat -> {
            String number = "";
            Integer number2 = null;

            for (int i = 0; i < cat.name.length(); i++) {

                Character character = cat.name.charAt(i);

                if (Character.isDigit(character)) {
                    number += character;
                    if (i == cat.name.length()-1) {
                        number2 =  Integer.parseInt(number);
                        if (number2 % 2 == 0) {
                            catList.add(cat);
                        }
                    }
                }
            }
        });

//        catList.forEach(System.out::println);


        Stream<BreedType> breedTypeStream = catList.stream().map(Cat::getBreed2);
//        breedTypeStream.forEach(System.out::println);
        

        List<BreedType> breedTypeList = breedTypeStream.collect(Collectors.toList());
        breedTypeList.forEach(System.out::println);




    }
}


