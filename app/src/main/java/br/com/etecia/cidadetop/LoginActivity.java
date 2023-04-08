package br.com.etecia.cidadetop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText edtsenha, edtusuario;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        edtsenha = findViewById(R.id.edtsenha);
        edtusuario = findViewById(R.id.edtusuario);
        b1 = findViewById(R.id.bentrar);
        b2 = findViewById(R.id.bsair);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario, senha;
                usuario = edtusuario.getText().toString();
                senha = edtsenha.getText().toString();

                if (usuario.equals("admim") && senha.equals("4444")){
                    startActivity(new Intent(getApplicationContext(),
                            MenuPrincipalActivity.class));
                }
                else {
                    Toast.makeText(getApplicationContext(),
                            "Usuario ou senha invalido",
                            Toast.LENGTH_SHORT).show();
                    edtusuario.setText("");
                    edtsenha.setText("");
                    edtusuario.requestFocus();
                }
            }
        });
    }
}