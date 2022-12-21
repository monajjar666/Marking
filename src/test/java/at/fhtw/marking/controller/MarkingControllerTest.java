package at.fhtw.marking.controller;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarkingControllerTest {
@Test
void checkFirst() throws IOException {
    var controller = new MarkingController();
    var mark =controller.calculateMark(90);
    assertEquals(1 , mark);



}

}
