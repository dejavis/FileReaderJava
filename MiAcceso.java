import java.io.FileReader;
import java.io.IOException;

public class MiAcceso{
	public static void main(String[] args){
	Leer_Fichero lf = new Leer_Fichero();
	lf.leer();
	}
}
class Leer_Fichero{
	public void leer(){
		try{
		//CARBIAR LA RUTA Y EL TITULO DEL ARCHIVO POR LOS PROPIOS
		FileReader entrada = new FileReader("C:\\Users\\UserHero\\Desktop\\PROECLIPSE\\MiArchivo.txt");
		int c = entrada.read();
			while(c!=-1){
			c=entrada.read();
			char letra = (char)c;
			System.out.print(letra);
			}
		}catch(IOException e){
		System.out.println("Archivo no encontrado");
		}
	}
}