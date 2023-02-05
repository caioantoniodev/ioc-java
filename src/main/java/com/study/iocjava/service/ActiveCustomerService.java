package com.study.iocjava.service;

import com.study.iocjava.domain.Customer;
import com.study.iocjava.notification.Notify;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ActiveCustomerService {

    private final Logger logger = LoggerFactory.getLogger(ActiveCustomerService.class);
    private final Notify notify;

    public ActiveCustomerService(Notify notify) {
        logger.info("Constructor \"{}\" called", ActiveCustomerService.class);
        this.notify = notify;
    }

    public void active(Customer customer) {
        customer.active();
        logger.warn("Activated user \"{}\"", customer);

        notify.sendNotification(customer, "Your account in the system is active");
    }
}
