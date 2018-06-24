package checkbox.cursoandroid.dell.checkbox;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity {

    private CheckBox gato;
    private CheckBox cao;
    private CheckBox papagaio;
    private TextView resultado;
    private Button mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gato = (CheckBox) findViewById(R.id.gato_id);
        cao = (CheckBox) findViewById(R.id.cao_id);
        papagaio = (CheckBox) findViewById(R.id.papagaio_id);
        resultado = (TextView) findViewById(R.id.resultado_id);
        mostrar = (Button) findViewById(R.id.botao_mostrar_id);

        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itensSelecionados = "a: ";

                itensSelecionados += "Item: " + gato.getText().toString() + " Status: " + gato.isChecked() + "\n";
                itensSelecionados += "Item: " + cao.getText().toString() + " Status: " + cao.isChecked() + "\n";
                itensSelecionados += "Item: " + papagaio.getText().toString() + " Status: " + papagaio.isChecked() + "\n";

                resultado.setText(itensSelecionados);


            }
        });
    }
}
