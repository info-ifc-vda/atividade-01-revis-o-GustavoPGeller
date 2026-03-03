public class LampadaInteligente extends Dispositivo implements Conectavel, Agendavel {
    
    private String cor;
    private int intensidade;
    private boolean conectada;

    public LampadaInteligente(String id, String local, String c, int i)
    {
        super(id, local);
        this.cor = c;
        this.intensidade = i;
    }

    @Override
    public void funcionar() 
    {
        if (this.ligado)
        {
            System.out.println("A lâmpada está ligada na cor "+cor+" e intensidade "+intensidade);
        }

        else
        {
            System.out.println("A lâmpada está desligada!");
        }
    }

    @Override
    public void conectarWifi()
    {
        this.conectada = true;
        System.out.println("Lâmpada conectada ao Wifi.");
    }

    @Override
    public void desconectarWifi()
    {
        this.conectada = false;
        System.out.println("Lâmpada desconectada do Wifi.");
    }

    @Override
    public void agendarAtividade(String atividade)
    {
        System.out.println("Atividade agendada: " + atividade);
    }

    @Override
    public void cancelarAgendamento()
    {
        System.out.println("Atividade cancelada!");
    }
}
