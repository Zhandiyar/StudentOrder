package edu.javacourse.studentOrder.validator;

import edu.javacourse.studentOrder.domain.*;
import edu.javacourse.studentOrder.exception.CityRegisterException;
import edu.javacourse.studentOrder.exception.TransportException;
import edu.javacourse.studentOrder.validator.register.CityRegisterChecker;
import edu.javacourse.studentOrder.validator.register.FakeCityRegisterChecker;

public class CityRegisterValidator {
    public static final String IN_CODE = "NO_GRN";
    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {

        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        AnswerCityRegister ans = new AnswerCityRegister();

        ans.addItem(checkPerson(so.getHusband()));
        ans.addItem(checkPerson(so.getWife()));
        //             for(int i = 0; i<so.getChildren().size(); i++){
//             CityRegisterCheckerResponse cans = personChecker.checkPerson(children.get(i));
//            }
//            for(Iterator<Child> it = children.iterator(); it.hasNext();){
//                Child child = it.next();
//                CityRegisterCheckerResponse cans = personChecker.checkPerson(child);

        for (Child child : so.getChildren()) {
            ans.addItem(checkPerson(child));

        }
        return ans;
    }


    private AnswerCityRegisterItem checkPerson(Person person) {
        AnswerCityRegisterItem.CityStatus status = null;
        AnswerCityRegisterItem.CityError error = null;
        try {
            CityRegisterResponse tmp = personChecker.checkPerson(person);
            status = tmp.isExisting() ?
                    AnswerCityRegisterItem.CityStatus.YES :
                    AnswerCityRegisterItem.CityStatus.NO;
        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError(ex.getCode(), ex.getMessage());
        } catch (TransportException ex) {
            ex.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError(IN_CODE, ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError(IN_CODE, ex.getMessage());
        }
        AnswerCityRegisterItem ans =
                new AnswerCityRegisterItem(status, person,error);
        return ans;
    }
}
