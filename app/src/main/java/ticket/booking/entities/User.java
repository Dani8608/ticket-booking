package ticket.booking.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)

public class User {

    private String userId;

     private String name;

     private String password;

     private String hashedPassword;

     private List<Ticket> ticketBooked;

     public User(String userId,String name,String password,String hashedPassword,List<Ticket> booked){
         this.userId = userId;
         this.name = name;
         this.password = password;
         this.hashedPassword = hashedPassword;
         this.ticketBooked = booked;
     }

    public User(){}

    public String getName() {
        return name;
    }

    public String getPassword(){
        return password;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public List<Ticket> getTicketsBooked() {
        return ticketBooked;
    }

    public void printTickets(){
        for (int i = 0; i<ticketBooked.size(); i++){
            System.out.println(ticketBooked.get(i).getTicketInfo());
        }
    }

    public String getUserId() {
        return userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public void setTicketsBooked(List<Ticket> ticketsBooked) {
        this.ticketBooked = ticketsBooked;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
