<%-- 
    Document   : mostrarUsuarios
    Created on : 6/06/2023, 10:30:32 AM
    Author     : SSSA
--%>

<%@page import="java.util.List"%>
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Usuarios</title>
    </head>
    <body>
        <h1>Lista de usuarios registrados</h1>
               <!--//Java-->
        <% 
             List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
             int cont =1;
             for(Usuario usu : listaUsuarios){
                                         
        %>
        
        <!--//HTML-->

           
            
             <p><b>Usuario N° <%=cont%></b></p>
             <p> Dni: <%=usu.getDni()%></p>
             <p>Nombre: <%=usu.getNombre()%></p>
             <p>Apellido: <%=usu.getApellido()%></p>
             <p>Telefono: <%=usu.getTelefono()%></p>
             <p> -------------------------------</p>
             
             <% cont = cont + 1;%>
             
            <% }%>
        
    
        
    </body>
</html>
