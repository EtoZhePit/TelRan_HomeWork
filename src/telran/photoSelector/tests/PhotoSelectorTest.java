package telran.photoSelector.tests;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static telran.photoSelector.tools.PhotoSelector.selectPictureAgain;
import static telran.photoSelector.tools.PhotoSelector.selectPictures;


/*

Download file Photo.txt
 Full list of picture file Names for selection in format:
folder\\YYYYMMDD_hhmmss.ext, where:
folder - name of folder equal to location where picture was taken
YYYY, MM, DD - year, month, day
hh,mm,ss - hours, minutes, seconds
Write the following tests:
Test 1. All Europe pictures
Test 2. All autumn pictures
Test 3  All 2015 spring pictures
Test 4. * All night pictures (from 18:00 till 24:00)
Test 5. * All night pictures from Chicago
Test 6. * All jpg and png pictures

"Paris\\20140101_090000.jpg",
"Paris\\20140201_121005.jpg",
"Paris\\20150301_211035.jpg",
"Paris\\20150401_110023.gif",
"Paris\\20150401_181705.jpg",
"Paris\\20150501_231035.gif",
"London\\20140205_090000.jpg",
"London\\20140205_121005.jpg",
"London\\20140601_211035.gif",
"London\\20151001_110023.jpg",
"London\\20151001_121705.jpg",
"London\\20151001_231035.jpg",
"Chicago\\20150301_120001.png",
"Chicago\\20151111_232000.png"


 */

class PhotoSelectorTest {
    private static final String[] pictures = { //

            "Paris\\20140101_090000.jpg",
            "Paris\\20140201_121005.jpg",
            "Paris\\20150301_211035.jpg",
            "Paris\\20150401_110023.gif",
            "Paris\\20150401_181705.jpg",
            "Paris\\20150501_231035.gif",
            "London\\20140205_090000.jpg",
            "London\\20140205_121005.jpg",
            "London\\20140601_211035.gif",
            "London\\20151001_110023.jpg",
            "London\\20151001_121705.jpg",
            "London\\20151001_231035.jpg",
            "Chicago\\20150301_120001.png",
            "Chicago\\20151111_232000.png"

    };

    @Test
    void testAllEuropePictures(){
        String regex = "(Paris|London).*";  // ^ начало строки
        String[] actual = selectPictureAgain(pictures, regex);
        String[] expected = {

                "Paris\\20140101_090000.jpg",
                "Paris\\20140201_121005.jpg",
                "Paris\\20150301_211035.jpg",
                "Paris\\20150401_110023.gif",
                "Paris\\20150401_181705.jpg",
                "Paris\\20150501_231035.gif",
                "London\\20140205_090000.jpg",
                "London\\20140205_121005.jpg",
                "London\\20140601_211035.gif",
                "London\\20151001_110023.jpg",
                "London\\20151001_121705.jpg",
                "London\\20151001_231035.jpg",
        };
        assertArrayEquals(expected,actual);

    }

    @Test
    void testAllAutumnPictures(){
    String regex =".*\\\\\\d{4}(09|10|11)\\d{2}_\\d{6}\\..*";

        String[] actual = selectPictureAgain(pictures, regex);
        String[] expected = {
                "London\\20151001_110023.jpg",
                "London\\20151001_121705.jpg",
                "London\\20151001_231035.jpg",
                "Chicago\\20151111_232000.png"
        };
        assertArrayEquals(expected,actual);
    }
    @Test
    void All2015SpringPictures(){
        String regex = ".*\\\\2015(03|04|05)\\d{2}_\\d{6}\\..*";

        String[] actual = selectPictureAgain(pictures, regex);
        String[] expected = {
                "Paris\\20150301_211035.jpg",
                "Paris\\20150401_110023.gif",
                "Paris\\20150401_181705.jpg",
                "Paris\\20150501_231035.gif",
                "Chicago\\20150301_120001.png"
        };
        assertArrayEquals(expected,actual);
    }
    @Test
    void allNightPictures(){  //(from 18:00 till 24:00)
        String regex = ".*\\\\\\d{4}\\d{2}\\d{2}_((1[89])|(2[0-3])|00)\\d{4}\\..*";
        String[] actual = selectPictureAgain(pictures, regex);
        String[] expected = {
                "Paris\\20150301_211035.jpg",
                "Paris\\20150401_181705.jpg",
                "Paris\\20150501_231035.gif",
                "London\\20140601_211035.gif",
                "London\\20151001_231035.jpg",
                "Chicago\\20151111_232000.png"
        };
        assertArrayEquals(expected,actual);

    }
    @Test
    void allNightPicturesFromChicago() {
        String regex = "[Cc]hicago\\\\\\d{4}\\d{2}\\d{2}_((1[89])|(2[0-3])|00)\\d{4}\\..*";

        String[] actual = selectPictureAgain(pictures, regex);
        String[] expected = {
                "Chicago\\20151111_232000.png"
        };
        assertArrayEquals(expected,actual);
    }

    @Test
    void allJpgAndPngPictures() {
        String regex = ".*\\\\\\d{4}\\d{2}\\d{2}_\\d{6}.([pP][nN][gG]|[jJ][pP][gG])";

        String[] actual = selectPictureAgain(pictures, regex);
        String[] expected = {
                "Paris\\20140101_090000.jpg",
                "Paris\\20140201_121005.jpg",
                "Paris\\20150301_211035.jpg",
                "Paris\\20150401_181705.jpg",
                "London\\20140205_090000.jpg",
                "London\\20140205_121005.jpg",
                "London\\20151001_110023.jpg",
                "London\\20151001_121705.jpg",
                "London\\20151001_231035.jpg",
                "Chicago\\20150301_120001.png",
                "Chicago\\20151111_232000.png"
        };
        assertArrayEquals(expected,actual);

    }
}
