package controllers;

import entity.ConferenceRoom;
import entity.User;
import services.DatabaseServices;
import services.DatabaseServicesImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AddRoomServlet")
public class AddRoomServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        int roomId = Integer.parseInt(req.getParameter("roomId"));
        String roomName = req.getParameter("roomName");
        ConferenceRoom conferenceRoom = new ConferenceRoom();
        conferenceRoom.setRoomId(roomId);
        conferenceRoom.setRoomName(roomName);
        DatabaseServices databaseServices = new DatabaseServicesImplementation();
        databaseServices.addRoom(conferenceRoom);
        printWriter.println("room added");
        printWriter.println("<a href='WelcomePage.html'>click here to go back to welcome page</a>");
    }
}
