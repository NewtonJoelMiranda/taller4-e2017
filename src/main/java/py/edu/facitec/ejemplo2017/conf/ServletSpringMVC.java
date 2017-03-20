/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.ejemplo2017.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

    //Clases a ser cargadas por el container del propio Spring 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppWebConfiguration.class, JPAConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // Se tiene que colocar aqui para ser adicionada en el cargamiento de la servlet base 
        return new Class[]{};
    }

    //ServletMappings utilizado anteriormente en el web.xml 
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
