package com.julian.fundamentals;

import com.julian.fundamentals.Exceptions.PlateNotFoundException;
import com.julian.fundamentals.RestaurantSystem.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrderTest {

    Order order;

    @BeforeEach
    void setUp () {

        Table table = new Table(1, 4, TableState.AVAILABLE);
        Waiter waiter = new Waiter("Jaime", 1);
        order = new Order(table, waiter);
    }

    @Test
    void calculateTotal_shouldReturnCorrectSum () {

        order.addPlate(new Plate("Pizza", 25_000, DishCategory.STRONG_PLATE));
        order.addPlate(new Plate("Limonade", 8_000, DishCategory.DRINK));

        double result = order.calculateTotal();
        assertEquals(33_000, result);
    }

    @Test
    void calculateTotalWithTip_shouldApplyCorrectPercentage () {

        order.addPlate(new Plate("Pizza", 25_000, DishCategory.STRONG_PLATE));
        double result = order.calculateTotalWithTip(10);
        assertEquals(27_500, result);
    }

    @Test
    void removePlate_shouldThrowException_whenPlateNotFound () {

        Plate pizza = new Plate("Pizza", 25_000, DishCategory.STRONG_PLATE);
        Plate paste = new Plate("Paste", 22_000, DishCategory.STRONG_PLATE);

        order.addPlate(pizza);
        assertThrows(PlateNotFoundException.class,() -> {order.removePlate(paste);
        });

    }

    @Test
    void getTablesAvailable_shouldReturnOnlyAvailableTables () {

        Restaurant restaurant = new Restaurant("Tests Bar");
        restaurant.addTable(new Table(1,4, TableState.AVAILABLE));
        restaurant.addTable(new Table(2,4, TableState.BUSY));
        restaurant.addTable(new Table(3,4, TableState.AVAILABLE));

        List<Table> result = restaurant.getTablesAvailable();

        assertEquals(3, result.size());
    }

    @Test
    void occupy_shouldThrowException_whenTableNotAvailable () {

        Table table = new Table(1, 4, TableState.BUSY);
        assertThrows(IllegalStateException.class, table::occupy);
    }
}
