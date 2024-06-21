<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Producto</title>
</head>
<body  bgcolor="#c6dec9">
<h1 align="center" >
Registrar Producto
</h1>
<form action=ControladorProducto method="post">
<table align="center">
<tr>
<td>Nombre</td>
<td><input type="text" name="Nombre"> </td>
</tr>
<tr>
<td>Precio</td>
<td><input type="text" name="Precio"> </td>
</tr>
<tr>
<td>PrecioComp</td>
<td><input type="text" name="PrecioComp"> </td>
</tr>
<tr>
<td>Estado</td>
<td><input type="text" name="Estado"> </td>
</tr>
<tr>
<td>Descrip</td>
<td><input type="text" name="Descrip"> </td>
</tr>
<tr>
<td colspan="2" style="text-alingn:center">
<input type="submit" value="Resgistrar">
</td>
</tr>
</table>
</form>
</body>
</html>