package math.ves.api.constroller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class MathController {

    @GetMapping
    public String OlaMundo() {
        return "Home";
    }
}
