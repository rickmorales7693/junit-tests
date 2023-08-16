import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student() {}

    public Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
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
        this.grades.add(grade);
    }


    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades){
        this.grades = grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }

}
