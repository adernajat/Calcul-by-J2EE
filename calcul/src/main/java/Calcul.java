import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calcul extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        String operation = req.getParameter("operation");
        double result;
        
        try {
            double number1 = Double.parseDouble(num1);
            double number2 = Double.parseDouble(num2);
        
            if ("addition".equals(operation)) {
                result = number1 + number2;
            } else if ("subtraction".equals(operation)) {
                result = number1 - number2;
            } else if ("multiplication".equals(operation)) {
                result = number1 * number2;
            } else if ("division".equals(operation)) {
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    result = Double.NaN; 
                }
            } else {
                result = Double.NaN; 
            }
            out.println("<html><body>");
            out.println("<h2>Calculator Result</h2>");
            if (!Double.isNaN(result)) {
                out.println("<p>Result: " + result + "</p>");
            } else {
                out.println("<p>Error: Invalid input or no operation selected</p>");
            }
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            out.println("<html><body>");
            out.println("<h2>Calculator Result</h2>");
            out.println("<p>Error: Invalid input</p>");
            out.println("</body></html>");
        }
        
        
}}
