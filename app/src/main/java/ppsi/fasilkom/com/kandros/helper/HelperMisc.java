package ppsi.fasilkom.com.kandros.helper;

import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import ppsi.fasilkom.com.kandros.BuildConfig;

/**
 * Created by Ainul on 5/7/2016.
 */
public class HelperMisc {
    public static void log(String str) {
        if (BuildConfig.DEBUG) {
            Log.d("Kandros", str);
        }
    }

    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        return sdf.format(date);
    }

    public static String formatDateTime(Date dateTime) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss", Locale.getDefault());
        return sdf.format(dateTime);
    }

    public static Date parseDate(String str) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        try {
            return sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String formatNumber(int value) {
        return String.format(Locale.getDefault(), "%d", value);
    }
}
