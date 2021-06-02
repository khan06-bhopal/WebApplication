/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author This-pc
 */
public class LoginServlet extends HttpServlet {

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
            String email = request.getParameter("Email");
            String password = request.getParameter("password");
            out.print("hi");
            try{
             Connection con = GetConnection.getconnection();
             String sql = "select * from reg where mail=? and password=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, email);
                ps.setString(2, password);
               ResultSet rs =  ps.executeQuery();
              
                   
               if(rs.next()){
               HttpSession  sesstion= request.getSession();
               sesstion.setAttribute("email", email);
               response.sendRedirect("Home");
               
             /* HttpSession sesstion1 = request.getSession();
              sesstion.setAttribute("name", rs.getString(2));
              
             // HttpSession sesstion2 = request.getSession();
              sesstion.setAttribute("fname", rs.getString(3));
              
            //  HttpSession sesstion3 = request.getSession();
              sesstion.setAttribute("email", rs.getString(4));
              
             // HttpSession sesstion4 = request.getSession();
              sesstion.setAttribute("phone", rs.getString(5));
              
            //  HttpSession sesstion5 = request.getSession();
              sesstion.setAttribute("password", rs.getString(6));*/
              
              sesstion.setAttribute("record", rs);
               
               }
               else{
               response.sendRedirect("Login.html");
               }
            }
            catch(Exception exp){
            exp.printStackTrace();
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
