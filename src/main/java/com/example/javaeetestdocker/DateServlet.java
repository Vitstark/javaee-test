package com.example.javaeetestdocker;        /**
 * @author Vitaly Chekushkin
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(name = "DateServlet", value = "/DateServlet")
public class DateServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("application/json");

    PrintWriter ps = response.getWriter();
    ps.println("{");
    ps.println("\t\"date\" : " + LocalDate.now());
    ps.println("}");
  }
}
