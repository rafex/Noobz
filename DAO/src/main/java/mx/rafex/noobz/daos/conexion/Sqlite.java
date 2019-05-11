package mx.rafex.noobz.daos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sqlite {

    public static Connection conexion;

    static {
        conectarBaseDeDatos();
    }

    private Sqlite() {
    }

    private static void conectarBaseDeDatos() {
        try {
            Class.forName("org.sqlite.JDBC");
            final String url = "jdbc:sqlite:/Users/rafex/job/personal/Noobz/rafex-system.db";
            conexion = DriverManager.getConnection(url);

            System.out.println("Se ha conectado a la base correctamente");
        } catch (final SQLException | ClassNotFoundException e) {
            System.err.println("No se ha podido conectar a la base de datos");
            System.err.println(e.getMessage());
        }
    }

    public static void cerrarConexion() {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (final SQLException ex) {
            System.err.println("Error al cerrar la conexion");
            System.err.println(ex.getMessage());
        }
    }

}
