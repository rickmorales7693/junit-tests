import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CohortTest {

    private Cohort emptyCohort;
    private Cohort actualCohort;

    @Before
    public void setup(){
        actualCohort = new Cohort();
    }


    @Test
    public void testCohortConstructor(){
        assertNull(emptyCohort);
        assertNotNull(actualCohort);
    }

    @Test
    public void testCohortAddStudent(){
        Student actualStudent = new Student(1L, "Rick");
        actualCohort.addStudent(actualStudent);
        assertEquals(Arrays.asList(actualStudent), actualCohort.getStudents());
    }

    @Test
    public void testCohortGetCohortAverage(){
        Student actualStudent = new Student(1L, "Rick");
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);
        Student actualStudent2 = new Student(1L, "Morty");
        actualStudent2.addGrade(0);
        actualStudent2.addGrade(25);
        actualStudent2.addGrade(50);
        actualCohort.addStudent(actualStudent);
        actualCohort.addStudent(actualStudent2);
        assertEquals(75, actualCohort.getCohortAverage(), 0.000001);
        assertEquals(50, actualCohort.getCohortAverage(), 0.000001);
    }











}
