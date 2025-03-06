/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.Carro.Interfaz;
import java.util.Scanner;
import mx.itson.Carro.Entidades.Carro;
import mx.itson.Carro.enums.TipoMotor;
import mx.itson.Carro.enums.TipoTransmision;

/**
 ⡟⢩⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⢹⣿⣿⣿⣿⣿
⡇⢠⠠⡻⣿⣿⣿⣿⣿⣿⠿⠋⣉⣉⣙⠫⣻⣿⣿⣿⣿⣿⣿⡟⠁⡄⠘⣿⣿⣿⣿⣿
⡇⢈⠖⢮⡈⣻⣿⣿⣿⠃⠰⠛⢛⠻⢿⣿⣆⠪⢿⣿⣿⣿⠋⢠⡟⣰⠀⣿⣿⣿⣿⣿
⡇⢘⡄⠐⢝⢦⡪⡻⠇⠀⣴⣾⣷⠌⠂⢻⣿⡀⢸⡿⠋⣠⠤⠋⢰⡇⠀⣿⣿⣿⣿⣿
⣟⠘⣧⠄⠀⡙⢵⠔⠀⣸⠿⣿⢋⣢⠀⣾⣿⠆⡠⢠⡞⠁⠀⠀⡙⠄⢸⣿⣿⣿⣿⣿
⣿⡀⠻⠀⠀⠀⠘⣿⣇⢿⣮⢢⡾⢫⣾⣿⠉⢴⢧⠏⠀⠀⠀⣼⣿⠢⠿⠛⠋⠉⠀⣼
⣿⣷⣌⢿⣷⣦⣄⠸⣿⣿⡏⡾⢱⡿⢃⡄⣾⡆⡞⠀⠂⣀⣴⡆⢁⠚⣩⣴⠏⢠⣾⣿
⣿⣿⣿⣶⣍⠻⣿⣷⢹⣻⣷⠃⠹⣱⡿⢱⣿⢡⣇⣴⡾⢛⣭⡖⣰⣿⣻⡍⢠⣿⣿⣿
⣿⣿⣿⣿⣿⡿⡂⠽⣿⣿⠿⣷⣄⣽⣿⣿⣿⣿⠟⢉⠸⣿⠟⣰⣿⣳⡟⢀⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣷⡞⢫⠀⠗⢹⣿⣿⡇⠰⠆⠉⢡⣶⡔⡞⢰⣿⣳⣟⠃⣼⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⡝⢧⣤⣼⠿⣿⣧⣤⠴⠁⠹⣟⣿⢧⡙⢯⣿⡍⢸⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢨⣭⣓⣊⣭⡄⠀⠔⠁⠻⠽⣿⣻⡌⠟⣻⡄⢿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⣿⡛⠛⡛⣿⣧⠀⣤⣾⣶⡄⠀⣬⡇⣼⣟⣿⡄⠻⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⡇⢹⡙⣓⣂⣴⡌⣿⡇⢸⣿⣿⣿⡆⠉⠀⢿⡾⡽⠁⣤⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⡄⢻⣬⣈⠛⢉⣠⣿⡇⣼⣿⣿⡿⠁⡰⢠⣶⠀⣡⣴⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⢈⣼⣿⣿⢸⡇⣾⣿⡇⠘⢻⣍⠀⣈⡑⠿⣿⡷⠌⣻⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⠇⣼⡇⣿⣿⡄⢳⣿⣿⢱⡇⠘⣴⠃⣩⣭⣥⣀⣁⣴⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⠐⡇⠁⠉⢻⡇⢸⡟⠋⠈⡥⢠⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⠋⠀⠳⣶⠸⠿⠃⠸⠷⢂⡶⠃⠘⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣷⣶⣴⣴⣀⣀⣴⣶⣀⣀⣠⣤⣤⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
 * @author botel
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingresa la distancia a recorrer en carro ");
        double distancia = sc.nextDouble();
        System.out.println("ingrese la velocidad a la que viaja el carro ");
        double velocidad = sc.nextDouble();
       
        Carro bmw = new Carro();
        bmw.setMarca("BMW");
        bmw.setColor("negro");
        bmw.setAño(2021);
        bmw.setKilometraje(200.12);
        bmw.setTipoMotor(TipoMotor.HIBRIDO);
        bmw.setTipoTransmision(TipoTransmision.AUTOMATICA);
        double tiempo = bmw.calcularTiempo(distancia, velocidad);
        
        System.out.println("el tiempo que le tomaraa al carro " + bmw.getMarca() + 
                " color " + bmw.getColor() + 
                " del año " + bmw.getAño() + 
                " es de " + tiempo + 
                " luego del recorrido, su kilometraje sera de " + bmw.getKilometraje());
    }
}