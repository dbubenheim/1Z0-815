package exercise.wrapper;

/**
 * @author daniel.bubenheim@gmail.com
 */
public class BooleanExercises {

    public static void main(final String... args) {

        // some valueOf tests
        final Boolean boolean1 = Boolean.valueOf(true);
        System.out.format("%-20s%-20s%n", "boolean1", boolean1);
        final Boolean boolean2 = Boolean.valueOf("true");
        System.out.format("%-20s%-20s%n", "boolean2", boolean2);
        final Boolean boolean3 = Boolean.valueOf(" true");
        System.out.format("%-20s%-20s%n", "boolean3", boolean3);
        final Boolean boolean4 = Boolean.valueOf(true);
        System.out.format("%-20s%-20s%n", "boolean4", boolean4);

        // some parseBoolean tests
        final boolean aBoolean1 = Boolean.parseBoolean(" true");
        System.out.format("%-20s%-20s%n", "aBoolean1", aBoolean1);
        final boolean aBoolean2 = Boolean.parseBoolean(" bla");
        System.out.format("%-20s%-20s%n", "aBoolean2", aBoolean2);
        final boolean aBoolean3 = Boolean.parseBoolean("true");
        System.out.format("%-20s%-20s%n", "aBoolean3", aBoolean3);

        // some constructor tests
        final Boolean booleanTrue = new Boolean(true);
        System.out.format("%-20s%-20s%n", "booleanTrue", booleanTrue);
        final Boolean booleanFalse = new Boolean(false);
        System.out.format("%-20s%-20s%n", "booleanFalse", booleanFalse);
        final Boolean booleanTrueString = new Boolean("true");
        System.out.format("%-20s%-20s%n", "booleanTrueString", booleanTrueString);
        final Boolean booleanFalseString = new Boolean("false");
        System.out.format("%-20s%-20s%n", "booleanFalseString", booleanFalseString);
    }
}
