package Restaurant;


import Restaurant.ad.AdvertisementManager;
import Restaurant.ad.NoVideoAvailableException;
import Restaurant.kitchen.Order;

import java.io.IOException;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet extends Observable {
    private final int number;
    private static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    public Order createOrder() {
        Order order = null;
        try {
            order = new Order(this);
            if (order.isEmpty()) {
                return null;
            }
            AdvertisementManager advertisementManager = new AdvertisementManager(order.getTotalCookingTime() * 60);
            advertisementManager.processVideos();
            setChanged();
            notifyObservers(order);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Console is unavailable.");
        } catch (NoVideoAvailableException nve) {
            logger.log(Level.INFO, "No video is available for the order " + order);
        }
        return order;
    }

    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}
