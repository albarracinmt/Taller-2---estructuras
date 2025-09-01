package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre listas de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos listaEnteros y listaCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre listas (ie., no haga cosas como construir arreglos para evitar la manipulación de listas).
 * 
 * Intente usar varias formas de recorrer las listas (while, for, for each, iteradores ... )
 */
public class SandboxListas
{
    /**
     * Una lista de enteros para realizar varias de las siguientes operaciones.
     */
    private List<Integer> listaEnteros;

    /**
     * Una lista de cadenas para realizar varias de las siguientes operaciones
     */
    private List<String> listaCadenas;

    /**
     * Crea una nueva instancia de la clase con las dos listas inicializadas pero vacías
     */
    public SandboxListas( )
    {
        listaEnteros = new ArrayList<Integer>( );
        listaCadenas = new LinkedList<String>( );
    }

    /**
     * Retorna una copia de la lista de enteros, es decir una nueva lista del mismo tamaño que contiene copias de los valores de la lista original
     * @return Una copia de la lista de enteros
     */
    
    
    
    public List<Integer> getCopiaEnteros( )
    {
    	 List<Integer> copia = new ArrayList<Integer>( );
    	 
         for (Integer n : listaEnteros)
         {
             
        	 
             copia.add(n);
         }
         return copia;
    }

    /**
     * Retorna una copia de la lista de cadenas, es decir una nueva lista del mismo tamaño que contiene copias de los valores de la lista original
     * @return Una copia de la lista de cadenas
     */
    public List<String> getCopiaCadenas( )
    {
    	  List<String> copia = new LinkedList<String>( );
    	  
          for (String p : listaCadenas)
        	  
          {
              copia.add(p);
          }
          
          return copia;
    }

    /**
     * Retorna un arreglo con los valores de la lista de enteros, es decir un arreglo del mismo tamaño que contiene copias de los valores de la lista
     * @return Una arreglo de enteros
     */
    
    
    
    
    public int[] getEnterosComoArreglo( )
    {
    	 int tam = listaEnteros.size( );
    	 
         int[] arre = new int[tam];
         
         for (int i = 0; i < tam; i++)
        	 
         {
             arre[i] = listaEnteros.get(i);
         }
         
         return arre;
    }

    /**
     * Retorna la cantidad de valores en la lista de enteros
     * @return
     */
    
    
    
    
    public int getCantidadEnteros( )
    {
    	 return listaEnteros.size( );
    }

    /**
     * Retorna la cantidad de valores en la lista de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        return listaCadenas.size();
    }

    /**
     * Agrega un nuevo valor al final de la lista de enteros. Es decir que este método siempre debería aumentar en 1 el tamaño de la lista.
     * 
     * @param entero El valor que se va a agregar.
     */
    
    
    public void agregarEntero( int entero )
    
    {
    	listaEnteros.add(entero);
    }

    /**
     * Agrega un nuevo valor al final de la lista de cadenas. Es decir que este método siempre debería aumentar en 1 la capacidad de la lista.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	listaCadenas.add(cadena);
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro de la lista de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	 Iterator<Integer> it = listaEnteros.iterator( );
    	 
         while (it.hasNext( ))
         {
             Integer actual = it.next( );
             
             if (actual != null && actual == valor)
            	 
             {
                 it.remove();
             }
         }
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro de la lista de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	
    	
        Iterator<String> it = listaCadenas.iterator( );
        
        while (it.hasNext( ))
        {
            String actual = it.next( );
            
            if (cadena == null ? actual == null : cadena.equals(actual))
            	
            {
                it.remove( );
            }
        }
    }

    /**
     * Inserta un nuevo entero en la lista de enteros
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en la lista aumentada. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño de la lista, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	
    	 int pos = posicion;
         if (pos < 0) pos  = 0;
         if (pos > listaEnteros.size()) pos = listaEnteros.size();
         listaEnteros.add(pos, entero);
    }

    /**
     * Elimina un valor de la lista de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición de la lista de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	
    	   if ( posicion >= 0 && posicion < listaEnteros.size())
    		   
           {
               listaEnteros.remove(posicion);
           }
    }

    /**
     * Reinicia la lista de enteros con los valores contenidos en el parámetro 'valores', pero truncados.
     * 
     * Es decir que si el valor fuera 3.67, en la nueva lista debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    
    {
    	listaEnteros.clear();
    	
        if (valores == null) return;

        for (int i = 0; i < valores.length; i++)
        {
            int truncado = (int) valores[i];
            
            listaEnteros.add(truncado);
        }
    }

    /**
     * Reinicia la lista de cadenas con las representaciones como Strings de los objetos contenidos en la lista del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Una lista de objetos
     */
    public void reiniciarArregloCadenas( List<Object> objetos )
    
    {
    	   listaCadenas.clear();
    	   
           if (objetos == null) return;

           for (Object o : objetos)
        	   
           {
               String s = String.valueOf(o);
               listaCadenas.add(s);
               
           }
    }

