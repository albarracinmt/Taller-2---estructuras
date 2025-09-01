package uniandes.dpoo.estructuras.logica;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre mapas.
 *
 * Todos los métodos deben operar sobre el atributo mapaCadenas que se declara como un Map.
 * 
 * En este mapa, las llaves serán cadenas y los valores serán también cadenas. La relación entre los dos será que cada llave será igual a la cadena del valor, pero invertida.
 * 
 * El objetivo de usar el tipo Map es que sólo puedan usarse métodos de esa interfaz y no métodos adicionales provistos por la implementación concreta (HashMap).
 * 
 * No pueden agregarse nuevos atributos.
 */
public class SandboxMapas
{
    /**
     * Un mapa de cadenas para realizar varias de las siguientes operaciones.
     * 
     * Las llaves del mapa son cadenas, así como los valores.
     * 
     * Las llaves corresponden a invertir la cadena que aparece asociada a cada llave.
     */
    private Map<String, String> mapaCadenas;

    /**
     * Crea una nueva instancia de la clase con las dos listas inicializadas pero vacías
     */
    public SandboxMapas( )
    {
        mapaCadenas = new HashMap<String, String>( );
    }

    /**
     * Retorna una lista con las cadenas del mapa (los valores) ordenadas lexicográficamente
     * @return Una lista ordenada con las cadenas que conforman los valores del mapa
     */
    
    
    
    public List<String> getValoresComoLista( )
    {
    	List<String> r = new ArrayList<>(mapaCadenas.values() );
        Collections.sort(r);
        
        return r;
    }

    
    
    
    /**
     * Retorna una lista con las llaves del mapa ordenadas lexicográficamente de mayor a menor
     * @return Una lista ordenada con las cadenas que conforman las llaves del mapa
     */
    
    private String invertir(String s)
    {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--)
        {
            r += s.charAt(i);
        }
        return r;
    }

    
    
    public List<String> getLlavesComoListaInvertida( )
    {
    	List<String> r = new ArrayList<>(mapaCadenas.keySet());
        r.sort (Collections.reverseOrder() );
        
        return r;
    }

    /**
     * Retorna la cadena que sea lexicográficamente menor dentro de las llaves del mapa .
     * 
     * Si el mapa está vacío, debe retornar null.
     * @return
     */
    public String getPrimera( )
    
    {
        if (mapaCadenas.isEmpty()) return null;
        String min = null;
        for (String k : mapaCadenas.keySet())
        {
            if (min == null ||  k.compareTo(min) < 0) min = k;
        }
        return min;
    }
    

    /**
     * Retorna la cadena que sea lexicográficamente mayor dentro de los valores del mapa
     * 
     * Si el conjunto está vacío, debe retornar null.
     * @return
     */
    public String getUltima( )
    
    
    {
        if (mapaCadenas.isEmpty() ) return null;
        
        String max = null;
        
        
        for (String v :  mapaCadenas.values())
        	
        {
            if (max == null || v.compareTo(max) > 0) max = v;
        }
        
        return max;
    }

    /**
     * Retorna una colección con las llaves del mapa, convertidas a mayúsculas.
     * 
     * El orden de las llaves retornadas no importa.
     * @return Una lista de cadenas donde todas las cadenas están en mayúsculas
     */
    
    
    public Collection<String> getLlaves( )
    
    {
        List<String> r = new ArrayList<String>();
        
        for (String k : mapaCadenas.keySet())
        	
        {
            r.add(k == null ? null : k.toUpperCase());
        }
        
        return r;
    }

    

    /**
     * Retorna la cantidad de *valores* diferentes en el mapa
     * @return
     */
    
    public int getCantidadCadenasDiferentes( )
    
    {
        HashSet<String> unicos = new HashSet<String>( mapaCadenas.values() );
        return unicos.size();
    }

    /**
     * Agrega un nuevo valor al mapa de cadenas: el valor será el recibido por parámetro, y la llave será la cadena invertida
     * 
     * Este método podría o no aumentar el tamaño del mapa, dependiendo de si ya existía la cadena en el mapa
     * 
     * @param cadena La cadena que se va a agregar al mapa
     */
    public void agregarCadena( String cadena )
    
    {                                                                                 
        if (cadena == null) return;
        String llave = invertir(cadena);
        mapaCadenas.put(llave, cadena);
    }
    

    /**
     * Elimina una cadena del mapa, dada la llave
     * @param cadena La llave para identificar el valor que se debe eliminar
     */
    public void eliminarCadenaConLLave( String llave )
    {
        mapaCadenas.remove(llave);

    }

    /**
     * Elimina una cadena del mapa, dado el valor
     * @param cadena El valor que se debe eliminar
     */
    public void eliminarCadenaConValor( String valor ) {
    	
    	if (valor == null) return;

        Iterator<Map.Entry<String,String>> it = mapaCadenas.entrySet().iterator();
        
        boolean eliminado = false;

        while (it.hasNext() && !eliminado) {
        	
            Map.Entry<String,String> e = it.next();
            
            String v = e.getValue();
            
            if ((v == null && valor == null) || (v != null && v.equals(valor))) 
            
            {
                it.remove();
                eliminado = true;   
                
            }
        }
    }

    

    /**
     * Reinicia el mapa de cadenas con las representaciones como Strings de los objetos contenidos en la lista del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Una lista de objetos
     */
    public void reiniciarMapaCadenas( List<Object> objetos )
    {
    	 mapaCadenas.clear();
    	 
         if (objetos == null) return;

         for (Object o : objetos)
         {
             String valor = String.valueOf(o);
             
             String llave = invertir(valor);
             
             mapaCadenas.put(llave, valor);
             
             
             
             
         }
    }

    /**
     * Modifica el mapa de cadenas reemplazando las llaves para que ahora todas estén en mayúsculas pero sigan conservando las mismas cadenas asociadas.
     */
    public void volverMayusculas( )
    
    {

    	 if (mapaCadenas.isEmpty()) return;

         Map<String,String> nuevo = new HashMap<String,String>();
         
         
         for (Map.Entry<String,String> e : mapaCadenas.entrySet())
        	 
         {
             String k = e.getKey();
             
             String v = e.getValue();
             
             String kMayus = (k == null) ? null : k.toUpperCase();
             
             
             nuevo.put(kMayus, v);
         }
         
         
         
         mapaCadenas = nuevo;
    	
    }

    /**
     * Verifica si todos los elementos en el arreglo de cadenas del parámetro hacen parte del mapa de cadenas (de los valores)
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si todos los elementos del arreglo están dentro de los valores del mapa
     */
    public boolean compararValores( String[] otroArreglo )
    {
        if (otroArreglo == null) return true;
        
        HashSet<String> valores = new HashSet<String>( mapaCadenas.values()  );
        
        for (int i = 0; i < otroArreglo.length; i++)
        	
        {
            if (!valores.contains(otroArreglo[i])) return false;
            
        }
        return true;
    }

}
