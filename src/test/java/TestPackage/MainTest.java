/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import Controller.Controller;
import Model.CalculationResult;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juannoguera
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @Test
    public void PruebaResultados() throws IOException {
        final String FILE_NAME_1 = "result1.txt";
        List<CalculationResult> data = new ArrayList<>();
        Controller controller = new Controller();
        data = controller.loadClassInfo("result2.txt");
        assertNotEquals("Los resultados de la correlación son los esperados",0.933306898, data.get(0).getCorrelationR());
        assertNotEquals("Los resultados de la correlación al cuadrado no son los esperados",0.871061766, data.get(0).getCorrelationSquareR());
        assertNotEquals("Los resultados de la signficance no son los esperados",7.98203E-05, data.get(0).getCorrelationSignificance());
        assertNotEquals("Los resultados de B0 no son los esperados ",-4.038881575, data.get(0).getRegressionB0());
    }
}
