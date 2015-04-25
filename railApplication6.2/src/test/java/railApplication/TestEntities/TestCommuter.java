package railApplication.TestEntities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import railApplication.Domain.Commuter;

/**
 * Created by student on 2015/04/22.
 */
public class TestCommuter {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCommuter() throws Exception {

        Commuter commuter = new Commuter.Builder(1720).firstName("Mbulelo").lastName("Ntongana").
                contactNumber("078 234 2351").build();


       // Assert.assertEquals("078 253 7618",commuter.getContactNum());



        //update obejct information

      commuter = new Commuter.Builder(1720).firstName("Seakamela").lastName("Ntongana").
                contactNumber("078 234 2351").build();

Assert.assertEquals("Denver",commuter.getFirstName());

    }
}
