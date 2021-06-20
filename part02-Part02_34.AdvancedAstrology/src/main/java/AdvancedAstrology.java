
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int k = 1; k <= number; k++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int j = 1;
        while (j <= number) {
            System.out.print(" ");
            j++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 1;
        while (i <= size) {
            printSpaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars((i * 2) - 1);
        }
        for (int j = 1; j <= 2; j++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        //printStars(3);
        //printTriangle(4);
        //System.out.println("---");
        christmasTree(10);
        //System.out.println("---");
        //christmasTree(10);
    }
}
