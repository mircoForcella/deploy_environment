package deploy_environment.deploy_environment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BasicController {

    @GetMapping("/sum")
    public int sumNumbers(){
        Random random  = new Random() ;
        int x = random.nextInt(100);
        int y = random.nextInt(100);
        return x+y;
    }
}
