package com.microservices.demo.twitter.to.kafka.service.expection;

public class TwitterToKafkaServiceExpection extends  RuntimeException{

    public TwitterToKafkaServiceExpection(){
        super();
    }

    public TwitterToKafkaServiceExpection(String message) {
        super(message);
    }

    public TwitterToKafkaServiceExpection(String message, Throwable cause) {
        super(message, cause);
    }
}
