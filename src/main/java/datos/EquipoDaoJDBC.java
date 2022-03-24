package datos;

public class EquipoDaoJDBC {

    private static String INSERTAR = "INSERT INTO tienda.equipos (nombre,procesador,sistema_operativo,memoria,pantalla,ram,precio) VALUES (?,?,?,?,?,?,?)";
    private static String LISTAR = "SELECT * FROM tienda.equipos";
    private static String BUSCAR = "SELECT * FROM tienda.equipos WHERE id_equipo = ? ";
    private static String ELIMINAR = "DELETE FROM tienda.equipos WHERE id_equipo = ?";
    private static String ACTUALIZAR = "UPDATE tienda.departamento SET nombre= ? WHERE id_departamento = ?";



}
