package telran.photoSelector.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhotoSelector {
    // TODO - String builder сделать в ДЗ вместе с тестами (получится один for и там значения). + метод append + toString().split
    // ToDO* -> Pattern and Matcher (compile). Matcher -> reset + find



    public static String[] selectPictures(String[] pictures, String regex){
        StringBuilder sb = new StringBuilder();

        for (String picture : pictures){
            if(picture.matches(regex)){
                sb.append(picture).append(",");

            }
        }
    return sb.toString().split(",");
    }

    public static String[] selectPictureAgain(String[] pictures, String regex){
        Pattern pattern = Pattern.compile(regex);
        StringBuilder sb = new StringBuilder();

        for (String picture : pictures){
            Matcher matcher = pattern.matcher(picture);
            if (matcher.matches()) {
                sb.append(picture).append(",");
            }
        }
    return sb.toString().isEmpty() ? new String[0] : sb.toString().split(",");
    }


    /*


    public static String[] selectPictures(String[] pictures, String regex) {
        int size = 0;
        for (int i = 0; i < pictures.length; i++) {
            if (pictures[i].matches(regex)){
                size++;
            }
        }
        String[] res = new String[size];
        for (int j = 0, k = 0; j < res.length; k++) {
            if (pictures[k].matches(regex)){
                res[j++] = pictures[k];
            }
        }

        return res;
    }


     */
}
