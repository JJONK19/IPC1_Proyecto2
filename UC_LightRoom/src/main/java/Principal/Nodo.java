package Principal;

import java.io.Serializable;

public class Nodo implements Serializable{
    ObjetosListaCDE contenido;
    Listas Contenido; //Apuntador del objeto a almacenar
    Nodo siguiente; //Apuntador al nodo siguiente
    Nodo anterior; //Apuntador al nodo anterior
 
    
    //Nodo Listas
    public Nodo(Object contenido){
        this.Contenido=(Listas) contenido;
        this.siguiente=null;
        this.anterior=null;
    }
    
    //Nodo fotos
    public Nodo(Object a, Object b){
        this.contenido=(ObjetosListaCDE) a;
        this.siguiente=null;
        this.anterior=null;
    }
    
    
    
    
    
    public void setSiguiente (Nodo s){
        siguiente=s;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }
    
    public void setAnterior (Nodo a){
        anterior=a;
    }
    
    public Nodo getAnterior(){
        return anterior;
    }
    
    public Object getContenido(){
        return Contenido;
    }
    
    
}
