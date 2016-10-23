package exercise.flow;

/**
 * @author daniel.bubenheim@gmail.com
 */
public class SwitchExercises {

    public static void main(final String... args) {

        byte b = 127;
        switch (b) {

            case 1:
                ;
            case 10:
                ;
            case 100:
                ;
            case 127:
                ;
                //            case 128: ; incompatible

        }

        int l = 1000;
        switch (l) {
            case 2:
                ;
            case 3:
                ;
            case 40:
                ;
            case 99:
                ;
            default:
                ;
            case 1:
                ;
        }

        char c = 'c';
        switch (c) {
            case 1:
                ;
            case 2:
                ;
            case 3:
                ;
            case 4:
                ;
            case 200:
                ;
            case 2000:
                ;
            case 20000:
                ;
            case 30000:
                ;
            case 65535:
                ;
                //            case 65536: ; incompatible
        }

        final String monthString;
        int month = 8;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);
    }
}