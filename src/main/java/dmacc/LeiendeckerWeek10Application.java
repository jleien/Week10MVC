package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.beverage;
import dmacc.controller.beanconfig;
import dmacc.repo.bevrepo;

@SpringBootApplication
public class LeiendeckerWeek10Application {
	public static void main(String[] args) {
		SpringApplication.run(LeiendeckerWeek10Application.class, args);
	}

	@Autowired
	bevrepo repo;

	public void run(String... args) throws Exception {
// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(beanconfig.class);
//Using an existing bean
		beverage b = appContext.getBean("beverage", beverage.class);
		b.setFlavor("Limon Cello");
		repo.save(b);
	}
}
