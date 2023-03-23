package sv.edu.utec.listadopersonas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;
   List<String>Personas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=findViewById(R.id.lvPersona);
        Personas= new ArrayList<String>();
        Personas.add("Alexander Pierrot");
        Personas.add("Carlo Lopez");
        Personas.add("Sara Bonz");
        Personas.add("Liliana Clarence");
        Personas.add("Benito Peralta");
        Personas.add("Juan Jaramillo");
        Personas.add("Chistian Steps");

        ArrayAdapter<String>adaptador=new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Selecciono"+parent.getItemAtPosition(position),Toast.LENGTH_SHORT);


            }
        });


        }
    }
