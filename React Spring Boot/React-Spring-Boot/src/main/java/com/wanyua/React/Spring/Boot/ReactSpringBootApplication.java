package com.wanyua.React.Spring.Boot;

import com.wanyua.React.Spring.Boot.Model.User;
import com.wanyua.React.Spring.Boot.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReactSpringBootApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User(1,"John", "Paul", "johnhalvey@prody.com" ));
		this.userRepository.save(new User(2,"Matthew", "West", "matthewwest@prody.com" ));
		this.userRepository.save(new User(3,"Paul", "Stanley", "paulstan@prody.com" ));
		this.userRepository.save(new User(4,"Zechariah", "Hillary", "zechhillary@prody.com" ));
	}
}
