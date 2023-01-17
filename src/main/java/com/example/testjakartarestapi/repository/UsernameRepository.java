package com.example.testjakartarestapi.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@ApplicationScoped
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsernameRepository  {

    @PersistenceUnit(name = "wildfly1")
    private EntityManagerFactory emf;

    @RequestScoped // you can also make this @RequestScoped
    public EntityManager create() {
        return emf.createEntityManager();
    }

    public List findUsernames() {
        return emf.
                createEntityManager()
                .createNamedQuery("findAllUsernames")
                .getResultList();
    }

}
