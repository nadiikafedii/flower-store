package ucu.edu.ua.lab8.flower.delivery;

import java.util.List;

import ucu.edu.ua.lab8.flower.model.Item;

public interface Delivery {
    boolean deliver(List<Item> items);
}

