package professorangoti.com.prova_10092018_contador;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText visor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visor = (EditText) findViewById(R.id.visorEditText);
    }

    public void acao(View objeto) {
        int n = 0;
        switch (objeto.getId()) {
            case (R.id.somaButton):
                n = Integer.parseInt(visor.getText().toString());
                n++;
                visor.setText("" + n);
                visor.setBackgroundColor(Color.BLUE);
                break;
            case (R.id.subtraçãoButton):
                n = Integer.parseInt(visor.getText().toString());
                n--;
                visor.setText("" + n);
                visor.setBackgroundColor(Color.RED);
                break;
            case (R.id.zerarButton):
                visor.setText("0");
                visor.setBackgroundColor(Color.GREEN);
                break;
        }
    }
}
