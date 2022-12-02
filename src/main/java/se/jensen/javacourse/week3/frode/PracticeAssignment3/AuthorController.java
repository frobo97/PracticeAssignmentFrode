package se.jensen.javacourse.week3.frode.PracticeAssignment3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    Author author = new Author();

    @GetMapping("/author/first.name")
    public String getAuthorFirstName() {
        return author.getFirstName();
    }

    @GetMapping("/author/last.name")
    public String getAuthorLastName() {
        return author.getLastName();
    }

    @GetMapping("/author/age")
    public int getAuthorAge() {
        return author.getAge();
    }

    @GetMapping("/author")
    public Author getAuthorInfo () {
        return author;
    }


}
