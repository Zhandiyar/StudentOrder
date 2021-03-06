package edu.javacourse.studentOrder.dao;

import edu.javacourse.studentOrder.domain.StudentOrder;
import edu.javacourse.studentOrder.exception.DaoException;

import java.util.List;

public interface StudentOrderDao {
    Long  saveStudentOrder(StudentOrder so) throws DaoException;
    List<StudentOrder> getStudentOrders() throws DaoException;


}
