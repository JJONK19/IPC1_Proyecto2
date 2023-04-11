package Principal;

import static Principal.Editor.foto;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;


public class JPEGImageCopy extends ImageHandler {
    File a;
    int i;
    String nom;
    protected byte[] filebytes;
    protected String copyname;
    public JPEGImageCopy(String imagename) {
        super(imagename);
        this.copyname = "copy-" + imagename;
        a=foto;
    }

    @Override
    public void readFile() throws Exception {
        FileInputStream input = new FileInputStream(a);
	filebytes = new byte[input.available()];
	input.read(filebytes);
	input.close();
	System.out.println("Imagen leida: " + this.handledFileName);
	}
    

    @Override
    public void generateFiles() throws Exception {
        FileOutputStream output = new FileOutputStream("temp/"+copyname);
	output.write(filebytes);
	output.close();
	System.out.println("Imagen generada: " + copyname);
        JOptionPane.showMessageDialog(null, "Éxito en la operación.", "", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
