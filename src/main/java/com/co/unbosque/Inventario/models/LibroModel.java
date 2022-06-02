package com.co.unbosque.Inventario.models;

import javax.persistence.*;

@Entity
@Table(name = "libro")
public class LibroModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private short id;


    private String titulo;
    private String autor;
    private String editorial;
    private String isbn;
    private Integer paginas;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }

    public String getEditorial(){
        return editorial;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setPaginas(Integer paginas){
        this.paginas = paginas;
    }

    public Integer getPaginas(){
        return paginas;
    }

}
