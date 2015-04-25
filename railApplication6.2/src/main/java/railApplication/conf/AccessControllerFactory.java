package railApplication.conf;

import railApplication.Domain.AccessController;

import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */

public class AccessControllerFactory {

    public static AccessController createAccessController(String fistName,Map<String,String>values,String
                                                          stationName)
    {
        AccessController controller = new AccessController.Builder(values.get("9976")).lastName(values.get(
                
          "Maven")).firstName("Allen").stationName("Nolungile").build();

        return controller;
    }


}
