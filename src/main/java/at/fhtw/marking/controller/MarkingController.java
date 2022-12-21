package at.fhtw.marking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class MarkingController {


    public MarkingController() throws IOException {
    }
    @GetMapping("/api/mark")
    public int calculateMark(@RequestParam int percentage ){
    return switch (percentage){
        case 90 -> 1;
        case 50 -> 4;
        case 0 -> 5;
        default -> throw new IllegalStateException("Unexpected value: " + percentage);
    };
    }
}
