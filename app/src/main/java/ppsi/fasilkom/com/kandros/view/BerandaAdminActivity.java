package ppsi.fasilkom.com.kandros.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import ppsi.fasilkom.com.kandros.R;

public class BerandaAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda_admin);

        ImageView logoKandrosBeranda = (ImageView) findViewById(R.id.logoKandrosBeranda);
        int image = R.mipmap.ic_launcher_kandros2;
        String description = "Kandros Logo";
        logoKandrosBeranda.setImageResource(image);
        logoKandrosBeranda.setContentDescription(description);
    }

    public void onViewTransaksiBooking(View view) {
        Intent intentTransaksiBooking = new Intent(this, BookingAdminActivity.class);
        startActivity(intentTransaksiBooking);
    }

    public void onViewKendaraan(View view) {
        Intent intentMasterKendaraan = new Intent(this, KendaraanAdminActivity.class);
        startActivity(intentMasterKendaraan);
    }

    public void onViewLaporanAdmin(View view) {
        Intent intentLaporanAdmin = new Intent(this, LaporanBookingAdminActivity.class);
        startActivity(intentLaporanAdmin);
    }
}
