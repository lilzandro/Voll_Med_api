package med.voll.api.domain.medico;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    Page<Medico> findByActivoTrue(Pageable paginacion);

    @Query("""
            select m from medico m
            where m.activo=1 and
            m.especialidad=:especialidad and
            m.id not in(
                select c.medico.id from Consulta c
                c.data=:fecha
            )
            order by rand()
            limit 1
            """;)
    Medico medicoEspecialidadConFecha(Especialidad especialidad, LocalDateTime fecha);

}
