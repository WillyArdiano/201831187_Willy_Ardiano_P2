
package proyecto2_lfydp.Backend;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ManejadorDeArchivos {
    
    public String extraerTexto(File archivoTxt) throws IOException{
        try {
            FileReader lector = new FileReader(archivoTxt);
            BufferedReader buferLector = new BufferedReader(lector);
            String fila;
            String texto="";
            while((fila=buferLector.readLine())!=null){
                texto+=fila;
            }
            return texto;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("ERROR AL INTENTAR EXTRAER EL TEXTO DEL ARCHIVO");
            return null;
        }
        
    }
    
}
