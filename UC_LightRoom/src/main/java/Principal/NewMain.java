/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ListaSimple Base=new ListaSimple();
        //Prueba de lista simple
        Base.add(new ListaDobleE("Ejemplo"));
        Nodo con= (Nodo) Base.find("Quinto");
        Nodo a= (Nodo) Base.find("Sexto");
        Nodo b= (Nodo) Base.find("Septimo");
        
        
        int c=0;
        Nodo aux = Base.cabecera;
        while(c<Base.tamaño){
           System.out.println(aux.Contenido.nombre);
           aux=aux.getSiguiente();
           c++;
        }
        System.out.println("Funciona!");
        System.out.println(Base.tamaño);
        
        
        //Prueba de Lista doble enlazada 
        ListaDobleE ejemplo=(ListaDobleE) con.Contenido;
        ejemplo.add(new ListaCDobleE("Vacaciones"));
        ejemplo.add(new ListaCDobleE("Graduacion"));
        ejemplo.add(new ListaCDobleE("Perros"));
        
        
        int j=0;
        Nodo aux1 = ejemplo.cabecera;
        System.out.println(ejemplo.tamaño);
        
        while(j<ejemplo.tamaño){
           System.out.println(aux1.Contenido.nombre);
           aux1=aux1.getSiguiente();
           j++;
        }
        System.out.println("Funciona!");
        System.out.println(ejemplo.tamaño);
        
        int borrar=(int) ejemplo.find("General");
        int borrar1=(int) ejemplo.find("Vacaciones");
        System.out.println(borrar1);
        System.out.println(borrar);
        
        ejemplo.delete(borrar);
        ejemplo.delete(borrar1);
        
        int j1=0;
        Nodo aux11 = ejemplo.cabecera;
        System.out.println(ejemplo.tamaño);
        
        while(j1<ejemplo.tamaño){
           System.out.println(aux11.Contenido.nombre);
           aux11=aux11.getSiguiente();
           j1++;
        }
        System.out.println("Funciona la borrasion!");
        System.out.println(ejemplo.tamaño);

        int Lista=(int) ejemplo.find("Perros"); //Guardar en una lista el valor
        int d=1;
        System.out.println(Lista);
        Nodo categoria=ejemplo.cabecera;
        while(d!=Lista){
            categoria=categoria.getSiguiente();
            d++;
        }
        
        //Lista circular enlazada
        ListaCDobleE Imagen=(ListaCDobleE) categoria.Contenido;
        System.out.println(categoria.Contenido.nombre);
        
        
        
        int k=0;
        Nodo bux1 = Imagen.cabecera;
        System.out.println(Imagen.tamaño);
        
        while(k<Imagen.tamaño){
           System.out.println(bux1.contenido.nombrefoto);
           bux1=bux1.getSiguiente();
           k++;
        }
        System.out.println("Funciona xD!");
        System.out.println(Imagen.tamaño);
        
        int borrarf=(int) Imagen.find("F1");
        int borrar1f=(int) Imagen.find("F2");
        System.out.println(borrar1f);
        System.out.println(borrarf);
        
        Imagen.delete(borrarf);
        Imagen.delete(borrar1f);

        int j1f=0;
        Nodo aux11f = Imagen.cabecera;
        System.out.println(Imagen.tamaño);
        System.out.println("------------------");
        while(j1f<Imagen.tamaño){
           System.out.println(aux11f.contenido.nombrefoto);
           aux11f=aux11f.getSiguiente();
           j1f++;
        }
        System.out.println("Funciona la borrasion!");
        System.out.println(Imagen.tamaño);
        
        int imagenm=(int) Imagen.find("F3"); //Guardar en un objeto para imprimir
        int e=1;
        Nodo Imagenm=Imagen.cabecera;
        while(e!=imagenm){
            Imagenm=Imagenm.getSiguiente();
            e++;
        }
        
        int Final=(Integer) Imagenm.contenido.contenidos;
        System.out.println(Final);
        
               
    }
    
}
