package ppsi.fasilkom.com.kandros.model;

/**
 * Created by Ainul on 5/8/2016.
 */
public class Mahasiswa extends Users {
    private String nama;
    private int nim;
    private String alamat;
    private String noTelp;
    private String email;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() { return nim; }

    public void setNim(int nim) { this.nim = nim; }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
