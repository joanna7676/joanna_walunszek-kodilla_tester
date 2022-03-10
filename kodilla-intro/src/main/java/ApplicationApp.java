public class ApplicationApp {
    public static void main(String[] args){
        System.out.println("User");
        Application application = new Application(40.5, 178);
        System.out.println(application.age + " " + application.height + "  ");
        application.checkUser();
    }
}
