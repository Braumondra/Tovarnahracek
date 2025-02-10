public class Druce extends Delnik{
    public Druce(String jmeno, Material material, Soucastky soucatsky) {
        super(jmeno, material, soucatsky);
    }
    private final int POCET_PLASTU=20;
    @Override
    public void run() {
        while (true){
            System.out.println("Začína vyrábět ruce "+super.getJmeno());
            while (!super.getMaterial().uberplast(POCET_PLASTU)){
                System.out.println("Čeká na material");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            getSoucatsky().addruce();
            System.out.println("Dokončil ruce");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
