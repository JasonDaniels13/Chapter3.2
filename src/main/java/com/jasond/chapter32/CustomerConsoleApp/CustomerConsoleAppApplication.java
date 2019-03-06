package com.jasond.chapter32.CustomerConsoleApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.Console;
import java.util.Scanner;

@SpringBootApplication
public class CustomerConsoleAppApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CustomerConsoleAppApplication.class, args);

        Scanner input = new Scanner(System.in);
		System.out.println("Enter first name");
        String firstName = input.nextLine() ;
        System.out.println("Enter last name");
        String lastName = input.nextLine();





//        ICustomerService customerService = new CustomerService.CustomerService(customerValidation, customerStorage);
//
//        if (customerService.SaveCustomer(customer))
//        {
//                System.out.println("Customer saved successfully");
//        } else
//                System.out.println("Customer failed to save");
//        input.nextLine();
	}

}
