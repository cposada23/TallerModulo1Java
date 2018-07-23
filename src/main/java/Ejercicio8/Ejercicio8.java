package Ejercicio8;
import Util.Util;
public class Ejercicio8 {
    /**
     * Create an application by console that asks us one day of the week and tells us if it is a working day or not.
     * Use a switch for it.
     */
    public static void main(String[] args) {
        String day;

        try {
            day = Util.readString("Enter the day of the week");
            String result = isWorkingDay(day.toLowerCase());
            System.out.println(result);

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String isWorkingDay(String day) {
        String result = "";
        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                result = day.toUpperCase() + " is a working day";
                break;
            case "saturday":
            case "sunday":
                result = day.toUpperCase() + " is not a working day";
                break;
            default:
                result = "Enter a correct day of the week... In english please";
        }
        return result;
    }

}
