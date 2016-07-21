package ppsi.fasilkom.com.kandros.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import ppsi.fasilkom.com.kandros.R;

public class BerandaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        ImageView logoKandrosBeranda = (ImageView) findViewById(R.id.logoKandrosBeranda);
        int image = R.mipmap.ic_launcher_kandros2;
        String description = "Kandros Logo";
        logoKandrosBeranda.setImageResource(image);
        logoKandrosBeranda.setContentDescription(description);
    }

    public void onViewInputForm(View view) {
        Intent intentInputForm = new Intent(BerandaActivity.this, InputFormActivity.class);
        startActivity(intentInputForm);
    }

    public void onViewStatus(View view) {
        Intent intentStatus = new Intent(this, StatusActivity.class);
        startActivity(intentStatus);
    }
}
