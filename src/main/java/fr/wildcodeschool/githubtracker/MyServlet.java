package fr.wildcodeschool.githubtracker;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "MyServlet", urlPatterns = "/my-servlets")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<TestModel> trvList = new ArrayList<TestModel>();
        trvList.add(new TestModel("1 bisou"));
        trvList.add(new TestModel("2 bisous"));
        trvList.add(new TestModel("3 bisous"));
        trvList.add(new TestModel("4 bisous"));
        trvList.add(new TestModel("5 bisous"));


        request.setAttribute("list", trvList);
        this.getServletContext().getRequestDispatcher("/list.jsp").forward(request, response);
    }
}
