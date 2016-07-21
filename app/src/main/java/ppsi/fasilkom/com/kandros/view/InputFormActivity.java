package ppsi.fasilkom.com.kandros.view;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

import ppsi.fasilkom.com.kandros.R;
import ppsi.fasilkom.com.kandros.helper.HelperDB;

public class InputFormActivity extends AppCompatActivity {
    //declare komponen view
    private TextView tvNoBooking, tvjadwalKeberangkatan;
    private EditText etKeperluan, etLokasiTujuan, etJumlahPenumpang;
    private CheckBox cbBus, cbMobil;
    private Button btnSimpan;
    private HelperDB dbKandros;

    private DatePicker datePicker;
    private Calendar calendar;
    private TextView tanggalView;
    private int tanggal, bulan, tahun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_form);

        //set komponen form input
        tvNoBooking = (TextView) findViewById(R.id.lblNoBooking);
        etKeperluan = (EditText) findViewById(R.id.txtKeperluan);
        tvjadwalKeberangkatan = (TextView) findViewById(R.id.lblTanggalKeberangkatan);
        etLokasiTujuan = (EditText) findViewById(R.id.txtLokasiTujuan);
        etJumlahPenumpang = (EditText) findViewById(R.id.txtKapasitas);
        btnSimpan = (Button) findViewById(R.id.btnSimpanBooking);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Data berhasil disimpan.", Toast.LENGTH_LONG).show();
                finish();
                setContentView(R.layout.activity_beranda);
                //finish();

               /*long resultInsert = dbKandros.insertBooking(
                       tvNoBooking.getText().toString(),
                       etKeperluan.getText().toString(),
                       tvjadwalKeberangkatan.getText().toString(),
                       etLokasiTujuan.getText().toString(),
                       etJumlahPenumpang.getText(),
                       etJumlahPenumpang.getText(),
                       etJumlahPenumpang.getText(),
                       etJumlahPenumpang.getText()
               );*/
            }
        });

        tanggalView = (TextView) findViewById(R.id.lblTanggalKeberangkatan);
        calendar = Calendar.getInstance();

        tanggal = calendar.get(Calendar.DAY_OF_MONTH);
        bulan = calendar.get(Calendar.MONTH);
        tahun = calendar.get(Calendar.YEAR);
        tampilTanggal(tanggal, bulan + 1, tahun);

        //set insert data

    }

    @Override
    protected Dialog onCreateDialog(int id) {
        if (id == 999) {
            return new DatePickerDialog(this, myDateListener, tanggal, bulan, tahun);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
            tampilTanggal(arg3, arg2+1, arg1);
        }
    };

    public void setTanggal(View view) {
        showDialog(999);
        //Toast.makeText(getApplicationContext(), "tanggal", Toast.LENGTH_LONG).show();
    }

    private void tampilTanggal(int tanggal, int bulan, int tahun) {
        tanggalView.setText(new StringBuilder().append(tanggal).append("-").append(bulan).append("-").append(tahun));
    }

    public void onSaveBooking(View view) {
        Intent intentBooking = new Intent(this, BookingActivity.class);

        startActivity(intentBooking);
    }
}
