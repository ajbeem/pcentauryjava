/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcentaury.com.servicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Alfred
 */
@WebService(serviceName = "NewWebServiceAJM")
public class NewWebServiceAJM {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "saludo")
    public String hello(@WebParam(name = "nombre") String nombre) {
        return "--Esta es la respuesta del servidor--\n Se recibio el dato: " + nombre + "\nSaludos";
    }
}
