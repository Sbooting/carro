package mx.itson.Carro.Entidades;
import java.util.Scanner;
import mx.itson.Carro.enums.TipoMotor;
import mx.itson.Carro.enums.TipoTransmision;

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
     * @return the consecionario
     */
    public Consecionario getConsecionario() {
        return consecionario;
    }

    /**
     * @param consecionario the consecionario to set
     */
    public void setConsecionario(Consecionario consecionario) {
        this.consecionario = consecionario;
    }

    /**
     * @return the propietario
     */
    public Propietario getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    /**
     * @return the tipoTransmision
     */
    public TipoTransmision getTipoTransmision() {
        return tipoTransmision;
    }

    /**
     * @param tipoTransmision the tipoTransmision to set
     */
    public void setTipoTransmision(TipoTransmision tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    /**
     * @return the tipoMotor
     */
    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    /**
     * @param tipoMotor the tipoMotor to set
     */
    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

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
    private TipoMotor tipoMotor;
    private TipoTransmision tipoTransmision;
    private Propietario propietario;
    private Consecionario consecionario;
    
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
