package edu.javacourse.studentOrder.validator.register;

import edu.javacourse.studentOrder.domain.CityRegisterResponse;
import edu.javacourse.studentOrder.domain.Person;
import edu.javacourse.studentOrder.exception.CityRegisterException;
import edu.javacourse.studentOrder.exception.TransportException;
import edu.javacourse.studentOrder.validator.register.CityRegisterChecker;

public class RealCityRegisterChecker implements CityRegisterChecker {
    public CityRegisterResponse checkPerson(Person person) throws CityRegisterException, TransportException {

        return null;
    }
}
