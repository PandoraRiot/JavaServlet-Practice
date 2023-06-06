/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quintointento.serverlets3;

import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SSSA
 */
@WebServlet(name = "svUsers", urlPatterns = {"/svUsers"})
public class svUsers extends HttpServlet {

   
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        
        
     List<Usuario> listaUsuarios = new ArrayList<>();
     
        listaUsuarios.add(new Usuario("123","Erika","Garcia","5454541"));
        listaUsuarios.add(new Usuario("133","<Juan","Monsalve","8451424"));
        listaUsuarios.add(new Usuario("143","Laura","Duque","875151"));
        listaUsuarios.add(new Usuario("103","Marly","Gil","5456484"));
        
        
       HttpSession misesion = request.getSession(); misesion.setAttribute("listaUsuarios", listaUsuarios);
        misesion.setAttribute("listaUsuarios", listaUsuarios);
        
        response.sendRedirect("mostrarUsuarios.jsp");
            
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
 
        System.out.println("Dni es " + dni);
        System.out.println("nombre es " + nombre);
        System.out.println("apellido es " + apellido);
        System.out.println("telefono es " + telefono);

    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
