import Materia.controllers.ArbolBinario;

public class App {
    public static void main(String[] args) throws Exception {
        ArbolBinario ab = new ArbolBinario();
        ab.insert(50);
        ab.insert(17);
        ab.insert(76);
        ab.insert(9);
        ab.insert(23);
        ab.insert(54);
        ab.insert(14);
        ab.insert(19);

        //Nombre y Apellido
        System.out.println("Nombre: Andrea Hurtado");

        //Peso y altura del árbol
        System.out.println("Peso del arbol = " + ab.getWeith());
        System.out.println("Altura es = " + ab.getHeight());

        //Recorrido InOrder
        System.out.print("Arbol InOrder\n");
        ab.imprimirInOrder(); 

        //InOrder con alturas
        System.out.print("\n\nArbol InOrder con alturas\n");
        ab.imprimirInOrderConAlturas();

        //InOrder con factor de equilibrio
        System.out.print("\nArbol InOrder con factor de equilibrio\n");
        ab.imprimirInOrderConFE();

        //Arbol está equilibrado
        System.out.println("\nArbol esta equilibrado = " + ab.estaEquilibrado());

        System.out.println("Agregamos valor = 15");
        ab.insert(15);

        //Nuevo InOrder con factor de equilibrio
        System.out.print("\nArbol InOrder con factor de equilibrio\n");
        ab.imprimirInOrderConFE();

        ab.imprimirNodosDesequilibrados();
    }
}