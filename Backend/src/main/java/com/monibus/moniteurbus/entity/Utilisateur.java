package com.monibus.moniteurbus.entity;

import com.monibus.moniteurbus.Enum.RoleEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "utilisateurs")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUtilisateur;
    private String nom;
    private String prenom;
    private String adresse;
    private LocalDate dateNaissance;
    private String tel;
    private String email;
    private String password;
    private RoleEnum roleEnum;
    private long idEcole;
    @Column(name = "isDeleted")
    private boolean deleted;

}
