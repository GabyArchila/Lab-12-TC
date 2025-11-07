import java.util.*;
import java.util.stream.Collectors;

public class Eelementos {
    public static void main(String[] args) {
        List<String> colores = Arrays.asList(
            "rojo", "verde", "azul", "amarillo", "gris", "blanco", "negro"
        );
        
        List<String> eliminar = Arrays.asList("amarillo", "cafe", "blanco");
        
        System.out.println("Lista original: " + colores);
        System.out.println("Elementos a eliminar: " + eliminar);
        
        List<String> resultado = filtrarElementos(colores, eliminar);
        
        System.out.println("Lista resultante: " + resultado);
    }
    
    public static List<String> filtrarElementos(List<String> lista, List<String> elementosAEliminar) {
        return lista.stream()
                   .filter(elemento -> !elementosAEliminar.contains(elemento))
                   .collect(Collectors.toList());
    }
}
