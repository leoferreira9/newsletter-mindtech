package leo.mindtech_newsletter.controller;

import leo.mindtech_newsletter.model.Subscriber;
import leo.mindtech_newsletter.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class SubscriberController {

    @Autowired
    private SubscriberService subscriberService;

    @PostMapping("/subscribe")
    public Subscriber subscribe(@Validated @RequestBody Subscriber subscriber){
        return subscriberService.subscribe(subscriber);
    }

    @DeleteMapping("/unsubscribe")
    public void unsubscribe(@Validated @RequestBody Subscriber subscriber){
        subscriberService.unsubscribe(subscriber);
    }
}
