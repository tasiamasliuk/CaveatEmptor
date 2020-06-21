package com.example.caveatemptor;

import com.example.caveatemptor.models.*;
import com.example.caveatemptor.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.sql.Date;

import static com.example.caveatemptor.models.Address.AddressType.billing;
import static com.example.caveatemptor.models.Address.AddressType.home;
import static com.example.caveatemptor.models.Address.AddressType.shipping;
import static com.example.caveatemptor.models.User.UserType.SELLER;

@SpringBootApplication
public class CaveatemptorApplication {

	private static final Logger log = LoggerFactory.getLogger(CaveatemptorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CaveatemptorApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(CategoryRepository categoryRepository, ItemRepository itemRepository, UserRepository userRepository, CreditCardRepository creditCardRepository, BankAccountRepository bankAccountRepository, AddressRepository addressRepository) {
		return (args) -> {
			//add same users
			//userRepository.save(new User("Tasia", "Tetiana", "Masliuk", SELLER));

			log.info("Find by ID: ");
			User userId = userRepository.findByidUser(1L);
			log.info(userId.toString());

			log.info("Find All users: ");
			log.info("");
			for (User user: userRepository.findAll()){
				log.info(user.toString());
			}


			log.info("Find by UserName: ");
			User user = userRepository.findBynameUser("Tasia");
			log.info(user.toString());

			//creditCardRepository.save(new CreditCard("5690 9631 2305 8462","02","2026"));
			//creditCardRepository.save(new CreditCard("3002 8631 0212 6301","06","2023"));

			//bankAccountRepository.save(new BankAccount("BE68 6351 2648 3254","WBK", "BOFMIE23"));

			addressRepository.save(new Address("Storking LN","YO41 5ND", "Wilberfoss", home, user));
			addressRepository.save(new Address("Main St","YO36 5ND", "Wilberfoss", billing, user));
			addressRepository.save(new Address("Stone Bridge Dr","YO40 5ND", "Wilberfoss", shipping, user));


			// save category
			categoryRepository.save(new Category("Gemstone"));
			Category category = categoryRepository.findBynameCategory("Gemstone");

			// save same items
			itemRepository.save(new Item("Aquamarine", BigDecimal.valueOf(68.30), Date.valueOf("2020-06-30"), category, user));
			itemRepository.save(new Item("Alexandrite", BigDecimal.valueOf(120.60), Date.valueOf("2020-07-05"), category, user));
			itemRepository.save(new Item("Red Coral", BigDecimal.valueOf(46.65), Date.valueOf("2020-06-25"), category, user));
			itemRepository.save(new Item("Amethyst", BigDecimal.valueOf(123.32), Date.valueOf("2020-07-30"), category, user));
			itemRepository.save(new Item("Ruby", BigDecimal.valueOf(68.20), Date.valueOf("2020-07-08"), category, user));
			itemRepository.save(new Item("Citrine", BigDecimal.valueOf(94.05), Date.valueOf("2020-06-29"), category, user));
			itemRepository.save(new Item("Diamond", BigDecimal.valueOf(258.80), Date.valueOf("2020-07-30"), category, user));
			itemRepository.save(new Item("Emerald", BigDecimal.valueOf(38.60), Date.valueOf("2020-07-02"), category, user));
			itemRepository.save(new Item("Garnet", BigDecimal.valueOf(55.70), Date.valueOf("2020-07-15"), category, user));

			log.info("User:  ");
			log.info(user.toString());
			log.info("");

			// fetch all customers
			log.info("Items found with findAll():");
			log.info("-------------------------------");
			for (Item item : itemRepository.findAll()) {
				log.info(item.toString());
			}
			log.info("");
		};
	}

}
