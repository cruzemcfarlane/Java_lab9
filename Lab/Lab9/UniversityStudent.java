package Lab9;

public class UniversityStudent extends Student
{
    private String faculty;
    
    public UniversityStudent(String name, int id, double avGrade, String faculty)
    {
        super(name, id, avGrade);
        this.faculty = faculty;
        
        setAverage(avGrade);
    }
    
    public double calculateGPA()
    {
        if(avGrade > 93)
        {
            gpa = 4.0;
        }
        
        else if(avGrade > 89 && avGrade <= 93)
        {
            gpa = 3.7;
        }
        
        else if(avGrade > 86 && avGrade <= 89)
        {
            gpa = 3.3;
        }
        
        else if(avGrade > 83 && avGrade <= 86)
        {
            gpa = 3.0;
        }
        
        else if(avGrade > 79 && avGrade <= 83)
        {
            gpa = 2.7;
        }
        
        else if(avGrade > 76 && avGrade <= 79)
        {
            gpa = 2.3;
        }
        
        else if(avGrade > 72 && avGrade <= 76)
        {
            gpa = 2.0;
        }
        
        else if(avGrade > 69 && avGrade <= 72)
        {
            gpa = 1.7;
        }
        
        else if(avGrade > 67 && avGrade < 69)
        {
            gpa = 1.3;
        }
        
        else if(avGrade > 59 && avGrade <= 66)
        {
            gpa = 1.0;
        }
        
        else if(avGrade >= 0 && avGrade <= 59)
        {
            gpa = 0.0;
        }
        
        return gpa;
    }
    
    public String toString()
    {
        return "Name: " + name
               + "\nID: " + id
               + "\nAverage: " + avGrade
               + "\nGPA: " + calculateGPA()
               + "\nFaculty: " + faculty;
    }
}