package Principal;

import java.io.File;
import java.io.Serializable;

public class ObjetosListaCDE implements Serializable {
    File ruta=null;
    Object contenidos=null;
    String nombrefoto=null;
    
    public ObjetosListaCDE(String nombre, Object contenido, File Ruta){
        this.contenidos=contenido;
        nombrefoto=nombre;
        ruta=Ruta;
}
}
