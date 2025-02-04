import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest
{
    Product p1, p2;

    @BeforeEach
    void setUp()
    {
        p1 = new Product("Flashlight", "Most powerful flashlight in the world", "000001", 200.00);
        p2 = new Product("Hoodie", "Hoodie with Las Vegas on it", "000002", 50.00);
    }

    @Test
    void setDescription()
    {
        p1.setDescription("Weakest Flashlight Ever!");
        assertEquals("Weakest Flashlight Ever!", p1.getDescription());
    }

    @Test
    void setCost()
    {
        p1.setCost(20.00);
        assertEquals(20.00, p1.getCost());
    }

}