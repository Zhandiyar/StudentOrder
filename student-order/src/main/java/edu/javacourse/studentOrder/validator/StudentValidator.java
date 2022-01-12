package edu.javacourse.studentOrder.validator;

import edu.javacourse.studentOrder.domain.AnswerStudent;
import edu.javacourse.studentOrder.domain.StudentOrder;

public class StudentValidator {
    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Students checked");// студенты
        return new AnswerStudent();
    }
}
