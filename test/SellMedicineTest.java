import dao.ConnectionProvider;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class SellMedicineTest {

    @Test
        public void testMedicineName() throws Exception {
        // Create a test instance of SellMedicine
        SellMedicine sellMedicine = new SellMedicine();

        // Set up test data
        String nameOrUniqueId = "Test";
        Connection conn = ConnectionProvider.getConnection();
        Statement st = conn.createStatement();
        st.executeUpdate("INSERT INTO medicine (uniqueId, name) VALUES ('1', 'Redesca')");

        // Use reflection to access and set the private field
        Field medicineTableField = SellMedicine.class.getDeclaredField("medicineTable");
        medicineTableField.setAccessible(true); // Make the field accessible
        javax.swing.JTable medicineTable = (javax.swing.JTable) medicineTableField.get(sellMedicine);

        // Call the method to be tested
        sellMedicine.medicineName(nameOrUniqueId);

        // Get the model from the table
        DefaultTableModel model = (DefaultTableModel) medicineTable.getModel();

        // Verify that the model is updated correctly
        assertEquals(1, model.getRowCount());
        assertEquals("123456- Test Medicine", model.getValueAt(0, 0));

        // Clean up test data
        st.executeUpdate("DELETE FROM medicine WHERE uniqueId = '1'");
        st.close();
        conn.close();
    }
}
