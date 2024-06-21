package Test;

import Dao.TblProductoImp;
import model.TblProducto;

public class TestProducto {
public  static  void main(String[]args){
	TblProducto prodcuto=new TblProducto();
	TblProductoImp crud=new TblProductoImp();
	
	prodcuto.setNombreproducto("caritas");
	prodcuto.setPrecioventa(23);
	prodcuto.setPreciocomp(25);
	prodcuto.setEstado("DISPONIBLE");
	prodcuto.setDESCRIP("buen altas calorias");
	crud.RegistrarProdcuto(prodcuto);
	
	
}
}
