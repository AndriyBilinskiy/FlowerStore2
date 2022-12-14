package ua.edu.ucu.apps.demo.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.demo.payments.PayPalPayment;
import ua.edu.ucu.apps.demo.payments.Payment;

import java.util.List;

@RequestMapping("/payment")
@RestController
public class FlowerController {
    @GetMapping
    public List<FlowerBucket> getBuckets(){
        return List.of(new FlowerBucket());
    }
}
