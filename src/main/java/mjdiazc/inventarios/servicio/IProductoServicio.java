package mjdiazc.inventarios.servicio;

import java.util.List;
import mjdiazc.inventarios.modelo.Producto;

public interface IProductoServicio {
    public List<Producto> listarProductos();

    public Producto buscarProductoPorId(Integer idProducto);
    public Producto guardarProducto(Producto producto);

    public void eliminarProductoPorId(Integer idProducto);

}
