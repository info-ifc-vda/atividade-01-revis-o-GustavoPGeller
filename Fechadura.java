public class Fechadura extends Dispositivo implements Conectavel {
    
    private boolean conectada;

    public Fechadura(String id, String local)
    {
        super(id, local);
    }

    @Override
    public void funcionar()
    {
        if(this.ligado)
        {
            System.out.println("Fechadura está trancada.");
        }

        else
        {
            System.out.println("Fechadura está trancada.");
        }
    }

    @Override
    public void conectarWifi()
    {
        this.conectada = true;
        System.out.println("Fechadura está conectada ao Wifi.");
    }

    @Override
    public void desconectarWifi()
    {
        this.conectada = false;
        System.out.println("Fechadura desconectada do Wifi.");
    }
}
