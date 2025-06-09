package tabell;

/**
 *
 * @author jarih
 */
public class Tabell {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("" + (j * i) + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
    }
}
