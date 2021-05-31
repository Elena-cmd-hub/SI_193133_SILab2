public class SILab2Test {
    import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

    public class SILab2Test {

        private List<Time> createList(Integer... elems)
        {
            return new ArrayList<>(Arrays.asList(elems));
        }

        @Test
        public void everyBranch(){
            RuntimeException ex;

            //1
            assertEquals(0, SILab2.function(createList()));

            //2
            assertEquals(3993, SILab2.function(createList(05,55,55)));

            //3
            ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(-03,05,30)));
            assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));

            //4
            ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(77,77,77)));
            assertTrue(ex.getMessage().contains("The hours are grater than the maximum"));

            //5
            ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(10,03,02)));
            assertTrue(ex.getMessage().contains("The minutes are not valid"));

            //6
            ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(02,13,77)));
            assertTrue(ex.getMessage().contains("The seconds are not valid"));

            //7
            ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(14,4,23)));
            assertTrue(ex.getMessage().contains("The time is greater than the maximum"));

            //8
            assertEquals(86400, SILab2.function(createList(27,0,0)));
        }

        @Test
        public void multipleCondition(){
            RuntimeException ex;

            //1
            assertEquals(0, SILab2.function(createList()));

            //2
            assertEquals(3993, SILab2.function(createList(05,55,55)));

            //3
            ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(-03,05,30)));
            assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));

            //4
            ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(77,77,77)));
            assertTrue(ex.getMessage().contains("The hours are grater than the maximum"));

            //5
            ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(10,03,02)));
            assertTrue(ex.getMessage().contains("The minutes are not valid"));

            //6
            ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(02,13,77)));
            assertTrue(ex.getMessage().contains("The seconds are not valid"));

            //7
            ex=assertThrows(RuntimeException.class, () -> SILab2.function(createList(14,4,23)));
            assertTrue(ex.getMessage().contains("The time is greater than the maximum"));

            //8
            assertEquals(86400, SILab2.function(createList(27,0,0)));
        }

    }
}
