package math.ves.api.constroller;

import math.ves.api.professor.Cadastramento;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    @PostMapping
    public void cadastrar(@RequestBody Cadastramento cadastro) {
        System.out.println(cadastro);
    }
}
