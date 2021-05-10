package com.nims.demo.mail;

import com.nims.demo.model.RegistrationEvent;
import org.springframework.stereotype.Component;

@Component
public class ConfirmationMailTransformer {

    public String toMailText(RegistrationEvent event) {
        return "Dear " + event.getAttendeeFirstName() + " " + event.getAttendeeLastName() + ",\n\n" +
                "Thank you for registering for the Nims World Tech. We are looking forward to meeting you!\n\n" +
                "Your ticket code is: " + event.getTicketType() + "-" + event.getTicketCode() + "\n\n" +
                "Sincerely,\n\n" +
                "Nims Registration Team (registration@nims.com)";
    }
}
