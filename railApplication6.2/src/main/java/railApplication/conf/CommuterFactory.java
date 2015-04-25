package railApplication.conf;

import railApplication.Domain.Commuter;

import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */
public class CommuterFactory {


    public static Commuter createCommuter(String firstName,Map<String,String>values,String contactNumber)
    {

        Commuter commuter = new Commuter.Builder(values.get("7865")).lastName(values.get("Howdes"))
                .firstName("Masy").contactNumber("078 557n 2543").build();



        return commuter;
    }


}
