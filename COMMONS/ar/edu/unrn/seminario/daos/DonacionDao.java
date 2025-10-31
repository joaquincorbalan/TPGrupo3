package ar.edu.unrn.seminario.acesos;

public interface DonacionDao {
    void create(Donacion donacion);
    void update(Donacion donacion);
    void remove(Long id);// nose cual es el atributo identificatorio
    Donacion find(Long id);
    List<Donacion> findAll();
}
