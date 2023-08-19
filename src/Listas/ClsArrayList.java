package Listas;

import java.util.ArrayList;
import java.util.List;

public class ClsArrayList {
    public void ejemplo1() {
        List<String> tasklist = new ArrayList<>();
        tasklist.add("Comprar pan");
        tasklist.add("Comprar leche");
        tasklist.add("Comprar huevos");
        tasklist.add("Comprar azucar");

        System.out.println(tasklist);
        String primerTarea = tasklist.get(0);
        System.out.println("La primera tarea es: " + primerTarea);
        tasklist.remove(0);
        primerTarea = tasklist.get(0);
        System.out.println("La primera tarea es: " + primerTarea);


        int elementos = 0;
        for (String elemento : tasklist) {
            System.out.println(elemento);
            elementos++;
        }

    }

    public void ejemplo2(){
        List<Integer> tasklist2 = new ArrayList<>();
        tasklist2.add(500);
        tasklist2.add(1000);
        tasklist2.add(1500);
        tasklist2.add(2000);
        tasklist2.add(2500);

        int elementos2=0;
        int Total=0 ;
        for (int elemento2: tasklist2){
            System.out.println(elemento2);
            elementos2++;
            Total = Total + elemento2;
            System.out.println("La suma total es:" + Total);

        }
    }
}
