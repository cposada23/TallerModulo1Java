package Ejercicio13;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Make an algorithm that allows you to query the current date and time in the format (YYYYY/MM/DD) (HH:MM:SS)
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("(yyyy/MM/dd) (hh:mm:ss)");
        System.out.println(simpleDateFormat.format(now));
    }
}
