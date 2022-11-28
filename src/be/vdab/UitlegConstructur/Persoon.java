public class Persoon {
    private String voornaam;
    private String familienaam;
    private String land;

    public Persoon(String voornaam, String familienaam, String land) {
        this.voornaam=voornaam;
        this.familienaam=familienaam;
        this.land=land;
    }
    public Persoon(String voornaam, String familienaam) {
        this(voornaam, familienaam, "België");
    }

    public void toon() {
        System.out.println(voornaam);
        System.out.println(familienaam);
        System.out.println(land);
    }


}
