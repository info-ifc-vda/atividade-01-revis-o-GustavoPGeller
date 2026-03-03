public class CameraSeguranca extends Dispositivo implements Conectavel, Monitoravel, Atualizavel {

    private boolean gravando;
    private boolean conectada;

    public CameraSeguranca(String id, String local)
    {
        super(id, local);
    }

    @Override
    public void funcionar() 
    {
        if (this.ligado) 
        {
            this.gravando = true;
            System.out.println("A câmera está gravando e monitorando ambiente.");
        } 
        
        else 
        {
            this.gravando = false;
            System.out.println("A câmera está desligada.");
        }
    }

    @Override
    public void conectarWifi()
    {
        this.conectada = true;
        System.out.println("Câmera conectada ao WiFi.");
    }

    @Override
    public void desconectarWifi()
    {
        this.conectada = false;
        System.out.println("Câmera desconectada do WiFi.");
    }

    @Override
    public void gerarRelatorio()
    {
        System.out.println("Status de gravação: " + gravando);
    }

    @Override
    public void atualizarFirmware()
    {
        System.out.println("Firmware da câmera atualizado.");
    }
}