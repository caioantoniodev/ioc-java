package com.study.iocjava.notification;

import com.study.iocjava.domain.Customer;

public interface Notify {
    void sendNotification(Customer customer, String message);
}
