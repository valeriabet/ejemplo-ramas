public class App {
    public static void main(String[] args) throws Exception {
        ArbolBinario arbol = new ArbolBinario();
        arbol.inicializarArbol();
        System.out.println("Recorrido inOrden del árbol");
        arbol.inOrden(arbol.getRaiz());
    }
}
