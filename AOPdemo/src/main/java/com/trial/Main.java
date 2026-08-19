package com.trial;

import com.trial.service.CalculatorService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main implements CommandLineRunner {

    private final ApplicationContext context;

    public Main(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String[] args) {

        CalculatorService calculator =
                context.getBean(CalculatorService.class);

        System.out.println("\n--- ADD ---");

        int result1 = calculator.add(10, 20);

        System.out.println("Final result: " + result1);

        System.out.println("\n--- SUBTRACT ---");

        int result2 = calculator.subtract(30, 10);

        System.out.println("Final result: " + result2);

        System.out.println("\n--- DIVIDE ---");

        try {

            int result3 = calculator.divide(10, 0);

            System.out.println("Final result: " + result3);

        } catch (Exception e) {

            System.out.println(
                    "Main caught exception: " + e.getMessage()
            );
        }
    }

    public static void main(String[] args) {

        SpringApplication.run(
                Main.class,
                args
        );
    }
}