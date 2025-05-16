public class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario(){
        raiz = null;
    }

    //metodo para inicializar el arbol
    public void inicializarArbol(){
        raiz = new Nodo (10);
        raiz.izquierdo = new Nodo (5);
        raiz.derecho = new Nodo (15);

        raiz.izquierdo.izquierdo = new Nodo (3);
        raiz.izquierdo.derecho = new Nodo (7);
        raiz.derecho.izquierdo = new Nodo (12);
        raiz.derecho.derecho = new Nodo (18);

    }

    //Recorrico InOrden
    public void inOrden (Nodo nodo){
        if (nodo != null){
            inOrden(nodo.izquierdo);
            System.out.println(nodo.valor + " ");
            inOrden(nodo.derecho);
        }
    }

    //Obtener la raiz del arbol
    public Nodo getRaiz(){
        return raiz;
    }
}
