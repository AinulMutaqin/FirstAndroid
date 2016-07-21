package ppsi.fasilkom.com.kandros.model;

/**
 * Created by Ainul on 5/8/2016.
 */
public class Kendaraan {
    private String namaKendaraan;
    private int jumlahPenumpang;
    private String jenisKendaraan;
    private String noPolisi;
    private String namaSupir;

    //kendaraan dalam array
    public static final Kendaraan[] kendaraans = {
            new Kendaraan("Maxibus", 50, "Bus", "B 4628 BS", "Roby")
    };

    public Kendaraan(String namaKendaraan, int jumlahPenumpang, String jenisKendaraan, String noPolisi, String namaSupir) {
        this.namaKendaraan = namaKendaraan;
        this.jumlahPenumpang = jumlahPenumpang;
        this.jenisKendaraan = jenisKendaraan;
        this.noPolisi = noPolisi;
        this.namaSupir = namaSupir;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public String getNoPolisi() {
        return noPolisi;
    }

    public String getNamaSupir() {
        return namaSupir;
    }

    @Override
    public String toString() {
        return this.noPolisi;
    }
}
