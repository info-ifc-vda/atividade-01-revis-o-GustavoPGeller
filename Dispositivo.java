public abstract class Dispositivo
{
    protected String id;
    protected String localização;
    protected boolean ligado;

    public Dispositivo (String id, String local) 
    {
        this.id = id;
        this.localização = local;
        this.ligado = false;
    }

    public void ligar() 
    {
        System.out.println("Esse dispositivo está ligado!");
        this.ligado = true;
    }

    public void desligar() 
    {
        System.out.println("Esse dispositivo está desligado!");
        this.ligado = false;
    }

    public void exibirStatus() 
    {
        System.out.println("Exibindo o Status do dispositivo:\n");
        System.out.println("Status: "+this.ligado);
        System.out.println("ID: "+this.id);
        System.out.println("Localização: "+this.localização);
    }

    public boolean estaLigado() 
    {
        return this.ligado == true;
    }

    public abstract void funcionar();
}