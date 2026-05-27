package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/orders")
public class OrdersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        response.getWriter().println("""
                <!DOCTYPE html>
                <html>
                <head>
                    <meta charset="UTF-8">
                    <title>Orders</title>
                </head>
                <body>
                    <h1>Список заказов</h1>

                    <table border="1" cellpadding="8">
                        <tr>
                            <th>ID</th>
                            <th>Клиент</th>
                            <th>Товар</th>
                            <th>Количество</th>
                            <th>Статус</th>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Иван Петров</td>
                            <td>Корм для попугая</td>
                            <td>2</td>
                            <td>Создан</td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>Анна Смирнова</td>
                            <td>Игрушка для кота</td>
                            <td>1</td>
                            <td>Создан</td>
                        </tr>
                    </table>

                    <br>
                    <a href="orders/create">
                        <button>Создать заказ</button>
                    </a>
                </body>
                </html>
                """);
    }
}