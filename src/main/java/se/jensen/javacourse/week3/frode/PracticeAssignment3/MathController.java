package se.jensen.javacourse.week3.frode.PracticeAssignment3;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    @GetMapping("/square.number/{nr}")
    public Object squareNumber(@PathVariable("nr") String nr) {
        try {
            double parsNr = Double.parseDouble(nr);
            double result = parsNr * parsNr;
            return parsNr + " * "+parsNr +" = " +result;
        } catch (Exception e) {
            return "[ "+nr+" ]" + " is not a number \n" + HttpStatus.BAD_REQUEST;
        }
    }


}
