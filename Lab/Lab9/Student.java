package Lab9;

public abstract class Student
{
    protected String name;
    protected int id;
    protected double avGrade;
    protected double gpa;
    protected static double highestGrade; 
    
    public Student(String name, int id, double avGrade)
    {
        this.name = name;
        this.id = id;
        this.avGrade = avGrade;
        gpa = 0;
    }
    
    public String toString()
    {
        return "Name: " + name
               + "\nID: " + id
               + "\nAverage: " + avGrade
               + "\nGPA: " + gpa;
    }
    
    public static double getHighestGrade()
    {
        return highestGrade;
    }
        
    public void setAverage(double avGrade)
    {
        this.avGrade = avGrade;
        
        if(this.avGrade > highestGrade)
        {
            highestGrade = this.avGrade;
        }
    }
    
    public abstract double calculateGPA();   
}
