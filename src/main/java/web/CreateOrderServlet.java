package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/orders/create")
public class CreateOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {

        response.setContentType("text/html; charset=UTF-8");

        response.getWriter().println("""
                <html>
                <head>
                    <title>Create order</title>
                </head>
                <body>
                    <h1>Создание заказа</h1>

                    <form method="post" action="create">
                        <p>
                            Клиент:
                            <input type="text" name="customer" required>
                        </p>

                        <p>
                            Товар:
                            <select name="product">
                                <option>Корм для попугая</option>
                                <option>Игрушка для кота</option>
                                <option>Аквариум</option>
                            </select>
                        </p>

                        <p>
                            Количество:
                            <input type="number" name="quantity" min="1" value="1">
                        </p>

                        <button type="submit">Создать заказ</button>
                    </form>

                    <br>
                    <a href="../orders">Назад к заказам</a>
                </body>
                </html>
                """);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws IOException {

        response.sendRedirect("../orders");
    }
}