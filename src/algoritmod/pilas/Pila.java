package algoritmod.pilas;

public class Pila {
    private int tope = -1;
    private final int n = 100;
    private int[] pila;
    
    public Pila(){
        pila=new int[n];
        //cargar?¿
    }
    
    public boolean pilaLlena(){
        return tope == n - 1;
    }
    
    public boolean pilaVacia(){
        return tope == -1;
    }
    
    public int verElemento(){
        if(pilaVacia()){
            System.out.println("No existen elementos en la pila.");
            return -1;
        }else{
            return pila[tope];            
        }
    }
    
    public void push(int x){
        if(tope < n - 1){
            tope = tope + 1;
            pila[tope] = x;
        }else{
            System.out.println("La pila esta completa, "
                    + "no se puede añadir elementos.");
        }
    }
    
    public void pop(){
        if(tope >= 0){
            tope = tope - 1;
        }else{
            System.out.println("La pila esta vacia, "
                    + "no se puede quitar elementos");
        }
    }
    
    public void mostrarPila(){
        System.out.println("**************************************");
        System.out.println("PILA: ");
        Pila aux = new Pila();
        
        while (!this.pilaVacia()) {
            System.out.print(this.verElemento()+" /");
            aux.push(this.verElemento());
            this.pop();           
        }
        while (!aux.pilaVacia()) {
            this.push(aux.verElemento());
            aux.pop();
        }
        System.out.println("");
        System.out.println("TOPE: "+verElemento());
        System.out.println("**************************************");
    }
    
}
