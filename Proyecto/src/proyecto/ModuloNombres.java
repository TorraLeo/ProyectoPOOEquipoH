package proyecto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ModuloNombres {

    public ModuloNombres() {
    }

    void leerNombre(int ident, String nombreTemp, String paternoTemp, String maternoTemp) throws FileNotFoundException, IOException {
        
        //crear nombres
        FileInputStream archivo = new FileInputStream("C:\\Users\\Admin\\Desktop\\tercer semestre\\POO\\ProyectoPOO\\CodigosPostales.xlsx");
        XSSFWorkbook libro = new XSSFWorkbook(archivo);
        XSSFSheet hoja = libro.getSheetAt(4);

        Row fila = hoja.getRow(ident);
        int numCol = fila.getLastCellNum();

        for (int j = 0; j < numCol; j++) {
            Cell celda = fila.getCell(j);

            if (j == 1) {
                nombreTemp = (String)celda.getStringCellValue();
                System.out.println("nombre leido " + nombreTemp);
            } else if (j == 2) {
                paternoTemp = celda.getStringCellValue();
            } else if (j == 3) {
                maternoTemp = celda.getStringCellValue();
            }

        }
    }

}
