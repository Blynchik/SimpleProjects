package Agregator.view;


import Agregator.Controller;
import Agregator.vo.Vacancy;

import java.util.List;

public interface View {

    void update(List<Vacancy> vacancies);

    void setController(Controller controller);
}
