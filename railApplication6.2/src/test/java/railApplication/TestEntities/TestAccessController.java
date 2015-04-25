package railApplication.TestEntities;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import railApplication.Domain.AccessController;

/**
 * Created by student on 2015/04/22.
 */
public class TestAccessController {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testAccessController() throws Exception {

        AccessController accessController = new AccessController.Builder(30014).firstName("ansel")
    .lastName("Ghansel").stationName("Bellville").build();
    int employeeNumber = accessController.getEmployeeNumber();


       // Assert.assertEquals("miami",accessController.getFirstName());

        // She gets married

      accessController = new AccessController.Builder(30014).firstName("ansel")
                .lastName("Willian").stationName("Bellville").build();





        Assert.assertEquals("Ghansel",accessController.getLastName());



   }
}
