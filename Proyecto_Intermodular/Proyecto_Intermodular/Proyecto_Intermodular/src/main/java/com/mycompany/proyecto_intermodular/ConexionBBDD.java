/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_intermodular;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 */
public class ConexionBBDD {

    // Configuración de la conexión a la base de datos MySQL
    String url = "jdbc:mysql://localhost:3306/practica_intermodular";
    String usuario = "root";
    String contraseña = "Med@c";

    // Sentencias SQL
    String sqlMercurio = "SELECT * FROM Planeta where nombre ='Mercurio' ";
    String sqlVenus = "SELECT * FROM Planeta where nombre ='Venus' ";
    String sqlTierra = "SELECT * FROM Planeta where nombre ='Tierra' ";
    //String sqlMarte = "SELECT * FROM Planeta where nombre ='Marte' ";
    String sqlJupiter = "SELECT * FROM Planeta where nombre ='Júpiter' ";
    String sqlSaturno = "SELECT * FROM Planeta where nombre ='Saturno' ";
    String sqlUrano = "SELECT * FROM Planeta where nombre ='Urano' ";
    String sqlNeptuno = "SELECT * FROM Planeta where nombre ='Neptuno' ";

    //Métodos especiales
    public ArrayList<String> conectarConsultarMarte() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlMarte = "SELECT * FROM Planeta where nombre ='Marte' ";

            ResultSet resultados = statement.executeQuery(sqlMarte);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_sol");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String numero_satelites = resultados.getString("numero_satelites");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(numero_satelites);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    public ArrayList<String> conectarConsultarMercurio() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlMercurio = "SELECT * FROM Planeta where nombre ='Mercurio' ";

            ResultSet resultados = statement.executeQuery(sqlMercurio);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_sol");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String numero_satelites = resultados.getString("numero_satelites");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(numero_satelites);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    public ArrayList<String> conectarConsultarVenus() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlVenus = "SELECT * FROM Planeta where nombre ='Venus' ";

            ResultSet resultados = statement.executeQuery(sqlVenus);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
               String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_sol");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String numero_satelites = resultados.getString("numero_satelites");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(numero_satelites);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    public ArrayList<String> conectarConsultarTierra() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlTierra = "SELECT * FROM Planeta where nombre ='Tierra' ";

            ResultSet resultados = statement.executeQuery(sqlTierra);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_sol");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String numero_satelites = resultados.getString("numero_satelites");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(numero_satelites);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    public ArrayList<String> conectarConsultarJupiter() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlJupiter = "SELECT * FROM Planeta where nombre ='Júpiter' ";

            ResultSet resultados = statement.executeQuery(sqlJupiter);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_sol");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String numero_satelites = resultados.getString("numero_satelites");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(numero_satelites);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    public ArrayList<String> conectarConsultarSaturno() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlSaturno = "SELECT * FROM Planeta where nombre ='Saturno' ";

            ResultSet resultados = statement.executeQuery(sqlSaturno);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_sol");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String numero_satelites = resultados.getString("numero_satelites");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(numero_satelites);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    public ArrayList<String> conectarConsultarUrano() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlUrano = "SELECT * FROM Planeta where nombre ='Urano' ";

            ResultSet resultados = statement.executeQuery(sqlUrano);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_sol");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String numero_satelites = resultados.getString("numero_satelites");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(numero_satelites);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    public ArrayList<String> conectarConsultarNeptuno() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlNeptuno = "SELECT * FROM Planeta where nombre ='Neptuno' ";

            ResultSet resultados = statement.executeQuery(sqlNeptuno);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_sol");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String numero_satelites = resultados.getString("numero_satelites");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(numero_satelites);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    //Métodos especiales de los satélites
    public ArrayList<String> conectarConsultarLuna() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlLuna = "SELECT * FROM Satelite where nombre ='Luna' ";

            ResultSet resultados = statement.executeQuery(sqlLuna);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_planeta");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    public ArrayList<String> conectarConsultarFobos() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlFobos = "SELECT * FROM Satelite where nombre ='Fobos' ";

            ResultSet resultados = statement.executeQuery(sqlFobos);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_planeta");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    public ArrayList<String> conectarConsultarDeimos() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlDeimos = "SELECT * FROM Satelite where nombre ='Deimos' ";

            ResultSet resultados = statement.executeQuery(sqlDeimos);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_planeta");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    public ArrayList<String> conectarConsultarIo() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlIo = "SELECT * FROM Satelite where nombre ='Ío' ";

            ResultSet resultados = statement.executeQuery(sqlIo);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_planeta");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    public ArrayList<String> conectarConsultarEuropa() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlEuropa = "SELECT * FROM Satelite where nombre ='Europa' ";

            ResultSet resultados = statement.executeQuery(sqlEuropa);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_planeta");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    public ArrayList<String> conectarConsultarGanimedes() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlGanimedes = "SELECT * FROM Satelite where nombre ='Ganimedes' ";

            ResultSet resultados = statement.executeQuery(sqlGanimedes);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_planeta");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    public ArrayList<String> conectarConsultarCalisto() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlCalisto = "SELECT * FROM Satelite where nombre ='Calisto' ";

            ResultSet resultados = statement.executeQuery(sqlCalisto);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_planeta");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    public ArrayList<String> conectarConsultarTitan() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlTitan = "SELECT * FROM Satelite where nombre ='Titán' ";

            ResultSet resultados = statement.executeQuery(sqlTitan);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_planeta");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    public ArrayList<String> conectarConsultarEncelado() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlEncelado = "SELECT * FROM Satelite where nombre ='Encélado' ";

            ResultSet resultados = statement.executeQuery(sqlEncelado);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_planeta");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    public ArrayList<String> conectarConsultarTitania() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlTitania = "SELECT * FROM Satelite where nombre ='Titania' ";

            ResultSet resultados = statement.executeQuery(sqlTitania);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_planeta");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

    public ArrayList<String> conectarConsultarOberon() {
        //1. Crear Array

        ArrayList<String> array = new ArrayList<>();

        //2. Conectarme
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            //3. Lanzar Query

            String sqlOberon = "SELECT * FROM Satelite where nombre ='Oberón' ";

            ResultSet resultados = statement.executeQuery(sqlOberon);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                String nombre = resultados.getString("nombre");
                String radio = resultados.getString("radio");
                String distancia_sol = resultados.getString("distancia_planeta");
                String periodo_orbital = resultados.getString("periodo_orbital");
                String temperatura = resultados.getString("temperatura");
                String tipo = resultados.getString("tipo");
                String fecha = resultados.getString("fecha_creacion");

                //4. Recoger datos y guardar en array
                array.add(nombre);
                array.add(radio);
                array.add(distancia_sol);
                array.add(periodo_orbital);
                array.add(temperatura);
                array.add(tipo);
                array.add(fecha);

            }

            // Cerrar recursos
            statement.close();

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5. Return array

        return array;

    }

}
