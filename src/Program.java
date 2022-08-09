public class Program
{
    public static void main(String[] args)
    {
        Homework aa = new Homework("test", "math", "12 dec", "easy");
        Homework bb = new Homework("essay", "english", "1 dec", "hard");
        Homework cc = new Homework("worksheet", "physics", "20 dec", "medium");
        Homework.getAssignmentNumber();
        Homework.removeAssignment("test");
        Homework.getAssignmentNumber();
        System.out.println(aa.getCourse());
        aa.setCourse("APCSA");
        System.out.println(aa.getCourse());
    }
}