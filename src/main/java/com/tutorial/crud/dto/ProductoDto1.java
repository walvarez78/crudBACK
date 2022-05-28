package com.tutorial.crud.dto;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

public class ProductoDto1 implements Serializable {
    @NotNull @Size @Email
    private final String nombre;
    @Max(10) @Min(value = 0,message = "error")
    private final float precio;

    public ProductoDto1(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoDto1 entity = (ProductoDto1) o;
        return Objects.equals(this.nombre, entity.nombre) &&
                Objects.equals(this.precio, entity.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "nombre = " + nombre + ", " +
                "precio = " + precio + ")";
    }
}
