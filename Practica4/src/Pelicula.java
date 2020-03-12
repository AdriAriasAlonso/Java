import java.util.ArrayList;
import java.util.Scanner;

public class Pelicula {
    private int id;
    private String titulo;
    private String director;
    private int duracion;
    private String genero;
    private int año;
    private boolean disponibilidad;
    private int copiastotal;
    private int copiasreservadas;
    static int ncopias;

    public Pelicula(int id, String titulo, String director, int duracion, String genero, int año, boolean disponibilidad, int copiastotal, int copiasreservadas) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.año = año;
        this.disponibilidad = disponibilidad;
        this.copiastotal = copiastotal;
        this.copiasreservadas = copiasreservadas;
    }

    public Pelicula() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isDisponibilidad() {
        int totales=this.getCopiastotal();
        int reservadas=this.getCopiasreservadas();
        if (totales==reservadas){
            return false;
        }
        else{
            return true;
        }
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getCopiastotal() {
        return copiastotal;
    }

    public void setCopiastotal(int copiastotal) {
        this.copiastotal = copiastotal;
    }

    public int getCopiasreservadas() {
        return copiasreservadas;
    }

    public void setCopiasreservadas(int copiasreservadas) {
        this.copiasreservadas = copiasreservadas;
    }
    
    public void añadirPelicula(ArrayList<Pelicula> listaPeliculas, int ncopias){
        /*Se encargará de realizar el alta de una película,se solicitará la 
        información necesaria para dar de alta por primera vez la película. 
        Además, hay que tener en cuenta que el videoclub, sólo podrá almacenar 
        en total 3000 copias de películas, por 
        tanto, si se quiere añadir alguna copia más, mostrará un mensaje de 
        error “el videoclub no puede almacenar más copias”, y no permitirá 
        añadir la película. Por último, a cada nuevo título se le asignará 
        un id secuencial que empezará en 1, y que será único para cada 
        título, y lógicamente al dar de alta la película no habrá ninguna
        película reservada.*/
        Scanner lector=new Scanner(System.in);
        if (ncopias>=3000){
            System.out.println("El videoclub no puede almacenar mas copias.");
        }
        else {
            String titulo="";
            String director="";
            int duracion=0;
            int añoest=0;
            String genero="";
            int copiaspelicula=0;
            int auxcopias=0;
            
            Pelicula peli=new Pelicula(id, titulo, director, duracion, genero, 
                    año, disponibilidad, copiastotal, copiasreservadas);
            
            System.out.println("¿Cuantas copias quieres introducir? ");
            auxcopias=Integer.parseInt(lector.nextLine());
            if (this.ncopias+auxcopias>=3000) {
                System.out.println("Numero de copias imposible de almacenar. Máximo 3000. ");
            }else{
                copiaspelicula=auxcopias;
                System.out.println("Introduce el título de la pelicula: ");
                titulo=lector.nextLine();
                System.out.println("Introduce el genero de la pelicula: ");
                genero=lector.nextLine();
                System.out.println("Introduce el director: ");
                director=lector.nextLine();
                System.out.println("Introduce la duración en minutos: ");
                duracion=Integer.parseInt(lector.nextLine());
                System.out.println("Introduce el año de estreno: ");
                añoest=Integer.parseInt(lector.nextLine());

                peli.setCopiastotal(copiaspelicula);
                peli.setTitulo(titulo);
                peli.setGenero(genero);
                peli.setDirector(director);
                peli.setDuracion(duracion);
                peli.setAño(añoest);
                peli.setDisponibilidad(true);
                peli.setCopiasreservadas(0);
                peli.ponerID(listaPeliculas);

                this.ncopias=this.ncopias+copiaspelicula;
                listaPeliculas.add(peli);
            }
        }
    }
    public void listarPeliculas(ArrayList<Pelicula> listaPeliculas){
        //Metodo para mostrar todos los atributos de los objetos del array de 
        //peliculas.
        for (int i=0;i<listaPeliculas.size();i++){
            System.out.println("ID: " + listaPeliculas.get(i).getId());
            System.out.println(" Titulo: " + listaPeliculas.get(i).getTitulo());
            System.out.println(" Director: " + listaPeliculas.get(i).getDirector());
            System.out.println(" Genero: " + listaPeliculas.get(i).getGenero()); 
            System.out.println(" Duración en minutos: " + listaPeliculas.get(i).getDuracion());
            if (listaPeliculas.get(i).isDisponibilidad()==true){
                System.out.println(" Estado: Película disponible.");
            }
            else{
                System.out.println(" Estado: Película no disponible.");
            }
        }
    }
    public void reservarPelicula(ArrayList<Pelicula> listaPeliculas){
        Scanner lector=new Scanner(System.in);
        listarPeliculas(listaPeliculas); //Llamamos al metodo listarPeliculas
        System.out.println("Introduce el ID de la película que quieras reservar: ");
        int idbuscado=Integer.parseInt(lector.nextLine());
        for (int i=0;i<listaPeliculas.size();i++){ //adaptarlo a while
            /*Si no hay películas disponibles, es decir, disponible =falso, 
            mostraremos un mensaje de aviso que no está disponible la película.
            Si hay disponibles, enviaremos un mensaje informativo de que ha sido 
            reservada, y actualizaremos la cantidad de copias reservadas, y si 
            estas fueran igual a la cantidad de copias total, actualizaremos 
            disponible a falso. Si introducimos un número que no se corresponde 
            con ningún id, mostrará un mensaje informando que el número 
            introducido no es correcto.*/
            if (listaPeliculas.get(i).getId()==idbuscado){ //Busca la película por ID
                if (listaPeliculas.get(i).isDisponibilidad()==true){
                    //Comprobación de disponibilidad
                    listaPeliculas.get(i).setCopiasreservadas(listaPeliculas.get(i).getCopiasreservadas()+1);
                    System.out.println("La película se ha reservado con éxito.");
                    
                }
                else{
                    System.out.println("La película no está disponible.");
                }
            }
        }
    }
    public void buscarPelicula(ArrayList<Pelicula> listaPeliculas){
        /*Recibirá como parámetro una lista de películas, y preguntará al usuario 
        qué tipo de búsqueda quiere realizar (por id, título, etc). Además, esta 
        búsqueda mostrará todos aquellos títulos que incluyan el texto de búsqueda 
        (parte o completamente), y si fuera el caso de no encontrar ninguna película 
        que cumpla con los criterios de búsqueda, mostrará un mensaje informando 
        que no ha encontrado nada.*/
        Scanner lector=new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("¿Que tipo de busqueda quieres realizar?");
        System.out.println("1.- Por ID");
        System.out.println("2.- Por titulo");
        System.out.println("3.- Por genero");
        System.out.println("4.- Por director");
        System.out.println("5.- Por año");
        System.out.println("=======================================");
        int opcion= Integer.parseInt(lector.nextLine());
        switch(opcion){
            case 1:
                System.out.println("==Busqueda por ID==");
                System.out.println("Introduce el ID de la pelicula que quieres buscar: ");
                int busquedaid=Integer.parseInt(lector.nextLine());
                for (int i=0;i<listaPeliculas.size();i++){
                    if (listaPeliculas.get(i).getId()==busquedaid){
                        System.out.println(listaPeliculas.get(i).getTitulo());
                    }
                }
            case 2:
                System.out.println("==Busqueda por titulo==");
                System.out.println("Introduce el titulo de la pelicula que quieres buscar: ");
                String busquedatitulo=lector.nextLine();
                for (int i=0;i<listaPeliculas.size();i++){
                    if (listaPeliculas.get(i).getTitulo().contains(busquedatitulo)){
                        System.out.println(listaPeliculas.get(i).getTitulo());
                    }
                }
            case 3:
                System.out.println("==Busqueda por genero==");
                System.out.println("Introduce el genero de la pelicula que quieres buscar: ");
                String busquedagenero=lector.nextLine();
                System.out.println("=======================");
                for (int i=0;i<listaPeliculas.size();i++){
                    if (listaPeliculas.get(i).getTitulo().contains(busquedagenero)){
                        System.out.println("Título " + listaPeliculas.get(i).getTitulo());
                        System.out.println("Genero " + listaPeliculas.get(i).getGenero());
                    }
                }
            case 4:
                System.out.println("==Busqueda por director==");
                System.out.println("Introduce el director de la pelicula que quieres buscar: ");
                String busquedadirector=lector.nextLine();
                for (int i=0;i<listaPeliculas.size();i++){
                    if (listaPeliculas.get(i).getTitulo().contains(busquedadirector)){
                        System.out.println("Título " + listaPeliculas.get(i).getTitulo());
                        System.out.println("Director " + listaPeliculas.get(i).getDirector());
                    }
                }
            case 5:
                System.out.println("==Busqueda por año==");
                System.out.println("Introduce el año de la pelicula que quieres buscar: ");
                int busquedaaño=Integer.parseInt(lector.nextLine());
                for (int i=0;i<listaPeliculas.size();i++){
                    if (listaPeliculas.get(i).getAño()==busquedaaño){
                        System.out.println("Título " + listaPeliculas.get(i).getTitulo());
                        System.out.println("Año " + listaPeliculas.get(i).getAño());
                    }
                }
        }
    }
    public void ponerID(ArrayList<Pelicula> listaPeliculas){
        this.id=listaPeliculas.size()+1;
    }
}
