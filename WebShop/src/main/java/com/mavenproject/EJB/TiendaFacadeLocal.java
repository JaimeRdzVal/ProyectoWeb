/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavenproject.EJB;

import com.mavenproject.modelo.Tienda;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface TiendaFacadeLocal {

    void create(Tienda tienda);

    void edit(Tienda tienda);

    void remove(Tienda tienda);

    Tienda find(Object id);

    List<Tienda> findAll();

    List<Tienda> findRange(int[] range);

    int count();

}