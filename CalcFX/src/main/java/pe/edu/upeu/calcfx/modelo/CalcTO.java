package pe.edu.upeu.calcfx.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.context.annotation.Primary;

@Entity(name = "calculadora")
@Data
public class CalcTO {
    @Id
    Long id;
    String num1;
    String num2;
    char operador;
    String resultado;
}
