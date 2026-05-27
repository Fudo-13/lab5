package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/api/products")
public class ProductsRestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {

        response.setContentType("application/json; charset=UTF-8");

        response.getWriter().println("""
                [
                  {
                    "name": "Корм для попугая",
                    "category": "Корма",
                    "stockQuantity": 25
                  },
                  {
                    "name": "Игрушка для кота",
                    "category": "Игрушки",
                    "stockQuantity": 14
                  },
                  {
                    "name": "Аквариум",
                    "category": "Аквариумистика",
                    "stockQuantity": 7
                  }
                ]
                """);
    }
}