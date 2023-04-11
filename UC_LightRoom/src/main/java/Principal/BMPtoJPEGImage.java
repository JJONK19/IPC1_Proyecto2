package Principal;

import static Principal.Editor.foto;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class BMPtoJPEGImage extends ImageHandler {
    
    File a;
    int i;
    String nom;
    FileInputStream entrada;
    FileOutputStream salida;
    BufferedImage imagen;
    
    public BMPtoJPEGImage(String filename) {
        super(filename);
        a=foto;
    }

    @Override
    public void readFile() throws Exception {
        i= a.getName().lastIndexOf(".");
        nom=a.getName().substring(0, i);
    }

    @Override
    public void generateFiles() throws Exception {
        try{
            FileInputStream entrada = new FileInputStream(a);
            FileOutputStream salida = new FileOutputStream("temp/converted-"+nom+".jpeg");
            BufferedImage imagen = ImageIO.read(entrada);
            ImageIO.write(imagen, "jpeg", salida);
            JOptionPane.showMessageDialog(null, "Éxito en la operación.", "", JOptionPane.INFORMATION_MESSAGE);
            salida.close();
                entrada.close();
        }catch(IOException c){
            
        }
    }
}
