package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTML;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "InitTest", urlPatterns = "/test")
public class InitTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        out.println("""
                 <html>
                     <body>
                        <h1> Hello, world</h1>   
                     </body>
                 </html>
                """);
    }
}
