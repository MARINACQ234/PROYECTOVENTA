package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tbl_usuariocl2 database table.
 * 
 */
@Entity
@Table(name="tbl_usuariocl2")
@NamedQuery(name="TblUsuariocl2.findAll", query="SELECT t FROM TblUsuariocl2 t")
public class TblUsuariocl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idusuario;

	private String passwordcl2;

	private String usuariocl2;

	//bi-directional many-to-many association to TblProducto
	@ManyToMany
	@JoinTable(
		name="tbl_usuariocl2"
		, joinColumns={
			@JoinColumn(name="idusuario")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idusuario", referencedColumnName="descrip")
			}
		)
	private List<TblProducto> tblProductos;

	public TblUsuariocl2() {
	}

	public int getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getPasswordcl2() {
		return this.passwordcl2;
	}

	public void setPasswordcl2(String passwordcl2) {
		this.passwordcl2 = passwordcl2;
	}

	public String getUsuariocl2() {
		return this.usuariocl2;
	}

	public void setUsuariocl2(String usuariocl2) {
		this.usuariocl2 = usuariocl2;
	}

	public List<TblProducto> getTblProductos() {
		return this.tblProductos;
	}

	public void setTblProductos(List<TblProducto> tblProductos) {
		this.tblProductos = tblProductos;
	}

}