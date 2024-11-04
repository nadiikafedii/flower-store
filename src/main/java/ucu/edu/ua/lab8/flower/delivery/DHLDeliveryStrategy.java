package ucu.edu.ua.lab8.flower.delivery;

import java.util.List;

import ucu.edu.ua.lab8.flower.model.Item;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public boolean deliver(List<Item> items) {
        System.out.println("Delivering items by DHL.");
        return true;
    }
}

