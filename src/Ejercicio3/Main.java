package Ejercicio3;
/*
Dado el archivo countrties.txt (revisa el apartado recursos) que contiene países y capitales.
El programa debe leer el archivo y guardar los datos en un HashMap<String, String>.
El programa pide el nombre del usuario/a, y después debe mostrar un país de forma
aleatoria, guardado en HashMap. Se trata de que el usuario debe escribir el nombre
de la capital del país en cuestión. Si acierta se le suma un punto. Esta acción se
repite 10 veces. Una vez solicitadas las capitales de 10 países de forma aleatoria, entonces
debe guardarse en un fichero llamado classificacio.txt, el nombre del usuario y su puntuación.
*/
public class Main {
    public static void main(String[] args) {
        ReadFile accessing = new ReadFile();
        accessing.read();
    }

}
