/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.TASEC.cliente.logic.api;

import co.edu.uniandes.csw.SportGroup.Cliente.logic.dto.ClienteDTO;
import co.edu.uniandes.csw.SportGroup.Cliente.logic.dto.ClientePageDTO;
import java.util.List;

/**
 *
 * @author afesguerra
 */
public interface IClienteLogic {

    public ClienteDTO createCliente(ClienteDTO detail);

    public List<ClienteDTO> getClientes();

    public ClientePageDTO getClientes(Integer page, Integer maxRecords);

    public ClienteDTO getCliente(Long id);

    public void deleteCliente(Long id);

    public void updateCliente(ClienteDTO detail);
   
}
