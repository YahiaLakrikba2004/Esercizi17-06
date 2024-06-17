package epicode.u5d1;


import epicode.u5d1.entities.Menu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication

public class U5D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5D1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D1Application.class);

		Menu m = (Menu) ctx.getBean("menu");

		m.printMenu();
		ctx.close();
	}

}