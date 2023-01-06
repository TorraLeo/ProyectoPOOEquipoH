package proyecto;

public class ModuloDatosAcademicos {


    int crearNumInsc() {
        int inscripcion = 0;

        return inscripcion;
    }

    void crearDatos(DatosAcademicos data, int edadTemp) {
        
        int aleatorio = (int) (Math.random() * 300000000 + 1);
        
        data.setNumCuenta(aleatorio);

        switch (edadTemp) {
            case 18:
                data.setSemestre((int) (Math.random() * 1 + 1));
                break;
            case 19:
                data.setSemestre((int) (Math.random() * 2 + 1));
                break;
            case 20:
                data.setSemestre((int) (Math.random() * 3 + 1));
                break;
            case 21:
                data.setSemestre((int) (Math.random() * 4 + 1));
                break;
            case 22:
                data.setSemestre((int) (Math.random() * 5 + 1));
                break;

            case 23:
                data.setSemestre((int) (Math.random() * 6 + 1));
                break;
            case 24:
                data.setSemestre((int) (Math.random() * 7 + 1));
                break;

            case 25:
                data.setSemestre((int) (Math.random() * 8 + 1));
                break;
            case 26:
                data.setSemestre((int) (Math.random() * 9 + 1));
                break;

            case 27:
                data.setSemestre((int) (Math.random() * 9 + 1));
                break;
            case 28:
                data.setSemestre((int) (Math.random() * 9 + 1));
                break;
        }
        
        data.setMateriasInscritas(5);
        
        data.setMateriasAprobadas((int) (Math.random() * 2 + 3 ));
        
        data.setCreditosAlumno(data.getMateriasAprobadas()*9);
        
        float coso = 0;
        
        for(int i = 0 ; i < data.getMateriasAprobadas(); i++){
            coso+=(int) (Math.random() * 4 + 6);
        }
        
        for(int i = 0 ; i < (5 - data.getMateriasAprobadas()) ; i++){
            coso+=(int) (Math.random() * 3 + 2);
        }
        
        
        float promedio = (coso/5);
        data.setPromedio( promedio);
        
        float escolaridad =  ((float) data.getMateriasAprobadas() / 5 ) * 100;
        data.setEscolaridad(escolaridad);
        
        
        
        
        int creditosIngreso = (data.getSemestre() * ((int) (Math.random() * 2 +3 ) *9));
        data.setCreditosIngreso(creditosIngreso);
        
        float velocidad =  ((float)data.getCreditosAlumno() / (float)creditosIngreso)*100;
        data.setVelocidad(velocidad);
        
        int inscripcion = (int)promedio * (int)escolaridad * (int)velocidad;
        data.setNumInscripcion(inscripcion);
    }
}
