package com.daw.calculadora.dividir.infraestructura.controladores;

import com.daw.calculadora.dividir.aplicacion.DividirApp;
import com.daw.calculadora.shared.dominio.modelo.Operacion;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class Dividir {
    DividirApp dividir;
    @PostMapping("/dividir")
    Integer divida (@RequestBody Operacion divida) {
        return dividir.operate(
                divida.getOperando1(),
                divida.getOperando2()
        );
    }

}
