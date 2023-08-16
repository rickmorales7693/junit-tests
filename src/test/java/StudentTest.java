import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.ArrayList.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


public class StudentTest {

    private Student emptyStudent;
    private Student actualStudent;


    @Test
    public void studentNoArgConstructor() {
        actualStudent = new Student();

        //assert that emptyCoffee is null
        assertNull(emptyStudent);
        //assert that actualCoffee is Not null
        assertNotNull(actualStudent);
    }

    @Test
    public void studentThreeArgConstructor() {
        assertNotNull(actualStudent);
    }

    @Test
    public void studentGetters() {
        assertEquals(actualStudent.getId(), 123456);
        assertEquals(actualStudent.getName(), "Rick Morales");
        assertEquals(actualStudent.getGrades(), 89);
    }

    @Test
    public void studentSetter(){
        actualStudent.setId(123456);
        assertEquals(actualStudent.getId(), 123456);

        actualStudent.setName("Rick Morales");
        assertEquals(actualStudent.getName(), "Rick Morales");

        actualStudent.setGrades(89);
        assertEquals(actualStudent.getGrades(), 89);

    }



}
