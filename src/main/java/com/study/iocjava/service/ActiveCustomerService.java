package com.study.iocjava.service;

import com.study.iocjava.domain.Customer;
import com.study.iocjava.notification.NotifyEmail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ActiveCustomerService {

    private NotifyEmail notifyEmail;
    private final Logger logger = LoggerFactory.getLogger(ActiveCustomerService.class);

    public ActiveCustomerService() {
        logger.info("Constructor \"{}\" called.", ActiveCustomerService.class);
    }

    public void active(Customer customer) {
        customer.active();
        logger.info("Activated user.");

        notifyEmail.notify(customer, "Your registration in the system is active.");
    }
}
