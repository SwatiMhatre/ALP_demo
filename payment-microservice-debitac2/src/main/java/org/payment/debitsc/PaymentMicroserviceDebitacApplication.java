package org.payment.debitsc;

import org.payment.cache.DataInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan({ "org.payment" }) 
public class PaymentMicroserviceDebitacApplication {
	
	public static void main(String[] args) {
		//SpringApplication.run(PaymentMicroserviceDebitacApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(PaymentMicroserviceDebitacApplication.class, args);

        context.getBean(DataInitializer.class).fillWithTestdata();
	}
	
}

