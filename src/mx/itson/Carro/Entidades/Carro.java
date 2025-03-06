package mx.itson.Carro.Entidades;
import java.util.Scanner;

        /**
 ⣿⣿⡆⠹⣿⣧⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣷⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢣⣿⡟⣰⡿⠟⣩⣴⣾⣿⣿
⣿⣿⣿⡄⠀⣹⣇⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⡇⠦⠙⢿⣿⣿⣿⣿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⢸⣿⠃⢋⣴⡿⢛⣩⣴⣶⣶
⣿⣿⣿⣿⡄⠘⣿⡄⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣶⣶⣶⣶⣶⣶⣤⣌⡙⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢿⣿⡀⡾⢋⣴⣿⣿⣿⣿⡿
⣿⣿⣿⣿⣿⡄⢻⣿⡀⠀⠀⠀⠀⣨⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣙⢻⣿⣿⣿⣿⣿⣿⡷⠸⠿⢃⣁⣛⣭⣭⣥⣶⣶⣶
⣿⣿⣿⣿⣿⣿⡄⢻⣇⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡈⠛⣛⣩⣥⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣛⣛⣛⣛⣛⣛⡛⠀⠉⡰⠃⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⡏⡔⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠛⠛⠉⠉⠀
⣿⣿⣿⣿⢋⣴⡿⢸⠁⠀⠀⣴⢸⣿⢻⡟⢩⣭⡉⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀
⡿⢛⣩⣿⠿⠏⠀⣿⠀⠀⠀⣿⢸⡿⢸⠀⠈⠉⠁⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣶
⣥⣭⣥⣶⣶⣿⠃⣿⠀⠀⠀⠈⣼⣇⣼⣧⣀⣈⣀⣠⠿⣹⣿⣿⣿⠿⠟⠛⠛⠛⠛⠛⢻⣿⣿⠀⠀⠀⠀⠀⠀⠀⢀⣠⣶⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⡇⢿⣆⠀⠀⢠⣿⣿⣿⣿⣿⣿⡿⢁⣾⣿⠟⣫⣴⣾⡟⠀⠀⠀⠀⠀⣼⣿⣿⠀⠀⠀⠀⢀⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⠘⣿⣷⣦⣾⣿⣿⣿⣿⣿⣿⣧⣾⠟⠡⠾⠿⠟⠋⢀⣀⡀⠀⠀⣼⣿⣿⣿⣤⣀⠀⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣷⡙⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⢀⣴⣿⡿⠋⣠⣾⣿⣿⣿⣿⣿⣿⣷⣦⡙⠻⠟⠛⠛⢋⣉⣭⣴⣾⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣷⡘⢿⣧⠉⠉⣹⣿⣿⣿⣷⣦⣤⣀⣀⣀⣈⣭⣤⣶⣿⡿⠟⠃⠹⣿⣿⣿⣿⣿⣿⣿⣦⣀⠺⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣌⠻⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣫⠴⢊⣴⡆⢻⣿⡟⣿⣿⣿⣿⣿⣿⣷⡌⢿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣮⣝⣛⠿⠿⢿⣿⣿⣿⢿⡛⠛⠩⠥⢒⣋⣥⣾⣿⣿⣿⠈⢿⣧⠈⠻⣿⣿⣿⣿⣿⣿⣦⡹⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠰⡶⣶⣤⣶⣶⣶⣶⣿⣿⣿⣿⣿⣿⣿⠟⣱⡈⢻⣆⠙⣮⡛⢿⣿⣿⣿⣿⣷⡈⢻⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣶⢹⣦⣝⡻⢿⣿⣿⣿⣿⣿⣿⡿⢟⣡⣾⣿⣷⡄⢿⣆⢈⠻⣶⣬⣝⠿⣿⣿⣷⡌⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣿⣿⣿⣿⣿⣷⣶⣿⣿⣿⣿⣧⣶⣿⣿⣿⣿⣿⣿⣦⠙⠘⣷⣌⠻⣿⣷⣬⡻⣿⣷⡈⣱
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⢻⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣿⣿⣷⣄⣿⣿⣷⣦⣙⠻⣿⣎⢻⣷⠹
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢟⣵⣿⡘⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡙⠣⣹⡇
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣡⣾⣿⣿⣧⠀⢿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿⣿⣿⣿⡟⣿⣿⣿⣿⣿⣧⠀⣌⢻
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣱⣾⣿⣿⣿⣿⣿⣧⠈⠛⢿⣿⣿⣿⠸⣿⣿⣿⣿⣿⣿⣿⣿⡿⢸⣿⣿⡿⣋⣴⣿⣿⣿⣿⣿⣿⣤⢹⣦
⣿⣿⣿⣿⣿⣿⣿⣿⣟⣵⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⢢⡀⠈⣻⣿⡇⣿⣿⣿⣿⣿⣿⣿⡿⠃⣾⠟⣩⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⢹⣶⣌⠛⠇⣿⣿⣿⣿⣿⣿⡿⠁⠘⣡⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿
 * @author botel
 */
public class Carro {

    /**
     * @return the kilometraje
     */
    public double getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    private String color;
    private int año;
    private String marca;
    private double kilometraje;
    Scanner scanner = new Scanner(System.in);
    /**
     * calcula el tiempo que tarde un carro en recorrer cierta distancia
     * @param distancia establece la distancia que va a recorrer
     * @param velocidad establece la velocidad a la que viaja
     * @return regresa el tiempo en que viajo esa distancia
     * 
     */
    public double calcularTiempo(double distancia, double velocidad){
       this.kilometraje += distancia;
        double tiempo=distancia/velocidad;
       return tiempo;
    }
    
}
