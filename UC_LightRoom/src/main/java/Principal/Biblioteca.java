/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import static Principal.VentanaPrincipal.NombreIng;
import static Principal.VentanaPrincipal.Nombres;
import static Principal.VentanaPrincipal.fot;
import static Principal.VentanaPrincipal.contenedorCat;
import static Principal.VentanaPrincipal.ContenedorFot;
import static Principal.VentanaPrincipal.contenedorFot;
import static Principal.VentanaPrincipal.i;
import static Principal.VentanaPrincipal.j;
import static Principal.VentanaPrincipal.foto;
import static Principal.VentanaPrincipal.fotos;
import static Principal.VentanaPrincipal.h;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Usuario
 */
public class Biblioteca extends javax.swing.JFrame {

    /**
     * Creates new form Biblioteca
     */
    public Biblioteca() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        NF = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ContenedorC = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FotoBorrar = new javax.swing.JList<>();
        Salida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Biblioteca");
        setLocation(new java.awt.Point(100, 100));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUARIO:");

        jButton3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton3.setFont(new java.awt.Font("Arial Narrow", 3, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Agregar Imagen");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(NombreIng);

        jButton4.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton4.setFont(new java.awt.Font("Arial Narrow", 3, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Eliminar Imagen Seleccionada");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton5.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("→");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton6.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("←");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton2.setFont(new java.awt.Font("Arial Narrow", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Imagen en Pantalla:");

        NF.setFont(new java.awt.Font("Arial Narrow", 3, 14)); // NOI18N
        NF.setForeground(new java.awt.Color(255, 255, 255));

        jButton7.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton7.setFont(new java.awt.Font("Arial Narrow", 3, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Cerrar Sesión");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 3, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Categorías");

        ContenedorC.setBackground(new java.awt.Color(51, 51, 51));
        ContenedorC.setFont(new java.awt.Font("Arial Narrow", 3, 15)); // NOI18N
        ContenedorC.setForeground(new java.awt.Color(255, 255, 255));
        ContenedorC.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = Nombres;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ContenedorC);
        ContenedorC.getAccessibleContext().setAccessibleName("");

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton1.setFont(new java.awt.Font("Arial Narrow", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton8.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jButton8.setFont(new java.awt.Font("Arial Narrow", 3, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Abrir Categoría");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        FotoBorrar.setBackground(new java.awt.Color(51, 51, 51));
        FotoBorrar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        FotoBorrar.setForeground(new java.awt.Color(255, 255, 255));
        FotoBorrar.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = fot;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(FotoBorrar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NF, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(NF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Salida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Añadir imagenes
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(contenedorFot==null){
           JOptionPane.showMessageDialog(null, "Abra la categoría en donde quiere almacenar la imagen.", "Error", JOptionPane.WARNING_MESSAGE);  
        }else{
            JFileChooser A = new JFileChooser();
            A.setMultiSelectionEnabled(true);
            A.setFileSelectionMode(JFileChooser.FILES_ONLY);
    
        FileNameExtensionFilter img = new FileNameExtensionFilter("Archivos JPG & JPEG", "jpg", "jpeg"); 
        A.setFileFilter(img);

        int s = A.showOpenDialog(this);
        
        if (s!= JFileChooser.CANCEL_OPTION) {

        foto = A.getSelectedFiles();
        
        try{
            FotoBorrar.setListData(fot);
            JOptionPane.showMessageDialog(null, "Abra la categoría de nuevo para recargar.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);  
            for(int n=0;n<foto.length;n++){
                BufferedImage Imagen = ImageIO.read(foto[n]);
                ByteArrayOutputStream b = new ByteArrayOutputStream();
                ImageIO.write(Imagen, "jpg", b );
                fotos = b.toByteArray(); 
                
                contenedorFot.add(new ObjetosListaCDE(foto[n].getName(),fotos,foto[n]));
                int imagenm=(int) contenedorFot.find(foto[n].getName()); //Guardar en un objeto para imprimir
                int e=1;
                Nodo Imagenm=contenedorFot.cabecera;
                
                while(e!=imagenm){
                Imagenm=Imagenm.getSiguiente();
                e++;
                
        
                j=contenedorFot.getSize();
                fot=new String[j];
                int u=0;
                Nodo aux1 = contenedorFot.cabecera;
                while(u<contenedorFot.tamaño){
                    fot[u]=aux1.contenido.nombrefoto;
                    aux1=aux1.getSiguiente();
                    u++;
                FotoBorrar.setListData(fot);   
                }   
            }
                
            }     
        }catch(IOException c){    
        }
        
        }
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed
    
    //Boton anterior
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       if(h==null){
                
            }else{
                try{
                Salida.setIcon(null);
                NF.setText("");
                h=h.getAnterior();
                ByteArrayInputStream x = new ByteArrayInputStream((byte[]) h.contenido.contenidos);
                BufferedImage imagen = ImageIO.read(x);
                
                
                ImageIcon imp=new ImageIcon(imagen);
                Image image = imp.getImage(); 
                Image nimp = image.getScaledInstance(600, 373,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
                imp = new ImageIcon(nimp); 
                NF.setText(h.contenido.nombrefoto);
                Salida.setIcon(imp);
                
            }catch(IOException e){
                
            }
            }
        
    }//GEN-LAST:event_jButton6ActionPerformed
    //Boton Siguiente
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(h==null){
                
            }else{
                try{
                Salida.setIcon(null);
                NF.setText("");
                h=h.getSiguiente();
                ByteArrayInputStream x = new ByteArrayInputStream((byte[]) h.contenido.contenidos);
                BufferedImage imagen = ImageIO.read(x);
                
                
                ImageIcon imp=new ImageIcon(imagen);
                Image image = imp.getImage(); 
                Image nimp = image.getScaledInstance(600, 373,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
                imp = new ImageIcon(nimp); 
                NF.setText(h.contenido.nombrefoto);
                Salida.setIcon(imp);
                
            }catch(IOException e){
                
            }
            }
    }//GEN-LAST:event_jButton5ActionPerformed
    //Cerrar sesion
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    
        this.dispose();
    
    }//GEN-LAST:event_jButton7ActionPerformed
    //Abrir Categoria
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        String s = (String) ContenedorC.getSelectedValue();
        Salida.setIcon(null);
        NF.setText("");
        int p=(int) contenedorCat.find(s);
        
        if(p==-1){
           JOptionPane.showMessageDialog(null, "Seleccione una categoría en la lista antes de continuar.", "Error", JOptionPane.WARNING_MESSAGE); 
        }else{
            int i=1;
            ContenedorFot=contenedorCat.cabecera;
            while(i!=p){
            ContenedorFot=ContenedorFot.getSiguiente();
            i++;
            }
        
            contenedorFot=(ListaCDobleE) ContenedorFot.Contenido;
            h=contenedorFot.cabecera;
            //Añadir a pantalla
            j=contenedorFot.getSize();
            fot=new String[j];
            
            int u=0;
            Nodo aux1 = contenedorFot.cabecera;
            while(u<contenedorFot.tamaño){
            fot[u]=aux1.contenido.nombrefoto;
            aux1=aux1.getSiguiente();
            u++;
           
            FotoBorrar.setListData(fot);
            
            //Añadir imagen a la pantalla
            if(contenedorFot.cabecera.contenido.contenidos==null){
                
            }else{
                try{
                ByteArrayInputStream x = new ByteArrayInputStream((byte[]) contenedorFot.cabecera.contenido.contenidos);
                BufferedImage imagen = ImageIO.read(x);
                
                
                ImageIcon imp=new ImageIcon(imagen);
                Image image = imp.getImage(); 
                Image nimp = image.getScaledInstance(600, 373,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
                imp = new ImageIcon(nimp); 
                NF.setText(contenedorFot.cabecera.contenido.nombrefoto);
                Salida.setIcon(imp);
                
            }catch(IOException e){
                
            }
            }
            
            
            
            }
        
        
        }
    }//GEN-LAST:event_jButton8ActionPerformed
    //Añadir categoría
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NuevaCat A=new NuevaCat();
        A.setVisible(true);
        A.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //Borrar categoría
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String s = (String) ContenedorC.getSelectedValue();
        Salida.setIcon(null);
        NF.setText("");
        int p=(int) contenedorCat.find(s);
        if(s.equals("General")){
              JOptionPane.showMessageDialog(null, "La categoría General no puede eliminarse. Puede eliminar las fotos contenidas nada más.", "Error", JOptionPane.WARNING_MESSAGE); 
        }else{
            if(p==-1){
           JOptionPane.showMessageDialog(null, "Seleccione una categoría en la lista antes de continuar.", "Error", JOptionPane.WARNING_MESSAGE); 
        }else{
            
            if(contenedorFot.nombre.equals(s) && !(contenedorFot.nombre.equals("General"))){
                contenedorFot=null;
            }
           contenedorCat.delete(p);
            i=contenedorCat.getSize();
            Nombres=new String[i];
        
            int j=0;
            Nodo aux1 = contenedorCat.cabecera;
            while(j<contenedorCat.tamaño){
            Nombres[j]=aux1.Contenido.nombre;
            aux1=aux1.getSiguiente();
            j++;
            }
            ContenedorC.setListData(Nombres);   
            
            
                
            if(contenedorFot==null){
                
            }else{
                if(contenedorFot.cabecera.contenido==null){
                    
                }else{
                    try{
                    ByteArrayInputStream x = new ByteArrayInputStream((byte[]) contenedorFot.cabecera.contenido.contenidos);
                    BufferedImage imagen = ImageIO.read(x); 
                
                    ImageIcon imp=new ImageIcon(imagen);
                    Image image = imp.getImage(); 
                    Image nimp = image.getScaledInstance(600, 373,  java.awt.Image.SCALE_SMOOTH); 
                    imp = new ImageIcon(nimp); 
                    NF.setText(contenedorFot.cabecera.contenido.nombrefoto);
                    Salida.setIcon(imp);
                
                }catch(IOException e){
                
                }
        
                }
            }
        }
        }   
    }//GEN-LAST:event_jButton2ActionPerformed
    //Borrar Imagen
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        String s = (String) FotoBorrar.getSelectedValue();
        if(contenedorFot==null){
           JOptionPane.showMessageDialog(null, "Abra la categoría en donde se encuentra la imagen que desea eliminar.", "Error", JOptionPane.WARNING_MESSAGE);  
        }else{
            if(contenedorFot.cabecera==null){
                JOptionPane.showMessageDialog(null, "No hay objetos por eliminar.", "Mensaje", JOptionPane.INFORMATION_MESSAGE); 
                
            }else{
               int p=(int) contenedorFot.find(s);
        if(p==-1){
           JOptionPane.showMessageDialog(null, "No hay ninguna foto seleccionada. Seleccione una de la lista.", "Error", JOptionPane.WARNING_MESSAGE); 
        }else{
            Salida.setIcon(null);
            NF.setText("");
            contenedorFot.delete(p);
            
            
            if(contenedorFot.getSize()==0){
                j=contenedorFot.getSize();
                fot=new String[j];
                FotoBorrar.setListData(fot); 
                
            }else{
                
                j=contenedorFot.getSize();
                fot=new String[j];
               int u=0;
                Nodo aux1 = contenedorFot.cabecera;
                while(u<contenedorFot.tamaño){
                fot[u]=aux1.contenido.nombrefoto;
                aux1=aux1.getSiguiente();
                u++;      
                }
                FotoBorrar.setListData(fot);
                
            } 
            if(contenedorFot.cabecera==null){
                
            }else{
                try{
                ByteArrayInputStream x = new ByteArrayInputStream((byte[]) contenedorFot.cabecera.contenido.contenidos);
                BufferedImage imagen = ImageIO.read(x);
                
                
                ImageIcon imp=new ImageIcon(imagen);
                Image image = imp.getImage(); 
                Image nimp = image.getScaledInstance(600, 373,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
                imp = new ImageIcon(nimp); 
                NF.setText(contenedorFot.cabecera.contenido.nombrefoto);
                Salida.setIcon(imp);
                
            }catch(IOException e){
                
            }
            }
            
            
        }
                }                
 
    }
                
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ContenedorC;
    public static javax.swing.JList<String> FotoBorrar;
    protected static javax.swing.JLabel NF;
    protected static javax.swing.JLabel Salida;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}