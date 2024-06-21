package interfaces;



import java.util.List;

import model.TblProducto;

public interface lProducto {
public void  RegistrarProdcuto(TblProducto producto);
public void  ActualizarProdcuto(TblProducto producto);
public void  EliminarProdcuto(TblProducto producto);
public TblProducto  BuscarProdcuto(TblProducto producto);
public List<TblProducto> listarProducto();

}
