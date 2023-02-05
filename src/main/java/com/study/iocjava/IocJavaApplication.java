package com.study.iocjava;

import com.study.iocjava.domain.Customer;
import com.study.iocjava.service.ActiveCustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IocJavaApplication {

    private static final Logger logger = LoggerFactory.getLogger(IocJavaApplication.class);
    private static ActiveCustomerService activeCustomerService;

    public IocJavaApplication(ActiveCustomerService activeCustomerService) {
        IocJavaApplication.activeCustomerService = activeCustomerService;
    }

    public static void main(String[] args) {
        SpringApplication.run(IocJavaApplication.class, args);

        var caio = Customer.builder()
                .withName("Caio Antonio")
                .withEmail("caio@email.com")
                .withPhone("1998374834")
                .build();

        logger.info("Instantiated object \"{}\"", caio);

        activeCustomerService.active(caio);
    }
}
