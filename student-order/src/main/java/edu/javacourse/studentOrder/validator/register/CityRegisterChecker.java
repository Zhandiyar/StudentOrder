package edu.javacourse.studentOrder.validator.register;

import edu.javacourse.studentOrder.domain.CityRegisterResponse;
import edu.javacourse.studentOrder.domain.Person;
import edu.javacourse.studentOrder.exception.CityRegisterException;
import edu.javacourse.studentOrder.exception.TransportException;

public interface CityRegisterChecker {
      CityRegisterResponse checkPerson(Person person) throws CityRegisterException, TransportException;

    }

