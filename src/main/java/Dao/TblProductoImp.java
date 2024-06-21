package Dao;





import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TblProducto;

import interfaces.lProducto;

public class TblProductoImp implements lProducto{

	@Override
	public void RegistrarProdcuto(TblProducto producto) {
		// TODO Auto-generated method stub
		EntityManagerFactory em=Persistence.createEntityManagerFactory("PROYECTOVENTA");
		EntityManager  emanager=em.createEntityManager();
		emanager.getTransaction().begin();
		emanager.persist(producto);
		System.out.println("producto registrado en la BD");
		emanager.getTransaction().commit();
		emanager.close();
	}

	@Override
	public void ActualizarProdcuto(TblProducto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarProdcuto(TblProducto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TblProducto BuscarProdcuto(TblProducto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TblProducto> listarProducto() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
