package com.example.demo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class kafkaProducerController {

    private kafkaProducer kafkaProducer;
    //Constructor
    public kafkaProducerController(kafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
    	kafkaProducer.sendMessage(message);
    	return ResponseEntity.ok("Message sent to kafka topic");
    }
    
    
    
}
