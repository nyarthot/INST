/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ins;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author choco
 */
public class Generador {

    public void GenerarExcel(String[][] entrada, String ruta) throws IOException, WriteException {

        WorkbookSettings conf = new WorkbookSettings();
        conf.setEncoding("ISO-8859");
        try {
            WritableWorkbook woorBook = Workbook.createWorkbook(new File(ruta), conf);

            WritableSheet sheet = woorBook.createSheet("Resultado", 0);

            WritableFont h = new WritableFont(WritableFont.COURIER, 16, WritableFont.NO_BOLD);
            WritableCellFormat hFormat = new WritableCellFormat(h);

            for (int i = 0; i < entrada.length; i++) { //filas
                for (int j = 0; j < entrada[i].length; j++) {//columnas

                    sheet.addCell(new jxl.write.Label(j, i, entrada[i][j], hFormat));
                }
            }
            woorBook.write();
            woorBook.close();

        } catch (IOException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (WriteException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
