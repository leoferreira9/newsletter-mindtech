package leo.mindtech_newsletter.service;

import leo.mindtech_newsletter.exception.EmailAlreadyRegisteredException;
import leo.mindtech_newsletter.exception.EmailNotFoundException;
import leo.mindtech_newsletter.model.Subscriber;
import leo.mindtech_newsletter.repository.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriberService {

    @Autowired
    private SubscriberRepository subscriberRepository;

    public Subscriber subscribe(Subscriber subscriber){
        if(subscriberRepository.findByEmail(subscriber.getEmail()).isPresent()) throw new EmailAlreadyRegisteredException("Email already registered!");
        return subscriberRepository.save(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        if(subscriberRepository.findByEmail(subscriber.getEmail()).isEmpty()) throw new EmailNotFoundException("Email not registered!");
        Subscriber existingSubscriber = subscriberRepository.findByEmail(subscriber.getEmail()).get();
        subscriberRepository.delete(existingSubscriber);
    }
}
