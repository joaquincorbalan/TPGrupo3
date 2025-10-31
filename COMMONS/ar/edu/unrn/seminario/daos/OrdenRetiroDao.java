package ar.edu.unrn.seminario.acesos;

public interface OrdenRetiroDao {
    void create(PedidoDonacion pedidoDonacion);
    void update(PedidoDonacion pedidoDonacion);
    void remove(Long id);// nose cual es el atributo identificatorio
    PedidoDonacion find(Long id);
    List<PedidoDonacion> findAll();
}
