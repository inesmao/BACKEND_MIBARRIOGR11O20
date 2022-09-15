package co.edu.uis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
public class ProyectoBaseCiclo3Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ProyectoBaseCiclo3Application.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProyectoBaseCiclo3Application.class, args);
    }

}
