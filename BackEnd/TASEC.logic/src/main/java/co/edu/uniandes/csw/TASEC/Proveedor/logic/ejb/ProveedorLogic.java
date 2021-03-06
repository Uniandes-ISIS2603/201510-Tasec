/* ========================================================================
 * Copyright 2014 SportGroup
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 SportGroup
  
 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:
  
 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.
  
 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 * ========================================================================
  
  
 Source generated by CrudMaker version 1.0.0.201411201032*/
package co.edu.uniandes.csw.TASEC.Proveedor.logic.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import co.edu.uniandes.csw.TASEC.Proveedor.logic.api.IProveedorLogic;
import co.edu.uniandes.csw.TASEC.Proveedor.logic.dto.ProveedorDTO;
import co.edu.uniandes.csw.TASEC.Proveedor.logic.dto.ProveedorPageDTO;
import co.edu.uniandes.csw.TASEC.Proveedor.logic.converter.ProveedorConverter;
import co.edu.uniandes.csw.TASEC.Proveedor.logic.entity.ProveedorEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Default
@Stateless
@LocalBean
public class ProveedorLogic implements IProveedorLogic {

    @PersistenceContext(unitName = "TasecClassPU")
    protected EntityManager entityManager;

    public ProveedorDTO createProveedor(ProveedorDTO sport) {
        ProveedorEntity entity = ProveedorConverter.persistenceDTO2Entity(sport);
        entityManager.persist(entity);
        return ProveedorConverter.entity2PersistenceDTO(entity);
    }

    public List<ProveedorDTO> getProveedores() {
        Query q = entityManager.createQuery("select u from ProveedorEntity u");
        return ProveedorConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public ProveedorPageDTO getProveedores(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from ProveedorEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from ProveedorEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        ProveedorPageDTO response = new ProveedorPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(ProveedorConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    public ProveedorDTO getProveedor(Long id) {
        return ProveedorConverter.entity2PersistenceDTO(entityManager.find(ProveedorEntity.class, id));
    }
    
public void deleteProveedor(Long id) {
ProveedorEntity entity = entityManager.find(ProveedorEntity.class, id);
entityManager.remove(entity);
}
public void updateProveedor(ProveedorDTO detail) {
ProveedorEntity entity = entityManager.merge(ProveedorConverter.persistenceDTO2Entity(detail));
ProveedorConverter.entity2PersistenceDTO(entity);
}

    public void agregarServicioCatalogo(ProveedorDTO detail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
