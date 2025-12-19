package www.spring.com.prueba7.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import www.spring.com.prueba7.entity.Persona;

@Controller
@RequestMapping("/api")
public class PersonaController {


    @GetMapping("/inicio")
    public String formulario(Model model){
        Persona form = new Persona();
        form.setTablaInicial(3);
        form.setTablaFinal(7);
        model.addAttribute("form", form);
        return "index";
    }

    @PostMapping("/tabla")
    public String FormularioRespuesta(@Valid @ModelAttribute("form") Persona form, BindingResult result, Model model){

        if(result.hasErrors()){
            return "index";
        }

        if (form.getTablaInicial() > form.getTablaFinal()){
            result.rejectValue("tablaInicial", "rango", "error" );
        }

        model.addAttribute("nombre", form.getNombre());
        model.addAttribute("edad", form.getEdad());
        model.addAttribute("sexo", form.getSexo());
        model.addAttribute("ocupacion", form.getOcupacion());
        model.addAttribute("tablaInicial", form.getTablaInicial());
        model.addAttribute("tablaFinal", form.getTablaFinal());

        return "resu";
    }
}
