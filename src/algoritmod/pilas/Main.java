package algoritmod.pilas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pila pila1 = new Pila();
        Pila pila2 = new Pila();
        Pila pila3 = new Pila();
        
        cargarPila(pila1);
        cargarPila(pila2);

        
        while(!pila1.pilaVacia() || !pila2.pilaVacia()){
            if(!pila1.pilaVacia() && !pila2.pilaVacia()){
                
                if(pila1.verElemento()>pila2.verElemento()){
                    pila3.push(pila1.verElemento());
                    pila1.pop();
                }else if(pila1.verElemento()<pila2.verElemento()){
                    pila3.push(pila2.verElemento());
                    pila2.pop();
                }else{
                    pila3.push(pila1.verElemento());
                    pila3.push(pila2.verElemento());
                    pila1.pop();pila2.pop();
                }
                
            }else if(pila1.pilaVacia()){
                pila3.push(pila2.verElemento());
                pila2.pop();
            }else{
                pila3.push(pila1.verElemento());
                pila1.pop();
            }
        }
        
        pila3.mostrarPila();
    }

    private static void cargarPila(Pila pila) {
        Scanner leer = new Scanner(System.in);
        int aux=0;
        while(aux!=-1){
            System.out.println("Indique el valor que desee agregar a la pila (DE MENOR A MAYOR):");
            pila.push(leer.nextInt());
            System.out.println("Numero guardado.");
            System.out.println("Si desea terminar ingrese -1 a continuación");
            aux=leer.nextInt();
        }
        
        
        
    }
    
}
