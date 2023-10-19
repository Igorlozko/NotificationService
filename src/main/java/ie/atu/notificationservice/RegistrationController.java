package ie.atu.notificationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegistrationController {

    @Autowired
    private NotificationServiceClient notificationServiceClient;

    @PostMapping
    public String registerUser(@RequestBody UserDetails userDetails) {
        // Implement the registration logic here

        // After successful registration, send a notification using the Feign client
        String notificationMessage = "User " + userDetails.getName() + " (" + userDetails.getEmail() + ") has been successfully registered.";
        String notificationResponse = notificationServiceClient.sendNotification(notificationMessage);

        return "User registered. Notification response: " + notificationResponse;
    }
}