package ma.imadfaouzi.billing;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "user")
@Data
public class MyConsulConfig {
    private long x;
    private long y;
}
