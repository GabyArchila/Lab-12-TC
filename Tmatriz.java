import java.util.*;
import java.util.stream.*;

public class Tmatriz {
    public static void main(String[] args) {
        List<List<Integer>> matriz = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );
        
        System.out.println("Matriz original:");
        matriz.forEach(System.out::println);
        
        List<List<Integer>> transpuesta = IntStream.range(0, matriz.get(0).size())
            .mapToObj(j -> matriz.stream().map(fila -> fila.get(j)).collect(Collectors.toList()))
            .collect(Collectors.toList());
        
        System.out.println("\nMatriz transpuesta:");
        transpuesta.forEach(System.out::println);
    }
}
