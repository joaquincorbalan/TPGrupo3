package ar.edu.unrn.seminario.acesos;

public interface VoluntarioDao {
    void create(Voluntario voluntario);
    void update(Voluntario voluntario);
    void remove(Long id);
    Voluntario find(Long id);
    List<Voluntario> findAll();
}
