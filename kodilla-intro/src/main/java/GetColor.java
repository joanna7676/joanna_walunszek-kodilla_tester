import java.util.Scanner;

public class GetColor {
    public static String getColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select letter (B, F, G, P, R, Y, W):");
            String color = scanner.nextLine().trim().toUpperCase();
            if (color.equals("B")) {
                return "BLACK";
            } else if (color.equals("F")) {
                return "FIOLET";
            } else if (color.equals("G")) {
                return "GREEN";
            } else if (color.equals("P")) {
                return "PURPLE";
            }  else if (color.equals("R")) {
                return "RED";
            } else if (color.equals("Y")) {
                return "YELLOW";
            } else if (color.equals("W")) {
                    return "WHITE";
            }
            System.out.println("Wrong letter. Try again.");
        }
    }
}
