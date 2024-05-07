import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class AddMedicineTest {

    @Test
    public void testAddMedicine_Success() {
        // Given
        AddMedicine addMedicine = new AddMedicine();
        String uniqueId = "1";
        String name = "Redesca";
        String companyName = "Valeo";
        String quantity = "28";
        String price = "160";

        // When
        addMedicine.handleDatabaseInsertion(uniqueId, name, companyName, quantity, price);
        
        // Then
        // You can add assertions here to check if the medicine was added successfully.
    }
}
