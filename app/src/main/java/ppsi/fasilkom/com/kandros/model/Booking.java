package ppsi.fasilkom.com.kandros.model;

import java.util.Date;

/**
 * Created by Ainul on 5/8/2016.
 */
public class Booking {
    private String noBooking;
    private String keperluan;
    private String lokasiTujuan;
    private String jadwalKeberangkatan;
    private int jumlahPenumpang;
    private String user;
    private String status;
    private String kendaraan;

    //boking dalam array
    public static final Booking[] bookings = {
            new Booking("B001", "Study Tour Prodi SI", "Bandung", "2016-06-03", 50, "ika", "pengajuan", "Maxibus")
    };

    public Booking(String noBooking, String keperluan, String lokasiTujuan, String jadwalKeberangkatan, int jumlahPenumpang, String user, String status, String kendaraan) {
        this.noBooking = noBooking;
        this.keperluan = keperluan;
        this.lokasiTujuan = lokasiTujuan;
        this.jadwalKeberangkatan = jadwalKeberangkatan;
        this.jumlahPenumpang = jumlahPenumpang;
        this.user = user;
        this.status = status;
        this.kendaraan = kendaraan;
    }

    public String getNoBooking() {
        return noBooking;
    }

    public String getKeperluan() {
        return keperluan;
    }

    public String getLokasiTujuan() {
        return lokasiTujuan;
    }

    public String getJadwalKeberangkatan() {
        return jadwalKeberangkatan;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public String getUser() {
        return user;
    }

    public String getStatus() {
        return status;
    }

    public String getKendaraan() {
        return kendaraan;
    }

    @Override
    public String toString() {
        return this.noBooking;
    }
}
