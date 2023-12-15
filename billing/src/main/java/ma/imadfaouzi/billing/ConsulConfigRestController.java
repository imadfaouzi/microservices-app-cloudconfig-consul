package ma.imadfaouzi.billing;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope

public class ConsulConfigRestController {

    @Autowired
    private MyConsulConfig myConsulConfig;
//    @Value("${user.x}")
//    private long x = 3L;
//    @Value("${user.y}")
//    private long y = 2L;

    @GetMapping("/myConfigConsul")
    public MyConsulConfig myConfig(){
        return  myConsulConfig;
    }

}
