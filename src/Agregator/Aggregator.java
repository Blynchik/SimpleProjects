package Agregator;


import Agregator.model.HHStrategy;
import Agregator.model.HabrCareerStrategy;
import Agregator.model.Model;
import Agregator.model.Provider;
import Agregator.view.HtmlView;

public class Aggregator {

    public static void main(String[] args) {
        HtmlView view = new HtmlView();
        Model model = new Model(view, new Provider(new HHStrategy()), new Provider(new HabrCareerStrategy()));
        Controller controller = new Controller(model);

        view.setController(controller);

        view.userCitySelectEmulationMethod();
    }
}
