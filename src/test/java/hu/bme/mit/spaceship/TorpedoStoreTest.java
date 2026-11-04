package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void fire_MoreThanAvailable() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act

        // Assert
        assertThrows(IllegalArgumentException.class, () -> store.fire(2));
    }

    @Test
    void torpedoCountTest() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        int torpedoCount = store.getTorpedoCount();

        // Assert
        assertEquals(1, torpedoCount);
    }

}
