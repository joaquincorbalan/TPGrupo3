package ar.edu.unrn.seminario.acesos;

public interface PedidoDonacionDao {
    void create(PedidoDonacion pedidoDonacion);
    void update(PedidoDonacion pedidoDonacion);
    void remove(Long id);
    PedidoDonacion find(Long id);
    List<PedidoDonacion> findAll();
}
