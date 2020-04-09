package br.mack.ps2.persistencia;

import br.mack.ps2.entidades.Frequencia;
import java.util.List;

public interface FrequenciaDAO {
    boolean create (Frequencia frequencia);
    List<Frequencia> read ();
}
