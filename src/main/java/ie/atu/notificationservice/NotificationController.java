package ie.atu.notificationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "confirmation-service", url = "http://localhost:8083")
public class NotificationController {
    @PostMapping
    public String registerUser(@RequestBody UserDetails userDetails) {
        // Implement the registration logic here, and return a confirmation message
        return "User notification: " + userDetails.getName();
    }

}
