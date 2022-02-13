public class LeapYear {
        public static void main(String args[]) {
            int Year = 2021;
            System.out.println(Year);
            if (Year%4 == 0 && Year%100 == 0 && Year%400 == 0){
                System.out.println("Rok przestępny");
            } else {
                System.out.println("Rok nieprzestępny");
            }
        }
}

