package los_eternos.gogamificationquiz.Pantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import los_eternos.gogamificationquiz.R;

public class ActividadesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividades);
    }

    public void navegabilidad2(View view){

        Intent intent = new Intent(getApplicationContext(), CuestionarioActivity.class);
        startActivity(intent);

    }
}
