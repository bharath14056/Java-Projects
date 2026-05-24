public class Student
{
    private String name;
    private int id;
    private int[] marks;
    private long phno;

    // Constructor
    Student(String name, int id, int[] marks, long phno)
    {
        this.name = name;
        this.id = id;
        this.marks = marks;
        this.phno = phno;
    }

    // Getter methods
    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public long getPhno()
    {
        return phno;
    }

    // Setter method
    public void setPhno(long phno)
    {
        this.phno = phno;
    }

    // Average marks
    public double avgMarks()
    {
        int sum = 0;

        for(int i=0;i<marks.length;i++)
        {
            sum += marks[i];
        }

        return sum / 5.0;
    }
}
