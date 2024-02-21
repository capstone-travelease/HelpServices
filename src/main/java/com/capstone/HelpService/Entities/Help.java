package com.capstone.HelpService.Entities;

import jakarta.persistence.*;

@Entity
@Table
public class Help {
    @Id
    private Integer help_id;
    @Column(name="booking_state")
    private Boolean bookingState;
    @Column(name="ticket_id")
    private Integer ticketId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "contact_number")
    private String contactNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "messages")
    private String messages;

    public Help(Boolean bookingState, Integer ticketId, String userName, String contactNumber, String email, String messages) {
        this.bookingState = bookingState;
        this.ticketId = ticketId;
        this.userName = userName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.messages = messages;
    }

    public Help(Integer help_id, Boolean bookingState, Integer ticketId, String userName, String contactNumber, String email, String messages) {
        this.help_id = help_id;
        this.bookingState = bookingState;
        this.ticketId = ticketId;
        this.userName = userName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.messages = messages;
    }

    public Integer getHelp_id() {
        return help_id;
    }

    public void setHelp_id(Integer help_id) {
        this.help_id = help_id;
    }

    public Boolean getBookingState() {
        return bookingState;
    }

    public void setBookingState(Boolean bookingState) {
        this.bookingState = bookingState;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "Help{" +
                "help_id=" + help_id +
                ", bookingState=" + bookingState +
                ", ticketId=" + ticketId +
                ", userName='" + userName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                ", messages='" + messages + '\'' +
                '}';
    }
}
