public class Application {
        String name = "Adam";
        double age = 40.5;
        double height = 178;

    public Application(double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void checkUser() {
        if (this.age > 30 && height > 160) {
            System.out.println("User is older than 30 and taller than 160 cm");
        }
        else {
            System.out.println("User is 30 (or younger) or 160 cm (or shorter)");
        }
    }
}

