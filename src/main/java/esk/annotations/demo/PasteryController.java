package esk.annotations.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import esk.temporary.AlienComponent;

@RestController
@RequestMapping(path = "/pastries")
public class PasteryController {

    @Value("${pastry.type: No pastry type property found}")
    String pastryType;

    @Autowired
    private PasteryService pastryService;

    @Autowired
    private AlienComponent alienComponent;

    @GetMapping
    public String getPastry() {
        alienComponent.sayHello();
        return pastryType + " - " + pastryService.getPastry();
    }
}
