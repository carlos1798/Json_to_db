package com.persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws IOException {
        final String ruta = "/home/carlos/repos/java/persistencia/ejemplo.json";
        File archivo = null;
        InputStream is = null;

        try {
            archivo = new File(ruta);
            is = new FileInputStream(archivo);
            JSONObject json = (JSONObject) JSONValue.parse(new InputStreamReader(is));
            JSONArray slideJson = (JSONArray) json.get("restaurante");
            Iterator<JSONObject> i = slideJson.iterator();
            ArrayList<Restaurante> restaurantes = new ArrayList<>();
            while (i.hasNext()) {
                // Cojemos cada objeto de forma individual
                JSONObject individual = i.next();
                // Del objeto restaurante cojemos la direccion
                JSONObject direccionJson = (JSONObject) individual.get("direccion");
                JSONArray arrayCoordenadas = (JSONArray) direccionJson.get("coord");
                // Sacamos las cordenadas del objeto direccion
                double[] coordenadas = new double[arrayCoordenadas.size()];
                for (int index = 0; index < coordenadas.length; index++) {
                    coordenadas[index] = Double.parseDouble((String) arrayCoordenadas.get(index).toString());
                }
                // Declaramos el array de resenas
                JSONArray resenasJson = (JSONArray) individual.get("resenas");
                Iterator<JSONObject> z = resenasJson.iterator();
                Resena[] resenas = new Resena[resenasJson.size()];

                    int contador = 0;
                while (z.hasNext()) {
                    JSONObject resenaIndividual = z.next();
                    JSONObject fecha = (JSONObject) resenaIndividual.get("fecha");
                    Date date = new Date(Long.parseLong(fecha.get("$date").toString()));

                    Resena resena = new Resena(date, resenaIndividual.get("nivel").toString(),
                            Integer.parseInt(resenaIndividual.get("puntuacion").toString()));
                    resenas[contador] = resena;


                    contador++;
                }
                

                // Creamos la direccion
                Direccion direccion = new Direccion(
                        Integer.parseInt((String) direccionJson.get("numero")),
                        coordenadas,
                        (String) direccionJson.get("calle"),
                        Integer.parseInt((String) direccionJson.get("cod_postal")));

                // Creamos el restaurante
                Restaurante restaurante = new Restaurante(
                        (String) individual.get("nombre"),
                        Integer.parseInt((String) individual.get("restaurant_id")),
                        direccion,
                        (String) individual.get("distrito"),
                        (String) individual.get("cocina"),
                        resenas);
                // Lo metemos en una lista para procesarlos despues
                restaurantes.add(restaurante);

                z = null;
            }
            System.out.println(restaurantes.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
