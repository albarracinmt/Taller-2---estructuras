package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;	

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    
    {
    	int n = arregloEnteros.length;
    	
        int[] copia = new int[n];
        
        for (int i = 0; i < n;  i++)
        	
        {
            copia[i] = arregloEnteros[i];
        }
        
        return copia;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	 int n = arregloCadenas.length;
    	 
         String[] copia = new String[n];
         
         for (int i = 0; i < n; i++)
        	 
         {
             copia[i] = arregloCadenas[i];
         }
         
         return copia;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
    	 return arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	return arregloCadenas.length;     }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	 int n = arregloEnteros.length;
    	 
         int[] nuevo = new int[n + 1];
         
         for (int i = 0; i < n; i++)
        	 
         {
             nuevo[i] = arregloEnteros[i];
         }
         
         nuevo[n] = entero;
         
         arregloEnteros = nuevo;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	 int z = arregloCadenas.length;
    	 
         String[] nuevo = new String[z + 1];
         
         for (int i = 0; i < z; i++)
        	 
         {
             nuevo[i] = arregloCadenas[i];
         }
         
         nuevo[z] = cadena;
         
         arregloCadenas = nuevo;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	 int n = arregloEnteros.length;

         int quedan = 0;
         
         for (int i = 0; i < n; i++)
         {
             if (arregloEnteros[i] != valor)
             {
                 quedan = quedan + 1;
             }
         }

         int[] nuevo = new int[quedan];
         
         int j = 0;
         
         for (int i = 0; i < n; i++)
         {
             if (arregloEnteros[i] != valor)
             {
                 nuevo[j] = arregloEnteros[i];
                 j = j + 1;
             }
         }
         arregloEnteros = nuevo;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	  int n = arregloCadenas.length;

          int quedan = 0;
          
          for (int i = 0; i < n; i++)
          {
              String actual = arregloCadenas[i];
              
              boolean iguales = (cadena == null) ? (actual == null) : cadena.equals(actual);
              
              if (!iguales)
            	  
              {
                  quedan = quedan + 1;
              }
          }

          String[] nuevo = new String[quedan];
          
          int j = 0;
          
          for (int i = 0; i < n; i++)
        	  
          {
              String actual = arregloCadenas[i];
              
              boolean iguales = (cadena == null) ? (actual == null) : cadena.equals(actual);
              
              if (!iguales)
              {
                  nuevo[j] = actual;
                  
                  j = j + 1;
              }
          }
          arregloCadenas = nuevo;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	 int n = arregloEnteros.length;
    	 
         int pos = posicion;
         
         if (pos < 0) pos = 0;
         
         if (pos > n) pos = n;

         
         int[] nuevo = new int[n + 1];
         
         for (int i = 0; i < pos; i++)
        	 
         {
             nuevo[i] = arregloEnteros[i];
         }
         nuevo[pos] = entero;
         
         for (int i = pos; i < n; i++)
        	 
         {
             nuevo[i + 1] = arregloEnteros[i];
         }
         
         arregloEnteros = nuevo;
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	 int n = arregloEnteros.length;
    	 
         if (posicion < 0 || posicion >= n)
        	 
         {
             return;
         }

         int[] nuevo = new int[n - 1];
         
         int j = 0;
         
         for (int i = 0; i < n; i++)
        	 
         {
             if (i != posicion)
             {
                 nuevo[j] = arregloEnteros[i];
                 
                 j = j + 1;
             }
         }
         arregloEnteros = nuevo;
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	 if (valores == null)
    		 
    		 
         {
             arregloEnteros = new int[]{};
             
             return;
         }
         int n = valores.length;
         
         int[] nuevo = new int[n];
         
         for (int i = 0; i <  n; i++)
        	 
         {
             nuevo[i] = (int) valores[i]; 
             
         }
         arregloEnteros =  nuevo;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	if (objetos == null)
        {
            arregloCadenas = new String[]{};
            
            return;
        }
    	
        int n = objetos.length;
        
        String[] nuevo = new String[n];
        
        for (int i = 0; i < n; i++)
        	
        {
            nuevo[i] = String.valueOf(objetos[i]);
            
        }
        arregloCadenas = nuevo;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    
    {
    	 for (int i = 0; i < arregloEnteros.length; i++) 
    		 
         {
             int k = arregloEnteros[i];
             
             if (k < 0) k = -k;
             
             arregloEnteros[i] = k;
         }
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	 int n = arregloEnteros.length;
    	 
         boolean huboCambios = true;
         
         while (huboCambios)
         {
             huboCambios = false;
             for (int i = 0; i + 1 < n; i++)
             {
                 int a = arregloEnteros[i];
                 
                 int b = arregloEnteros[i + 1];
                 
                 if (a > b)
                 {
                     arregloEnteros[i] = b;
                     
                     arregloEnteros[i + 1] = a;
                     
                     huboCambios = true;
                 }
             }
             n = n - 1;
         }
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	int n = arregloCadenas.length;
    	
        boolean huboCambios = true;
        
        while (huboCambios)
        	
        {
            huboCambios = false;
            
            for (int i = 0; i + 1 < n; i++)
            {
                String a = arregloCadenas[i];
                
                String b = arregloCadenas[i + 1];
                
                if ( a == null && b != null)
                {
                    arregloCadenas[i] = b;
                    
                    arregloCadenas[i + 1] = a;
                    
                    huboCambios = true;
                }
                else if ( a != null && b != null && a.compareTo(b) > 0)
                {
                    arregloCadenas[i] = b;
                    
                    arregloCadenas[i + 1] = a;
                    
                    huboCambios = true;
                }
            }
            n = n - 1;
        }
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	  int c = 0;
    	  
          for (int i = 0; i < arregloEnteros.length; i++)
          {
              if (arregloEnteros[i] == valor)
              {
                  c = c + 1;
              }
          }
          
          
          return c;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	 int c = 0;
    	 
         for (int i = 0; i < arregloCadenas.length; i++)
         {
             String s = arregloCadenas[i];
             
             if (cadena == null ? s == null : cadena.equalsIgnoreCase(s))
            	 
            	 
             {
                 c = c + 1;
             }
         }
         return c;
    }
    

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int n = arregloEnteros.length;

        int cantidad = 0;
        
        for (int i = 0; i < n; i++)
        {
            if (arregloEnteros[i] ==  valor)
            {
                cantidad = cantidad + 1;
            }
        }

        int[] posiciones = new int[cantidad];
        int j = 0;
        
        for (int i = 0; i < n; i++)
        {
            if (arregloEnteros[i] == valor)
            {
                posiciones[j] = i;
                j = j + 1;
            }
        }
        return posiciones;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	  int n = arregloEnteros.length;
    	  
          if (n == 0) return new int[]{};

          
          int min = arregloEnteros[0];
          
          int max = arregloEnteros[0];
          
          for (int i = 1; i < n; i++)
          {
              int v = arregloEnteros[i];
              
              if (v < min) min = v;
              
              if (v > max) max = v;
              
          }
          return new int[]{ min, max  };
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	 HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>( );
    	 
    	 
         for (int i = 0; i < arregloEnteros.length; i++)
        	 
         {
             int v = arregloEnteros[i];
             
             if (mapa.containsKey(v))
            	 
             {
                 int c = mapa.get(v);
                 
                 mapa.put(v, c + 1);
             }
             
             else
            	 
             {
                 mapa.put(v, 1);
             }
         }
         
         return mapa;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    
    public int contarEnterosRepetidos()
    {
    	int n = arregloEnteros.length;
        int rep = 0;

        for (int  i = 0; i < n; i++)
        {
            int v = arregloEnteros[i];

            int primero = -1;
            
            for (int j = 0; j < i; j++)
            	
            {
                if (arregloEnteros[j] == v && primero == -1)
                	
                {
                    primero  = j;
                }
            }

            if (primero != -1)
            {
                boolean yaHuboSegundo = false;
                
                for (int k = primero + 1; k < i; k++)
                	
                {
                    if (arregloEnteros[k] == v)
                    	
                    {
                        yaHuboSegundo  =  true; 
                    }
                }
                
                
                if (!yaHuboSegundo)
                {
                    rep = rep + 1; 
                }
            }
        }
        return rep;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	if (otroArreglo 	 == null) return false;
    	
        if (arregloEnteros.length != otroArreglo.length) return false;

        for (int i = 0;  i < arregloEnteros.length; i++)
        	
        {
            if (arregloEnteros[i] != otroArreglo[i])
            {
                return false;
                
            }
        }
        return true;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	
    	  if (otroArreglo == null) return false;
    	  
    	    if (arregloEnteros.length != otroArreglo.length) return false;

    	    int n = arregloEnteros.length;
    	    
    	    boolean[] usado = new boolean[n]; 
    	    
    	    for (int i = 0; i < n; i++)
    	    	
    	    {
    	        int v = arregloEnteros[i];
    	        
    	        boolean encontre = false;

    	        for (int j = 0; j < n; j++)
    	        {
    	            if (!encontre && !usado[j] && otroArreglo[j] == v)
    	            {
    	            	
    	                usado[j] = true;
    	                
    	                
    	                
    	                encontre = true;
    	            }
    	        }

    	        if (!encontre)
    	        {
    	            return false; 

    	        }
    	    }
    	    return true;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
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
         if (cantidad <= 0)
        	 
         {
             arregloEnteros = new int[]{};
             
             return;
         }

         int rango = (max - min) + 1;
         
         int[] nuevo = new int[cantidad];
         
         for (int i = 0; i < cantidad; i++)
         {
             int v = min + (int)(Math.random( ) * rango);
             
             nuevo[i] = v;
         }
         arregloEnteros = nuevo;
     }

}
