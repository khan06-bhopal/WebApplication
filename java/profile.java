/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author This-pc
 */
public class profile extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
            HttpSession sesstion = request.getSession();
          /* Object name =  sesstion.getAttribute("name");
                 out.print("<br> "+name+ " ");
           
           
          
           Object fname =  sesstion.getAttribute("fname");
           out.print("<br> "+fname+ " ");
           
          
           Object email =  sesstion.getAttribute("email");
                 
           out.print("<br> "+email+ " ");
           
          
           Object phone =  sesstion.getAttribute("phone");
                 
           out.print("<br> "+phone+ " ");
           
          
           Object password =  sesstion.getAttribute("password");
                 
           out.print("<br> "+password+ " ");*/
        
           
           Object rs =sesstion.getAttribute("record");
           ResultSet rs1 = (ResultSet)rs; 
          
            try {
                ResultSetMetaData rsmd = rs1.getMetaData();
                out.println("<table align=center border=2>");
                out.println("<tr>");
                out.println("<td align = 'center' colspan='2'>");
                out.println("<h2>profile</h2>");
                out.println("</td>");
                out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println(rsmd.getColumnName(2));
            out.println("</td>");
            out.println("<td>");
            out.println(rs1.getString(2));
            out.println("</td>");
            out.println("</tr>");
            
             out.println("<tr>");
            out.println("<td>");
            out.println(rsmd.getColumnName(3));
            out.println("</td>");
            out.println("<td>");
            out.println(rs1.getString(3));
            out.println("</td>");
            out.println("</tr>");
            
             out.println("<tr>");
            out.println("<td>");
            out.println(rsmd.getColumnName(4));
            out.println("</td>");
            out.println("<td>");
            out.println(rs1.getString(4));
            out.println("</td>");
            out.println("</tr>");
            
             out.println("<tr>");
            out.println("<td>");
            out.println(rsmd.getColumnName(5));
            out.println("</td>");
            out.println("<td>");
            out.println(rs1.getString(5));
            out.println("</td>");
            out.println("</tr>");
            
              out.println("<tr>");
            out.println("<td>");
            out.println(rsmd.getColumnName(6));
            out.println("</td>");
            out.println("<td>");
            out.println(rs1.getString(6));
            out.println("</td>");
            out.println("</tr>");          
            out.println("</table>");
                
            } catch (SQLException ex) {
               // Logger.getLogger(profile.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
           
          
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
