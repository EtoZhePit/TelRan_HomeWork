package telran.homework.tests;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.BlockingDeque;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;


/*

Implement a comparator that sorts an array of date strings in chronological order.
The strings use either "dd-MM-yyyy" or "dd/MM/yyyy" format.
Use LocalDate for comparison.
Your code must pass the test below.


 */


public class ComparatorTest {


    @Test
    void testDateComparator(){
        String[] dates = { "07-05-1990", "28-01-2010", "11-08-1990", "15-01-2010", "16/06/1970" };
        String[] expected = { "16/06/1970", "07-05-1990", "11-08-1990", "15-01-2010", "28-01-2010" };
        Comparator<String> comp = (d1, d2) -> {

            DateTimeFormatter formatter1 = (d1.contains("-"))?
                    DateTimeFormatter.ofPattern("dd-MM-yyyy"):
                    DateTimeFormatter.ofPattern("dd/MM/yyyy");

            DateTimeFormatter formatter2 = (d2.contains("-"))?
                    DateTimeFormatter.ofPattern("dd-MM-yyyy"):
                    DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate date1 = LocalDate.parse(d1,formatter1);
            LocalDate date2 = LocalDate.parse(d2,formatter2);

            return date1.compareTo(date2);
        };
        Arrays.sort(dates, comp);
        assertArrayEquals(expected, dates);
    }

}
