package com.example.dao.interfaces;

import com.example.dao.personas.empleado;

public interface DAOEmpleado {

    public boolean iniciarSesion(empleado emp);
    public void registrar(empleado emp);
    public void modificar(empleado emp);
    public void eliminar(empleado emp);
    public void buscar(empleado emp);
}
