public class Student {
    private String name;
    private Integer year;

    public Student(String name, Integer year) {
        this.name = name;
        this.year = year;
    }
    public static Student of(String name, Integer year){
        return new Student(name, year);
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }
}
