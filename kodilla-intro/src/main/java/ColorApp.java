public class ColorApp {
    public static void main(String[] args) {
        GetColor color = new GetColor();
        String col = color.getColor();
        System.out.println("Your color is: " + col);
    }
}
