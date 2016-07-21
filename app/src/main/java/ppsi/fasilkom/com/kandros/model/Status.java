package ppsi.fasilkom.com.kandros.model;

/**
 * Created by Ainul on 5/8/2016.
 */
public class Status {
    private String namaStatus;
    private String keterangan;

    //status dalam array
    public static final Status[] kendaraans = {
            new Status("pengajuan", "Booking masih dalam proses pengajuan")
    };

    public Status(String namaStatus, String keterangan) {
        this.namaStatus = namaStatus;
        this.keterangan = keterangan;
    }

    public String getNamaStatus() {
        return namaStatus;
    }

    public String getKeterangan() {
        return keterangan;
    }

    @Override
    public String toString() {
        return this.namaStatus;
    }
}
