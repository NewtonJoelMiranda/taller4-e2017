package py.edu.facitec.ejemplo2017.controller;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import py.edu.facitec.ejemplo2017.dao.ClienteDAO;
import py.edu.facitec.ejemplo2017.model.Cliente;

@Transactional
@Controller
public class ClienteController {

    @Autowired
    private ClienteDAO clienteDAO;

    @RequestMapping("cliente")
    public String save(Cliente cliente) {
        System.out.println("Registrando el cliente: " + cliente);
        clienteDAO.save(cliente);
        return "view/cliente/ok";
    }
}
