package templateMethod.task;

public class PremiumComputer extends Computer{
    @Override
    public void addingPowerSupply() {
        System.out.println("850W Power supply installed");
    }

    @Override
    public void addingMotherBoard() {
        System.out.println("ASUS ROG STRIX Z590-E GAMING WIFI installed");
    }

    @Override
    public void addingProcessor() {
        System.out.println("Intel Core i9‑12900K installed");
    }

    @Override
    public void addingGraphicCard() {
        System.out.println("RTX 3090 installed");
    }

    @Override
    public void addingRAM() {
        System.out.println("64GB installed");
    }
}
