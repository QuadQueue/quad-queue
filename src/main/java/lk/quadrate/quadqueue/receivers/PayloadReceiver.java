package lk.quadrate.quadqueue.receivers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayloadReceiver {

    @PostMapping("/receiver")
    public void receive(@RequestBody String s){
        System.out.println(s);
    }
}
