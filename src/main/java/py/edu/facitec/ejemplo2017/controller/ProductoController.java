package py.edu.facitec.ejemplo2017.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.ejemplo2017.dao.ProductoDao;
import py.edu.facitec.ejemplo2017.model.Producto;

@Transactional
@Controller
public class ProductoController {
	@Autowired
	private ProductoDao productoDao;
	
	@RequestMapping("producto")
	public String save( Producto producto){
		System.out.println("Registrando el producto:" + producto);
		productoDao.save(producto);
		return "view/producto/ok";
		
	}
	
}
