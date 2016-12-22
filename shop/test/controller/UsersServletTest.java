/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import static org.mockito.Mockito.*;


/**
 *
 * @author NguyenIT
 */
public class UsersServletTest {
    
    @Mock
    RequestDispatcher rd;

    
    @Test
    public void testServlet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class); 
        HttpSession session = request.getSession(true);
        when(request.getParameter("email")).thenReturn("nguyen.nah76@gmail.com");
        when(request.getParameter("pass")).thenReturn("123456");
        when(request.getParameter("command")).thenReturn("Login");
        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("WEB-INF/index.jsp")).thenReturn(rd);
        new UsersServlet().doPost(request, response);

/*        verify(request, atLeast(1)).getParameter("username"); // only if you want to verify username was called...
        */
        
    }

}
