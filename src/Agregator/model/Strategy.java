package Agregator.model;


import Agregator.vo.Vacancy;

import java.util.List;

public interface Strategy {

    List<Vacancy> getVacancies(String searchString);
}
