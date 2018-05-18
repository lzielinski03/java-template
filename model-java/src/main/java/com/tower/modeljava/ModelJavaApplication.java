package com.tower.modeljava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ModelJavaApplication {

    private static final Logger log = LoggerFactory.getLogger(ModelJavaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ModelJavaApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ProductosRepository repository, FacturaRepository facturaRepository) {
        return (args -> {
            Producto produc = new Producto("Aceite");
            repository.save(produc);

            Factura factu = new Factura(135.4, produc);
            facturaRepository.save(factu);

            facturaRepository.findAll().forEach(factura -> {
                log.info(factura.toString());
            });

            log.info("LOG: {}", "Customers found with findAll():");
            repository.findAll().forEach(producto -> {
                log.info(producto.toString());
            });
            log.info("-------------------------------");
            for (Producto customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");
        });
    }
}
