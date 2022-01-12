package edu.javacourse.studentOrder.validator;

import edu.javacourse.studentOrder.domain.AnswerWedding;
import edu.javacourse.studentOrder.domain.StudentOrder;

public class WeddingValidator {
    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding start");// что в загсе
        return new AnswerWedding();
    }
}

