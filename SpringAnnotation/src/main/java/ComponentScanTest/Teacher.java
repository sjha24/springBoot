package ComponentScanTest;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
    public String teach(){
        return "He is a teaching DSA";
    }
}
