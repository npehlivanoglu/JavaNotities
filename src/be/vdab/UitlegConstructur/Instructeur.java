public class Instructeur extends Persoon {
    private int wedde;
    public Instructeur(String voornaam, String familienaam, String land, int wedde) {
        super(voornaam, familienaam, land);
        this.wedde=wedde;
    }
}
