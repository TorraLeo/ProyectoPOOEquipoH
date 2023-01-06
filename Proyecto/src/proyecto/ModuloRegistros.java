package proyecto;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ModuloRegistros {

    public ModuloRegistros(LinkedList<Alumno> alumnos) throws IOException {

        

        for (int i = 1; i <= 5; i++) { // cambiar a 500

            String nombreTemp = null, paternoTemp = null, maternoTemp = null;
            int edadTemp = 0;
            Direccion direccionTemp = new Direccion();
            ModuloDatosAcademicos DATemp = new ModuloDatosAcademicos();

            //crear nombres
            FileInputStream archivo = new FileInputStream("C:\\Users\\Admin\\Desktop\\tercer semestre\\POO\\ProyectoPOO\\CodigosPostales.xlsx");
            XSSFWorkbook libro = new XSSFWorkbook(archivo);
            XSSFSheet hoja = libro.getSheetAt(4);

            Row fila = hoja.getRow(i);
            int numCol = fila.getLastCellNum();

            for (int j = 0; j < numCol; j++) {
                Cell celda = fila.getCell(j);

                if (j == 1) {
                    nombreTemp = (String) celda.getStringCellValue();
                } else if (j == 2) {
                    paternoTemp = celda.getStringCellValue();
                } else if (j == 3) {
                    maternoTemp = celda.getStringCellValue();
                }

            }
            edadTemp = crearDatosPersonales(i, edadTemp, direccionTemp);
            crearDatosAcademicos(DATemp, edadTemp);

            alumnos.add(new Alumno(i, nombreTemp, paternoTemp, maternoTemp, edadTemp, direccionTemp, DATemp));

        }

        

    }

    int crearDatosPersonales(int i, int edadTemp, Direccion direccionTemp) throws IOException {
        ModuloDatosPersonales inicio2 = new ModuloDatosPersonales();
        inicio2.leerDirecciones(i, direccionTemp);
        edadTemp = inicio2.crearEdad();
        return edadTemp;
    }

    void crearDatosAcademicos(ModuloDatosAcademicos DATemp, int edadTemp) {
        ModuloDatosAcademicos inicio3 = new ModuloDatosAcademicos();
        inicio3.crearDatos(DATemp, edadTemp);
    }

}
