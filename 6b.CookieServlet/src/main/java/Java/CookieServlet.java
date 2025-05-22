/*6b. Build a servlet program to create a cookie to get your name through text box and press submit
button( through HTML) to display the message by greeting Welcome back your name ! , you have
visited this page n times ( n = number of your visit ) and demonstrate the expiry of cookie also.*/
package Java;

import java.io.*;
import java.net.URLEncoder;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName = request.getParameter("userName");

        // Create cookie on first request
        if (userName != null && !userName.isEmpty()) {
            String encodedName = URLEncoder.encode(userName, StandardCharsets.UTF_8.toString());
            Cookie userCookie = new Cookie("user", encodedName);
            userCookie.setMaxAge(60); // 1 minute expiry
            userCookie.setPath("/");
            response.addCookie(userCookie);

            Cookie visitCookie = new Cookie("visits", "1");
            visitCookie.setMaxAge(60);
            visitCookie.setPath("/");
            response.addCookie(visitCookie);
        }

        // Read cookies
        Cookie[] cookies = request.getCookies();
        String existingUser = null;
        int visitCount = 1;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    existingUser = URLDecoder.decode(cookie.getValue(), StandardCharsets.UTF_8.toString());
                } else if (cookie.getName().equals("visits")) {
                    try {
                        visitCount = Integer.parseInt(cookie.getValue()) + 1;
                    } catch (NumberFormatException e) {
                        visitCount = 1;
                    }
                }
            }
        }

        // Update visit count if user exists
        if (existingUser != null) {
            Cookie updatedVisit = new Cookie("visits", String.valueOf(visitCount));
            updatedVisit.setMaxAge(60);
            updatedVisit.setPath("/");
            response.addCookie(updatedVisit);
        }

        // HTML Output
        out.println("<html><head><title>Cookie Example</title></head><body>");

        if (existingUser != null) {
            out.println("<font color='blue'><h2>Welcome back, " + existingUser + "!</h2></font>");
            out.println("<font color='magenta'><h2>You have visited this page " + visitCount + " times!</h2></font>");
            out.println("<form action='CookieServlet' method='post'>");
            out.println("<input type='submit' value='Logout'>");
            out.println("</form>");
        } else {
            out.println("<h2>Welcome Guest!</h2>");
            out.println("<form action='CookieServlet' method='get'>");
            out.println("Enter your name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        }

        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Invalidate cookies
        Cookie userCookie = new Cookie("user", "");
        userCookie.setMaxAge(0);
        userCookie.setPath("/");

        Cookie visitCookie = new Cookie("visits", "");
        visitCookie.setMaxAge(0);
        visitCookie.setPath("/");

        response.addCookie(userCookie);
        response.addCookie(visitCookie);

        response.sendRedirect("CookieServlet");
    }
}
