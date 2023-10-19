package ie.atu.notificationservice;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;

@Data@NoArgsConstructor
@AllArgsConstructor

public class UserDetails {
    private String name;
    private String email;
}
