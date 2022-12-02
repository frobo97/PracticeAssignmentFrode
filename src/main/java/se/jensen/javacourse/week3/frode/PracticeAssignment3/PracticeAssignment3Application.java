package se.jensen.javacourse.week3.frode.PracticeAssignment3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
//@RestController
public class PracticeAssignment3Application {

	public static void main(String[] args) {
		SpringApplication.run(PracticeAssignment3Application.class, args);

//		authorName();

	}


//	@GetMapping("/author/name")
//	static void authorName() {
//		AuthorController author = new AuthorController();
//		author.getAuthorName();
//	}


//	static void runMethods() {
//		AuthorController author = new AuthorController();
//
//		author.getAuthorName();
//}

	}


