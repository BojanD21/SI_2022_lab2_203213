import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;

public class SILab2Test {
    private List<String> list(String... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void testEveryStatement() {
        IllegalArgumentException ilex;

        //["0", "#", "0", "0", "0", "#", "0", "#", "#"]
        List<String> list1 = new ArrayList<>();
        list1.add("0");
        list1.add("#");
        list1.add("0");
        list1.add("0");
        list1.add("0");
        list1.add("#");
        list1.add("0");
        list1.add("#");
        list1.add("#");

        List<String> result1 = new ArrayList<>();
        result1.add("1");
        result1.add("#");
        result1.add("2");
        result1.add("0");
        result1.add("3");
        result1.add("#");
        result1.add("1");
        result1.add("#");
        result1.add("#");


        assertEquals(result1, SILab2.function(list1));

        List<String> list2 = new ArrayList<>();

        ilex=assertThrows(IllegalArgumentException.class,()->SILab2.function(list2));
        assertTrue(ilex.getMessage().contains("List length should be greater than 0"));

        List<String> list3 = new ArrayList<>();
        //["0", "0, "#", "#", "0", "#"]
        list3.add("0");
        list3.add("0");
        list3.add("#");
        list3.add("#");
        list3.add("0");
        list3.add("#");

        ilex=assertThrows(IllegalArgumentException.class,()->SILab2.function(list3));
        assertTrue(ilex.getMessage().contains("List length should be a perfect square"));

    }

    @Test
    void testEveryBranch(){
        IllegalArgumentException ilex;

        //["0", "#", "0", "0", "0", "#", "0", "#", "#"]
        List<String> list1 = new ArrayList<>();
        list1.add("0");
        list1.add("#");
        list1.add("0");
        list1.add("0");
        list1.add("0");
        list1.add("#");
        list1.add("0");
        list1.add("#");
        list1.add("#");

        List<String> result1 = new ArrayList<>();
        result1.add("1");
        result1.add("#");
        result1.add("2");
        result1.add("0");
        result1.add("3");
        result1.add("#");
        result1.add("1");
        result1.add("#");
        result1.add("#");


        assertEquals(result1, SILab2.function(list1));

        List<String> list2 = new ArrayList<>();

        ilex=assertThrows(IllegalArgumentException.class,()->SILab2.function(list2));
        assertTrue(ilex.getMessage().contains("List length should be greater than 0"));

        List<String> list3 = new ArrayList<>();
        //["0", "0, "#", "#", "0", "#"]
        list3.add("0");
        list3.add("0");
        list3.add("#");
        list3.add("#");
        list3.add("0");
        list3.add("#");

        ilex=assertThrows(IllegalArgumentException.class,()->SILab2.function(list3));
        assertTrue(ilex.getMessage().contains("List length should be a perfect square"));

    }

}