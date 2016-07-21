package ppsi.fasilkom.com.kandros.view;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import ppsi.fasilkom.com.kandros.R;
import ppsi.fasilkom.com.kandros.helper.HelperDB;
import ppsi.fasilkom.com.kandros.model.Booking;

public class BookingActivity extends AppCompatActivity {
    public static final String EXTRA_BOOKINGNO = "bookingNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        int bookingNo = (Integer) getIntent().getExtras().get(EXTRA_BOOKINGNO);

        //buat cursor
        try {
            SQLiteOpenHelper kandrosDatabaseHelper = new HelperDB(this);
            SQLiteDatabase db = kandrosDatabaseHelper.getReadableDatabase();
            Cursor cursor = db.query("booking",
                            new String[] {"username", "password", "userType"},
                            "idUser = ?",
                            new String[] {Integer.toString(bookingNo)},
                            null, null,null);
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Database tidak tersedia", Toast.LENGTH_SHORT);
            toast.show();
            finish();
        }
        //select booking
    }

}
