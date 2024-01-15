package com.aitnacer.LabXpert.entity;

import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;


@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "Utilisateur")
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur extends UtilisateurInfo {

    private String userName;
    private String password;
    private UserRole role;




}
