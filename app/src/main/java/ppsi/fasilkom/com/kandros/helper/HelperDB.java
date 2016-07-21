package ppsi.fasilkom.com.kandros.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ainul on 5/8/2016.
 */
public class HelperDB extends SQLiteOpenHelper {
    private static final String DB_NAME = "kandros.db";
    private static final int DB_VERSION = 1;

    public HelperDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TableUser.SQL_CREATE_TABLE_USER);
        db.execSQL(TableBooking.SQL_CREATE_TABLE_BOOKING);
        db.execSQL(TableStatus.SQL_CREATE_TABLE_STATUS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Version 1.0, Do Nothing
    }

    public static class TableUser {
        public static final String TABLE_NAME_USER = "users";
        public static final String COLUMN_IDUSER = "idUser";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_PASSWORD = "password";
        public static final String COLUMN_USERTYPE = "userType";

        private static final String SQL_CREATE_TABLE_USER = "CREATE TABLE " + TABLE_NAME_USER + " (" +
                COLUMN_IDUSER + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_USERNAME + " TEXT NOT NULL, " +
                COLUMN_PASSWORD + " TEXT NOT NULL, " +
                COLUMN_USERTYPE + " TEXT NOT NULL" +
                ")";
    }

    public static class TableBooking {
        public static final String TABLE_NAME_BOOKING = "booking";
        public static final String COLUMN_IDBOOKING = "idBooking";
        public static final String COLUMN_NOBOOKING = "noBooking";
        public static final String COLUMN_KEPERLUAN = "keperluan";
        public static final String COLUMN_JADWAL_KEBERANGKATAN = " jadwalKeberangkatan";
        public static final String COLUMN_LOKASI_TUJUAN = " lokasiTujuan";
        public static final String COLUMN_JUMLAH_PENUMPANG = "jumlahPenumpang";
        public static final String COLUMN_IDUSER = "idUser";
        public static final String COLUMN_IDSTATUS = "idStatus";
        public static final String COLUMN_IDKENDARAAN = "idKendaraan";

        private static final String SQL_CREATE_TABLE_BOOKING = "CREATE TABLE " + TABLE_NAME_BOOKING +
                COLUMN_IDBOOKING + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NOBOOKING + " TEXT NOT NULL, " +
                COLUMN_KEPERLUAN + " TEXT NOT NULL, " +
                COLUMN_JADWAL_KEBERANGKATAN + " TEXT NOT NULL, " +
                COLUMN_LOKASI_TUJUAN + " TEXT NOT NULL" +
                COLUMN_JUMLAH_PENUMPANG + " INTEGER NOT NULL" +
                COLUMN_IDUSER + " INTEGER NOT NULL" +
                COLUMN_IDSTATUS + " INTEGER NOT NULL" +
                COLUMN_IDKENDARAAN + " INTEGER NOT NULL" +
                ")";
    }

    public long insertBooking(String noBooking, String keperluan, String jadwal, String lokasi,
                              int jumlahPenumpang, String user, String status, String kendaraan) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues(); //memudahkan mengambil data
        cv.put("noBooking", noBooking);
        cv.put("keperluan", keperluan);
        cv.put("jadwalKeberangkatan", jadwal);
        cv.put("lokasiTujuan", lokasi);
        cv.put("jumlahPenumpang", jumlahPenumpang);
        cv.put("user", user);
        cv.put("status", status);
        cv.put("kendaraan", kendaraan);
        long hasil = db.insert("booking", null, cv);
        return hasil;
    }

    public static class TableStatus {
        public static final String TABLE_NAME_STATUS = "status";
        public static final String COLUMN_IDSTATUS = "idStatus";
        public static final String COLUMN_NAMA_STATUS = "namaStatus";
        public static final String COLUMN_KETERANGAN = "keterangan";

        private static final String SQL_CREATE_TABLE_STATUS = "CREATE TABLE " + TABLE_NAME_STATUS + " (" +
                COLUMN_IDSTATUS + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAMA_STATUS + " TEXT NOT NULL, " +
                COLUMN_KETERANGAN + " TEXT NOT NULL, " +
                ")";
        }

    public boolean validateLogin(String user, String pass) {
        boolean result = false;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cur = db.rawQuery(
                "select * from users where username = '"+user+"'" +
                        " and password = '"+pass+"'", null);
        if((cur != null) && (cur.getCount() > 0)) {
            result = true;
        }
        return result;
    }

    public static class TableKendaraan {
        public static final String TABLE_NAME_KENDARAAN = "kendaraan";
        public static final String COLUMN_IDKENDARAAN = "idKendaraan";
    }

}
