package Lab9;

import java.util.ArrayList;

public class Application
{
    public static void main(String[] args)
    {
        ArrayList<UniversityStudent> student = new ArrayList <UniversityStudent> (4);
        
        student.add(new UniversityStudent("Cruze", 6300, 98, "SoSci"));
        student.add(new UniversityStudent("Raynor", 6200, 87, "SciTech"));
        student.add(new UniversityStudent("Artnell", 6100, 79, "SciTech"));
        student.add(new UniversityStudent("Looser", 6000, 40, "Law"));
                  
        (student.get(3)).setAverage(48);
        
        for(UniversityStudent count: student)
        {
            System.out.println(count);
            System.out.println();
        }
        
         System.out.println(UniversityStudent.getHighestGrade());
    }
}