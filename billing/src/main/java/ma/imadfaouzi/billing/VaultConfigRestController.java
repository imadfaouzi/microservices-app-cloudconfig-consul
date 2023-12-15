package ma.imadfaouzi.billing;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VaultConfigRestController {

    @Autowired
    private MyVaultConfig myVaultConfig;

    @GetMapping("/myConfigVault")
    public MyVaultConfig myConfig(){
        return myVaultConfig;
    }
}
