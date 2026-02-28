package edu.dosw.parcial.DOSW_ParcialT1;

import java.util.List;

public class Taller implements Event {
    private static final int duration = 240;
    private int capacity;
    private UserAdapter usuario;
    private boolean requireMaterial;
    public String event(String title, String date, int duration, String User, String UserInscrito, String UserInscrito2){
        if(duration > this.duration){
            return "no se puede crear el evento porque excede la duracion maxima";
        }
        if (!usuario.getTeachers().contains(User)){
            return "no se puede crear el evento porque no es un profesor el que la esta creando"; 
        }
        if (this.capacity < 10){
            return "no se puede crear el evento porque la capacidad debe ser mayor a diez";
        }
        return "Taller creado :D";
    }

    public void setCapacity(int capacidad){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void setRequreMaterial(boolean si){
        this.requireMaterial = si;
    }

    public boolean getRequreMaterial(){
        return this.requireMaterial;
    }
}