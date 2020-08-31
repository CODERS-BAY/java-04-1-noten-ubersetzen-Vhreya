import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();

        switch (grade) {
            case 1 -> System.out.println("Very good!");
            case 2 -> System.out.println("Good");
            case 3 -> System.out.println("Satisfactory");
            case 4 -> System.out.println("Sufficient");
            case 5 -> System.out.println("Not sufficient");
        }
    }
}
