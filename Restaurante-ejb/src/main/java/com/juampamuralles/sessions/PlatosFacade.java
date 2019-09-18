/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juampamuralles.sessions;

import com.juampamuralles.entities.Platos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author programacion
 */
@Stateless
public class PlatosFacade extends AbstractFacade<Platos> implements PlatosFacadeLocal {

    @PersistenceContext(unitName = "Restaurante_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlatosFacade() {
        super(Platos.class);
    }
    
}
