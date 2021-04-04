
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Ejercicio_03 {
//Crear una aplicación que pida por teclado los datos de un alumno y permita 
//introducirlo en la tabla Alumnos de la base de datos Colegio.
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        System.out.println("idAlumno: ");
        int idAlumno = n.nextInt();
        System.out.println("nombre: ");
        String nombre = n.next();
        System.out.println("apellido: ");
        String apellido = n.next();
        System.out.println("curso: ");
        String curso = n.next();
        System.out.println("nota: ");
        double nota = n.nextDouble();  
        System.out.println("observaciones: ");
        String obs = n.next();
        
            
        
         try {
    Connection miConexion =
    DriverManager.getConnection("jdbc:mysql://localhost:3306/colegio",
    "root","");
        System.out.println("Conexión establecida con éxito!!!");

    //Ejecutamos la sentencias SQL
    Statement sentencia = miConexion.createStatement();
    sentencia.executeUpdate("INSERT INTO colegio.alumno VALUES('"+idAlumno+"','"+nombre+"','"+apellido+"','"+curso+"','"+nota+"','"+obs+"')");
    //Recogemos resultados de la base de datos.
     } catch (SQLException e) {
        System.out.println(e.getMessage());
    }   
         
        
   }
    
}
