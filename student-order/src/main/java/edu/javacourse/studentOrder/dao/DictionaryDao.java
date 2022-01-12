package edu.javacourse.studentOrder.dao;

import edu.javacourse.studentOrder.domain.CountryArea;
import edu.javacourse.studentOrder.domain.PassportOffice;
import edu.javacourse.studentOrder.domain.RegisterOffice;
import edu.javacourse.studentOrder.domain.Street;
import edu.javacourse.studentOrder.exception.DaoException;

import java.util.List;

public interface DictionaryDao {
    List<Street> findStreets(String pattern) throws DaoException;
    List<PassportOffice> findPassportOffices(String areaId) throws DaoException;
    List<RegisterOffice> findRegisterOffices(String areaId) throws DaoException;
    List<CountryArea> findAreas(String areaId) throws DaoException;

}
