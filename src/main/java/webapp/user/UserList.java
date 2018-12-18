package webapp.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*optional*/
@WebServlet("/list")
public class UserList extends HttpServlet {

    public static UserView creatData(){
        Random random = new Random();
        UserView user = new UserView();
        user.setUsername("Mark"+random.nextInt());
        user.setNickname("markO"+random.nextInt());
        return user;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<UserView> users = Arrays.asList(creatData(), creatData(), creatData());
        req.setAttribute("users", users);
        req.getRequestDispatcher("/secure/list.jsp").forward(req, resp);
    }
}
