import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {

        List<Dispositivo> dispositivos = new ArrayList<>();

        Dispositivo lampada = new LampadaInteligente("Lampada Sala", "Sala", "Branco", 80);
        Dispositivo termostato = new Termostato("Termostato Quarto", "Quarto", 24.0, 18.0);
        Dispositivo camera = new CameraSeguranca("Câmera Garagem", "Garagem");
        Dispositivo fechadura = new Fechadura("Fechadura Porta Principal", "Porta Principal");

        dispositivos.add(lampada);
        dispositivos.add(termostato);
        dispositivos.add(camera);
        dispositivos.add(fechadura);

        for (Dispositivo d : dispositivos)
        {
            d.ligar();
            d.funcionar();
            d.exibirStatus();
            System.out.println("--------------------------------------------");
        }
    }
}