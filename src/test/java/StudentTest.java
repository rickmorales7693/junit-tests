import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


public class StudentTest {

    private Student emptyStudent;
    private Student actualStudent;
    private ArrayList<Integer> emptyArrayList;

    @Before
    public void setup() {
        actualStudent = new Student(1L, "Rick");
        emptyArrayList = new ArrayList<>();
    }

    @Test
    public void studentConstructor() {
        assertNull(emptyStudent);
        assertNotNull(actualStudent);
    }

    @Test
    public void studentGetters() {
        assertEquals(actualStudent.getId(), 1L);
        assertEquals(actualStudent.getName(), "Rick");
        assertNotNull(actualStudent.getGrades());
        assertEquals(actualStudent.getGrades(),emptyArrayList);
    }

    @Test
    public void studentAddGrade(){
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);

        ArrayList<Integer> expectedGrades = new ArrayList<>(Arrays.asList(50,75,100));

        assertEquals(actualStudent.getGrades(), expectedGrades);
    }

    @Test
    public void studentGetGradeAverage(){
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);

        assertEquals(actualStudent.getGradeAverage(), 75, 0.000001);
    }


    @Test
    public void studentSetter(){
        actualStudent.setId(1L);
        assertEquals(actualStudent.getId(), 1L);

        actualStudent.setName("Rick");
        assertEquals(actualStudent.getName(), "Rick");


    }



}
