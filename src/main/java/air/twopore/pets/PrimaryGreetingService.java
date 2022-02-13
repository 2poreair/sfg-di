package air.twopore.pets;

import com.cnm.poreair.depinjection.services.GreetingService;


public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
    
}
