package Factory.female;


import Factory.AbstractFactory;
import Factory.Human;

public class FemaleFactory implements AbstractFactory {

    public Human getPerson(int age) {
        Human human = null;
        if (age <= KidGirl.MAX_AGE) {
            human = new KidGirl();
        } else if (age <= TeenGirl.MAX_AGE) {
            human = new TeenGirl();
        } else
            human = new Woman();
        return human;
    }
}
