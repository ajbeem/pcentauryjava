<%-- 
    Document   : index
    Created on : 29/12/2018, 02:25:36 PM
    Author     : Alfred
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente WS</title>
    </head>
    <body>
        <h1>Cliente WS</h1>
        <form action="index.jsp" method="POST">
            <input type="text" name="cmpNombre" value="" />
            <input type="submit" value="Enviar" name="enviarNombre" />
        </form>

    <%-- start web service invocation --%><hr/>
    <%
    try {
	pcentaury.com.servicio.NewWebServiceAJM_Service service = new pcentaury.com.servicio.NewWebServiceAJM_Service();
	pcentaury.com.servicio.NewWebServiceAJM port = service.getNewWebServiceAJMPort();
	 // TODO initialize WS operation arguments here
        String datoEnviar=(String)request.getParameter("cmpNombre");
        if(datoEnviar!=null){
            java.lang.String nombre = datoEnviar;
	// TODO process result here
            java.lang.String result = port.saludo(nombre);
            out.println("Hola = "+result);
        }else{
            out.println("Por favor Agrega tu nombre");
        }
	
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
