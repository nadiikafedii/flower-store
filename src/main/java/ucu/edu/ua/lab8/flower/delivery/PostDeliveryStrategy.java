package ucu.edu.ua.lab8.flower.delivery;

import java.util.List;

import ucu.edu.ua.lab8.flower.model.Item;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public boolean deliver(List<Item> items) {
        System.out.println("Delivering items by Post.");
        return true;
    }
}

