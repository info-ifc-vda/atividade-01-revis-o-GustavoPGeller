public class Termostato extends Dispositivo implements Conectavel, Monitoravel {

    private double temperaturaAtual;
    private double temperaturaAlvo;
    private boolean conectado;

    public Termostato(String id, String local, double tAtual, double tAlvo)
    {
        super(id, local);
        this.temperaturaAtual = tAtual;
        this.temperaturaAlvo = tAlvo;
    }

    @Override
    public void funcionar()
    {
        if (this.ligado)
        {
            System.out.println("Ajustando temperatura para "+temperaturaAlvo+"°C.");
            temperaturaAtual = temperaturaAlvo;
        }

        else
        {
            System.out.println("Termostato desligado!");
        }
    }

    @Override
    public void conectarWifi()
    {
        this.conectado = true;
        System.out.println("Termostato conectado ao Wifi.");
    }

    @Override
    public void desconectarWifi()
    {
        this.conectado = false;
        System.out.println("Termostato desconectado do Wifi.");
    }

    @Override
    public void gerarRelatorio()
    {
        System.out.println("A temperatura atual está em : " + temperaturaAtual + "°C.");
    }
}