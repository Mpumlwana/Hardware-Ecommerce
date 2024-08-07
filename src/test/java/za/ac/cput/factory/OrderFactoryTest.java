package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Order;


public class OrderFactoryTest {

    @Test
    void testBuildOrderWithAllFields() {
        Address address = AddressFactory.createAddress("","","","",
                "","Dorset","Capetown","Western Cape","8008");
        assertNotNull(address);
        Order order = OrderFactory.buildOrder(127264L, LocalDate.now(),address, 500.0f, "Pending", new HashSet<>());
        assertNotNull(order);
        System.out.println(order);
    }

    @Test
    void testBuildOrderWithEmptyOrderItems() {
        Address address = AddressFactory.createAddress("","","","",
                "","Dorset","Capetown","Western Cape","8008");
        assertNotNull(address);
        Order order = OrderFactory.buildOrder(127264L, LocalDate.now(),address, 500.0f, null, new HashSet<>());
        assertNotNull(order);
        System.out.println(order);
    }
}