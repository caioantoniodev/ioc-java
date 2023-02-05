package com.study.iocjava.notification;

import com.study.iocjava.IocJavaApplication;
import com.study.iocjava.domain.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class NotifyEmail {

    private final Logger logger = LoggerFactory.getLogger(NotifyEmail.class);

    public NotifyEmail() {
        logger.info("Constructor \"{}\" called.", NotifyEmail.class);
    }

    public void notify(Customer customer, String message) {
        logger.info("Notifying \"{}\" by e-mail \"{}\"; Message: \"{}\"",
                customer.getName(), customer.getEmail(), message);
    }
}
