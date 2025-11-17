package com.tribuzchat.api.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_tribo")
public class Tribo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;


    @CreationTimestamp
    @Column(name = "data_cadastroTribo", nullable = false, updatable = false)
    private LocalDateTime data_cadastro;


    @OneToMany(mappedBy = "tribo", cascade = CascadeType.ALL)
    private List<Grupo> grupos = new ArrayList<>();


    @ManyToMany(mappedBy = "tribos")
    private List<Usuario> usuarios = new ArrayList<>();


}
