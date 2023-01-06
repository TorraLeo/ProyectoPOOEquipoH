package proyecto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ModuloDatosPersonales {

    public ModuloDatosPersonales() {
    }

    int crearEdad() {
        
        int aleatorio = (int) (Math.random() * 8 + 18);
        
        return aleatorio;
    }

    void leerDirecciones(int ident, Direccion direccionTemp) throws FileNotFoundException, IOException {

        //crear direcciones
        FileInputStream archivo = new FileInputStream("C:\\Users\\Admin\\Desktop\\tercer semestre\\POO\\ProyectoPOO\\CodigosPostales.xlsx");
        XSSFWorkbook libro = new XSSFWorkbook(archivo);
        XSSFSheet hoja = libro.getSheetAt(1);

        Row fila = hoja.getRow(ident);
        int numCol = fila.getLastCellNum();

        for (int j = 0; j < numCol; j++) {
            Cell celda = fila.getCell(j);
            switch (celda.getCellTypeEnum().toString()) {

                case "NUMERIC":
                    if (j == 0) {
                        direccionTemp.setNumRegistro((int) celda.getNumericCellValue());
                    } else if (j == 1) {
                        direccionTemp.setCodigoPostal((int) celda.getNumericCellValue());
                    } else if (j == 6) {
                        direccionTemp.setClaveOf((int) celda.getNumericCellValue());
                    }

                    break;

                case "STRING":
                    if (j == 2) {
                        direccionTemp.setEstado(celda.getStringCellValue());
                    } else if (j == 3) {
                        direccionTemp.setMunicipio(celda.getStringCellValue());
                    } else if (j == 4) {
                        direccionTemp.setTipoAs(celda.getStringCellValue());
                    } else if (j == 5) {
                        direccionTemp.setAsentamiento(celda.getStringCellValue());
                    }
                    break;

                default:
                    System.out.print("");
                    break;
            }
        }
        //System.out.println(direccionTemp);
    }

}
