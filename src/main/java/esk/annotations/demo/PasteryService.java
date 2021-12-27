package esk.annotations.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PasteryService {

    @Autowired
    private TestBean testBean;

    public String getPastry() {
        return "Banana Cake";
    }
}
