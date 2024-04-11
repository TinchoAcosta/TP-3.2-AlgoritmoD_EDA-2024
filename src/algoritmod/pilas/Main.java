package algoritmod.pilas;

public class Main {

    public static void main(String[] args) {
        Pila pila1 = new Pila();
        Pila pila2 = new Pila();
        Pila pila3 = new Pila();
        
        pila1.push(-3);
        pila1.push(0);
        pila1.push(1);
        pila1.push(2);
        pila1.push(3);
        pila1.push(4);
        
        pila2.push(3);
        pila2.push(3);
        pila2.push(6);
        pila2.push(7);
        pila2.push(8);
        pila2.push(10);
        pila2.push(22);

        
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
    
}
