package Listas;

import java.util.ArrayList;
import java.util.List;

public class ClsTaskList {
    private String taskName;
    private String taskDescription;

    private boolean IsDone;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public boolean isDone() {
        return IsDone;
    }

    public void setDone(boolean done) {
        IsDone = done;
    }

    public void ListaTareas(){
        List<ClsTaskList> task = new ArrayList<>();
        ClsTaskList tareaIndividual = new ClsTaskList();
        tareaIndividual.setTaskName("Comprar pan");
        tareaIndividual.setTaskDescription("Pan de trigo");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual=new ClsTaskList();

        tareaIndividual.setTaskName("Comprar leche");
        tareaIndividual.setTaskDescription("Leche deslactosada");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual=new ClsTaskList();


        tareaIndividual.setTaskName("Comprar huevos");
        tareaIndividual.setTaskDescription("Huevos de gallina");
        tareaIndividual.setDone(true);
        task.add(tareaIndividual);
        tareaIndividual=new ClsTaskList();



        tareaIndividual.setTaskName("Comprar azucar");
        tareaIndividual.setTaskDescription("Azucar blanca");
        tareaIndividual.setDone(true);
        task.add(tareaIndividual);
        tareaIndividual=new ClsTaskList();


        int tareaNumero=0;

        for(ClsTaskList tl : task) {
            if (!tl.isDone()) {
                System.out.println("Tarea: " + tl.getTaskName() + " Descripcion: " + tl.getTaskDescription() + " Estado: " + tl.isDone());

            }
tareaNumero++;
        }
    }
}
