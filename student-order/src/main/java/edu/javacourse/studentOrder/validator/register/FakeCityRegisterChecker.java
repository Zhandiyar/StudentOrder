package edu.javacourse.studentOrder.validator.register;

import edu.javacourse.studentOrder.domain.Adult;
import edu.javacourse.studentOrder.domain.Child;
import edu.javacourse.studentOrder.domain.CityRegisterResponse;
import edu.javacourse.studentOrder.domain.Person;
import edu.javacourse.studentOrder.exception.CityRegisterException;
import edu.javacourse.studentOrder.exception.TransportException;
import edu.javacourse.studentOrder.validator.register.CityRegisterChecker;

public class FakeCityRegisterChecker<res> implements CityRegisterChecker {
    private static final String GOOD_1 = "1000";
    private static final String GOOD_2 = "2000";
    private static final String BAD_1 = "1001";
    private static final String BAD_2 = "2001";
    private static final String ERROR_1 = "1002";
    private static final String ERROR_2 = "2002";
    private static final String ERROR_T_1 = "1003";
    private static final String ERROR_T_2 = "2003";
    public CityRegisterResponse checkPerson(Person person) throws CityRegisterException, TransportException {
        CityRegisterResponse res = new CityRegisterResponse();

        if (person instanceof Adult) {
            Adult t = (Adult) person;
            String ps = t.getPassportSeria();
            if (ps.equals(GOOD_1) || ps.equals(GOOD_2)) {
                res.setExisting(true);
                res.setTemperal(false);
            }
            if (ps.equals(BAD_1) || ps.equals(BAD_2)) {
                res.setExisting(false);
            }
            if (ps.equals(ERROR_1)||ps.equals(ERROR_2)) {
                CityRegisterException ex = new CityRegisterException("1","GRN ERROR" + ps);
                throw ex;
            }
            if (ps.equals(ERROR_T_1)||ps.equals(ERROR_T_2)) {
                TransportException ex = new TransportException("Transport ERROR" + ps);
                throw ex;
            }
        }
        if(person instanceof Child){
            res.setExisting(true);
            res.setTemperal(true);
        }
        System.out.println(res);
        return res;
    }
}


