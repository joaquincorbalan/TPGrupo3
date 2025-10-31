package ar.edu.unrn.seminario.acesos;

public interface VisitaDao {
    void create(Visita visita);
    void update(Visita visita);
    void remove(Long id); // nose cual es el atributo identificatorio
    Visita find(Long id);
    List<Visita> findAll();
}
