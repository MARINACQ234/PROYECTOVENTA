package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tbl_producto database table.
 * 
 */
@Entity
@Table(name="tbl_producto")
@NamedQuery(name="TblProducto.findAll", query="SELECT t FROM TblProducto t")
public class TblProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproducto;

	private String estado;

	private String nombreproducto;

	private double preciocomp;

	private double precioventa;

	//bi-directional many-to-many association to TblUsuariocl2
	@ManyToMany(mappedBy="tblProductos")
	private List<TblUsuariocl2> tblUsuariocl2s;

	private String descrip;

	public TblProducto() {
	}

	public int getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setDESCRIP(String descrip) {
		this.descrip = descrip;
	}

	public String getNombreproducto() {
		return this.nombreproducto;
	}

	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}

	public double getPreciocomp() {
		return this.preciocomp;
	}

	public void setPreciocomp(double preciocomp) {
		this.preciocomp = preciocomp;
	}

	public double getPrecioventa() {
		return this.precioventa;
	}

	public void setPrecioventa(double precioventa) {
		this.precioventa = precioventa;
	}

	public List<TblUsuariocl2> getTblUsuariocl2s() {
		return this.tblUsuariocl2s;
	}

	public void setTblUsuariocl2s(List<TblUsuariocl2> tblUsuariocl2s) {
		this.tblUsuariocl2s = tblUsuariocl2s;
	}

}