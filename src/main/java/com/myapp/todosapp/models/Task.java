package com.myapp.todosapp.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Task {
    private Integer id;
    private String titulo;
    private String descripcion;
}