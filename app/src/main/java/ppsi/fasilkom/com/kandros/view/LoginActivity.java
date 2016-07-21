package ppsi.fasilkom.com.kandros.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.logging.Logger;

import ppsi.fasilkom.com.kandros.R;
import ppsi.fasilkom.com.kandros.helper.HelperDB;

public class LoginActivity extends AppCompatActivity {
    private EditText txtUsername, txtPassword;
    private Button btnLogin;
    private final String usernameUser = "user";
    private final String passwordUser = "user";
    private final String usernameAdmin = "admin";
    private final String passwordAdmin = "admin";
    private final String msgInvalid = "Username atau password salah.";
    private final String msgEmpty = "Username atau password tidak boleh kosong.";
    String linkApi = "localhost/kandros_server/api.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView logoKandros = (ImageView) findViewById(R.id.logoKandros);
        int image = R.mipmap.ic_launcher_kandros2;
        String description = "Kandros Logo";
        logoKandros.setImageResource(image);
        logoKandros.setContentDescription(description);
    }

    public void onViewBeranda(View view) {
        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String user = txtUsername.getText().toString();
                    String pass = txtPassword.getText().toString();

                    if ((user != null && user.length() > 0) && (pass != null && pass.length() > 0)) {
                        if (user.equals(usernameAdmin) && pass.equals(passwordAdmin)) {
                            Intent intService = new Intent(getApplicationContext(), BerandaAdminActivity.class);
                            startActivity(intService);
                        } else if (user.equals(usernameUser) && pass.equals(passwordUser)) {
                            Intent intentUser = new Intent(getApplicationContext(), BerandaActivity.class);
                            startActivity(intentUser);
                        }
                        else {
                            Toast.makeText(getApplicationContext(), msgInvalid, Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), msgEmpty, Toast.LENGTH_LONG).show();
                    }
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
