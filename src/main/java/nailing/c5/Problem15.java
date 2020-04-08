package nailing.c5;

public class Problem15 {

    public static void main(String[] args) {

        String[] moons = { "Luna", "Phobos", "Deimos" };

        byte b = 0;
        do
        while (b < moons.length)
            System.out.println(b++);
        while (b < moons.length);
    }
}
