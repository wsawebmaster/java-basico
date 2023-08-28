public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();


        System.out.println("TV ligada: " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("Novo Status - TV ligada: " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.mudarCanal(514);
        System.out.println("Canal alterado: " + smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);
    }
}
