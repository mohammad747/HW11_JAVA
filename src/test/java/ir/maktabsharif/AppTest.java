package ir.maktabsharif;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.collection.IsEmptyCollection;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testCreateCatList() {
//        List<Cat> expected = new ArrayList<>();
//        // Create an array of BreedType
//        BreedType[] actualBreeds = BreedType.values();
//
//        // Create list of cats with their name and breed type
//        for (int i = 0; i < 99; i++) {
//
//            Cat cat = new Cat("cat" + (i + 1));
//            cat.setBreed(actualBreeds[i]);
//            expected.add(cat);
//        }
//        String[] expectedArray = (String[]) expected.toArray();

        Object[] expectedCats = new Object[3];

//        @Before
//        public void initInputs () {
//            expectedCats[0] = new Cat("cat",BreedType.values()[0]);
//        }


        List<Cat> actual = App.createListOfCats();
        String[] actualArray = (String[]) actual.toArray();

        assertArrayEquals(expectedCats, actualArray);
//        Assertions.assertEquals(expectedArray, actualArray);


    }
}
