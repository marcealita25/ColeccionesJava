
import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class EmpezandoConFicheros {
    public static void main(String[] args) {
       
        
        
        File directorio1  = new File("C:\\Users\\Tardes\\Ejercicioficheros\\imagenes\\");
        directorio1.mkdir();
                 File directorioImagenes = new File ("imagenes");

        File directorioDocumentos  = new File ("documentos");
        File directorioOtros      = new File ("otros");

        directorioImagenes.mkdir();
        directorioDocumentos.mkdir(); 
        directorioOtros.mkdir();

            Scanner scanner = new Scanner(System.in);
            String [] Filanames = new String[5];

        System.out.println("Introduce 5 nombres de archivo con su extension");

         for (int i = 0; i < 10; i++) {
            String nombreArchivo = scanner.nextLine();
            
            File archivo = new File(nombreArchivo);

            if (! archivo.exists()){
                try {
                    archivo.createNewFile();
                } catch (IOException e) {
                    System.out.println("Error al ");
                }



            }
         }
        



        
        

    } 

    
    

    
}

/*PRIMERO CREAR 3 DIRECTORIOS,
imagenes,documentos,otros.
PREGUNTAR POR 5 NOMBRES DE Ficheros,si el fichero tienes una excepcion de una imagen JPG,GIF, guarda en la carpeta de imagenes.
si el fichero es un txt en documentos y sino es una imagen ni un documento lo ponemos en otros.
coger todos los ficheros que hay en otros y reenombrarlos con vuestro nombre y un contador manteniendo la extension que tiene el fichero.*/
