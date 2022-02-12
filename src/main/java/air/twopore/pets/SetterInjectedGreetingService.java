package air.twopore.pets;

import com.cnm.poreair.depinjection.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
    
}
