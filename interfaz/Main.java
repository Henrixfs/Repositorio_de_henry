package interfaz;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(3);
        lista.add(8);
        lista.add(10);

        System.out.println(lista.get(3));
        lista.remove(3);

        for (int i : lista){
            System.out.print(i + " ");
        }


        EstudianteGamer chavito = new EstudianteGamer("Steve Smith");

        System.out.println("\n"+chavito);

        chavito.mover();
        chavito.jugar();
        chavito.comer();
    }
}
