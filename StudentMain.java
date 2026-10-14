public class StudentMain{
    public static void main(String[] args) {
        Student s = new Student("Jolene","Take My Man");
        Student s1 = new Student("Joe","Take My Man");
        Student s2 = new Student("Regan","Werk");

        System.out.println(s.geh(s1));
        System.out.println(s.geh(s2));
    }
}