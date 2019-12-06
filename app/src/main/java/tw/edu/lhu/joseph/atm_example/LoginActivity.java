package tw.edu.lhu.joseph.atm_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etId;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etId = findViewById(R.id.etId);
        etPassword = findViewById(R.id.etPassword);
    }

    public void login(View view) {
        String id = etId.getText().toString();
        String pswd = etPassword.getText().toString();

        if ("jack".equals(id) && "1234".equals(pswd)) {
            // 成功，返回前一個 activity
            Toast.makeText(this, "Login success", Toast.LENGTH_SHORT).show();

            // 返回之前先設定 result code (for MainActivity: startActivityForResult()
            setResult(RESULT_OK);

            finish(); // 回到上一個呼叫他的 Activity
        } else {
            Toast.makeText(this, "Id or password incorrect",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void quit(View v) {
        Toast.makeText(this, "Quit clicked", Toast.LENGTH_SHORT).show();
    }
}
