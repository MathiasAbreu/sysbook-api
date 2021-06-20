package br.com.ufcg.sysbook.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String author_name;
    private String text;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Category category;

    public Book() {
        super();
    }

    public Book(Integer id, String titulo, String author_name, String text) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.author_name = author_name;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
