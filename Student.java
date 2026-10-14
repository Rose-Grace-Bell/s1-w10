public class Student{
    private String MyName;
    private String Club;

    public Student(String MyName, String MyClub){
            this.MyName = MyName ;
            this.Club = MyClub ;
    }

    public String gClub(){
        return Club;
    }

    public String gName(){
        return MyName;
    }

    public Boolean geh(Student stu){
        return stu.Club.equals(this.Club);
    }
}