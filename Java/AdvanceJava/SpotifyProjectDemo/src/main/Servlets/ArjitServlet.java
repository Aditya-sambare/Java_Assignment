package Servlets;
import DataBaseConnectionDAO.ConnectionProvider;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
@WebServlet("/ArjitServlet")
public class ArjitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        ResultSet resultSet = null;
        Connection connection = ConnectionProvider.getConnection();
        String loc="C:/Users/coditas/Desktop/Java_Assignment/Java/AdvanceJava/SpotifyProjectDemo/src/main/webapp/Arjit/Aayat.mp3";
        printWriter.println("<audio controls> <source src='"+loc+"' type='audio/mp3'> </audio>");

        try{
            PreparedStatement preparedStatement = connection.prepareStatement("select * from arjit_audio");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                resultSet.getString(2);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
