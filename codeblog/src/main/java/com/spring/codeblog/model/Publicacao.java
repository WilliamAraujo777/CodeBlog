package com.spring.codeblog.model;

import java.time.LocalDate;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity //aqui estou diznedo que esta classe é uma entidade, para que durante a execução ele a crie no banco de dados 
@Table(name="TB_PUBLICACAO")//dizendo o nome da tabela
public class Publicacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Aqui eu estou dizendo que o ID será Auto Incremento
    private Long id;

    @NotBlank   // Aqui estou dizendo que este atributo é Not Null
    private String titulo;

    @NotBlank   // Aqui estou dizendo que este atributo é Not Null
    private String autor;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")//Setando um modelo de data
    private LocalDate data_pub;

    @NotBlank   // Aqui estou dizendo que este atributo é Not Null
    @Lob        // Essa marcação é pq o texto é um atributo com valores muito longos, aqui to "avisando" para o banco disso, para ele permitir estes valores
    private String texto;



    //GETTERS AND SETTERS!
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getData_pub() {
        return this.data_pub;
    }

    public void setData_pub(LocalDate data_pub) {
        this.data_pub = data_pub;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
