import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList grades;

    public Student() {}

    public Student(long id, String name, ArrayList grades){
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    // returns the student's id
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }


    // returns the student's name
    public String getName(){
       return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }


    // returns the list of grades
    public ArrayList getGrades(){
        return grades;
    }

    public void setGrades(ArrayList grades){
        this.grades = grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){}

}
