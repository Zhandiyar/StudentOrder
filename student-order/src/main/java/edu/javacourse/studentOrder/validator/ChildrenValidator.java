package edu.javacourse.studentOrder.validator;

import edu.javacourse.studentOrder.domain.StudentOrder;

public class ChildrenValidator {
    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children Check is running");// в загсе дети
        return new AnswerChildren();
    }
}
