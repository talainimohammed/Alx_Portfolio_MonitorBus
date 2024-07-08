package com.monibus.moniteurbus.repository;

import com.monibus.moniteurbus.Enum.RoleEnum;
import com.monibus.moniteurbus.entity.Bus;
import com.monibus.moniteurbus.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {

    Utilisateur findByEmail(String email);
    List<Utilisateur> findAllByDeletedFalse();
    List<Utilisateur> findAllByRoleEnumAndIdEcoleAndDeletedFalse(RoleEnum role, long id);
}

