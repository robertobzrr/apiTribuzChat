package com.tribuzchat.api.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_grupo")
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeGrupo;
    private String descricaoGrupo;


    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "data_nascimento", nullable = false)
    private LocalDate data_nascimento;


    @CreationTimestamp
    @Column(name = "data_cadastroGrupo", nullable = false, updatable = false)
    private LocalDateTime data_cadastroGrupo;


    @ManyToOne
    @JoinColumn(name = "id_tribo")
    private Tribo tribo;


    @ManyToMany(mappedBy = "grupos")
    private List<Usuario> usuarios = new ArrayList<>();



}

