package com.daw.calculadora.potenciar.infraestructura.controladores;

import com.daw.calculadora.potenciar.aplicacion.PotenciarApp;
import com.daw.calculadora.shared.dominio.modelo.Operacion;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Potenciar {

    PotenciarApp potenciar;
    @PostMapping("/potenciar")
    Integer potencia(@RequestBody Operacion potencia){
        return potenciar.operate(
                potencia.getOperado1(),
                potencia.getOperado2()
        );
    }
}