    /**
     * Modifica la lista de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	  for (int i = 0; i < listaEnteros.size( ); i++)
          {
              int n = listaEnteros.get(i);
              
              if (n < 0) n = -n;
              
              listaEnteros.set(i, n);
          }
    }

    /**
     * Modifica la lista de enteros para que todos los valores queden organizados de MAYOR a MENOR.
     */
    public void organizarEnteros( )
    {
    	  int n = listaEnteros.size();
          boolean huboCambios = true;

          
          while (huboCambios)
          {
              huboCambios = false;
              for (int i = 0; i + 1 < n; i++)
              {
                  int a = listaEnteros.get(i);
                  int b = listaEnteros.get(i + 1);
                  if (a < b) 
                  {
                      listaEnteros.set(i, b);
                      
                      listaEnteros.set(i + 1, a);
                      huboCambios = true;
                  }
              }
              
              n = n - 1;
          }
    }

    /**
     * Modifica la lista de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    
    {
    	int n = listaCadenas.size( );
        boolean huboCambios = true;

        while (huboCambios)
        {
            huboCambios = false;
            for (int i = 0; i + 1 < n; i++)
            {
                String a = listaCadenas.get(i);
                
                String b = listaCadenas.get(i + 1);
                
                if (a != null && b != null && a.compareTo(b) > 0)
                	
                {
                    listaCadenas.set(i, b);
                    listaCadenas.set(i + 1, a);
                    huboCambios = true;
                }
                
                else if (a == null && b != null)
                	
                {
                    listaCadenas.set(i, b); 
                    
                    listaCadenas.set(i + 1, a);
                    huboCambios = true;
                }
            }
            
            n =  n - 1;
        }
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en la lista de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    
    
    
    
    public int contarApariciones( int valor )
    {
        int conta = 0;
        for (int i = 0; i < listaEnteros.size( ); i++)
        	
        {
            Integer v = listaEnteros.get(i);
            
            if (v != null && v == valor)
            	
            {
                conta = conta + 1;
            }
        }
        return conta;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en la lista de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    
    
    
    public int contarApariciones( String cadena )
    {
    	int contar = 0;
        for (int i = 0; i < listaCadenas.size( ); i++)
        {
            String s = listaCadenas.get(i);
            if (cadena == null ? s == null : cadena.equalsIgnoreCase(s))
            {
                contar = contar + 1;
            }
        }
        return contar;
    }

    /**
     * Cuenta cuántos valores dentro de la lista de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	  List<Integer> vistos = new ArrayList<Integer>( );
    	  
          List<Integer> repetidos = new ArrayList<Integer>( );

          for (int i = 0; i < listaEnteros.size( ); i++)
        	  
          {
              Integer v = listaEnteros.get(i);

              boolean yaVisto = false;
              
              for (int j = 0; j < vistos.size( ) && !yaVisto; j++)
              {
                  if (vistos.get(j) != null && v != null && vistos.get(j).intValue( ) == v.intValue( ))
                  {
                      yaVisto = true;
                  }
                  else if (vistos.get(j) == null && v == null)
                  {
                      yaVisto = true;
                  }
              }

              if (!yaVisto)
              {
                  vistos.add(v);
              }
              else
              {
                  boolean yaContado = false;
                  
                  for (int k = 0; k < repetidos.size( ) && !yaContado; k++)
                  {
                      Integer r = repetidos.get(k);
                      
                      if ((r == null && v == null) ||
                          (r != null && v != null && r.intValue( ) == v.intValue( )))
                      {
                          yaContado = true;
                      }
                  }
                  if (!yaContado)
                  {
                      repetidos.add(v);
                  }
              }
          }
          
          return repetidos.size( );
    }

    /**
     * Compara la lista de enteros con un arreglo de enteros y verifica si contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos son los mismos y en el mismo orden y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	  if (otroArreglo == null)
    		  
          {
              return listaEnteros.isEmpty();
              
              
          }

    	  
          if (listaEnteros.size() != otroArreglo.length)  return false;
        	   
          
          
          for (int i = 0; i < otroArreglo.length; i++)
        	  
        	  
          {
              Integer v = listaEnteros.get(i);
              
              if (v == null || v.intValue() != otroArreglo[i])
            	  
              {
                  return false;
              }
          }
          return true;
    }

    /**
     * Cambia los elementos de la lista de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en la lista deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en la lista
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	 
        int min = minimo;
        
        int max = maximo;
        
        if (min > max)
        	
        {
            int tmp = min;
            
            min = max;
            
            max = tmp;
        }

        listaEnteros.clear( );
        
        if (cantidad <= 0) return;

        int rango = (max - min) + 1;
        for (int i = 0; i < cantidad; i++)
        {
           
            int val = min + (int)(Math.random() * rango);
            listaEnteros.add(val);
        }
 
    }

}
