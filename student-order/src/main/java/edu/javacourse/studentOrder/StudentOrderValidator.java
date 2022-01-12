package edu.javacourse.studentOrder;

import edu.javacourse.studentOrder.dao.StudentOrderDaoImpl;
import edu.javacourse.studentOrder.domain.*;
import edu.javacourse.studentOrder.exception.DaoException;
import edu.javacourse.studentOrder.mail.MailSender;
import edu.javacourse.studentOrder.validator.*;

import java.util.List;

public class StudentOrderValidator {
    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator(){
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();
    }
        public static void main(String[] args) {
            StudentOrderValidator sov = new StudentOrderValidator();
            sov.checkAll();
    }
    public void checkAll() {
            try{
                List <StudentOrder> soList = readStudentOrders();
                 for(StudentOrder so: soList){
                  checkOneOrder(so);
        }
                }catch (Exception ex) {
ex.printStackTrace();
            }
            }
                    public List<StudentOrder> readStudentOrders() throws DaoException {
                return new StudentOrderDaoImpl().getStudentOrders();
    }
            public void checkOneOrder(StudentOrder so) {
                AnswerCityRegister citiAnswer = checkCityRegister(so);
//              AnswerWedding wedAnswer = checkWedding(so);
//              AnswerChildren childAnswer = checkChildren(so);
//              AnswerStudent studentAnswer = checkStudent(so);

       //         sendMail(so);
      }

         public  AnswerCityRegister checkCityRegister(StudentOrder so){

             return cityRegisterVal.checkCityRegister(so);
        }
        public AnswerWedding checkWedding(StudentOrder so){
            return weddingVal.checkWedding(so);
    }
             public AnswerChildren checkChildren(StudentOrder so){
                return childrenVal.checkChildren(so);
        }
            public AnswerStudent checkStudent(StudentOrder so){
            return new StudentValidator().checkStudent(so);
        }
             public void sendMail(StudentOrder so){
                  mailSender.sendMail(so);
    }
}
