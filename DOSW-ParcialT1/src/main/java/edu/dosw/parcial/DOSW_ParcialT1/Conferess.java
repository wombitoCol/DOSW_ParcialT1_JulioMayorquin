package edu.dosw.parcial.DOSW_ParcialT1;

import java.util.List;

public class Conferess implements Event {
    private static final int duration = 180;
    private int capacity;
    private UserAdapter usuario;
    public String event(String title, String date, int duration, String User){
        if(duration > this.duration){
            return "no se puede crear el evento porque excede la duracion maxima";
        }
        if (!usuario.getTeachers().contains(User)){
            return "no se puede crear el evento porque no es un profesor el que la esta creando"; 
        }
        return "conferencia creada :D";
    }

    public void setCapacity(int capacidad){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
