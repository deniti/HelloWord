package com.openlab.helloword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// conectar clase  con el layout R= resours

        final EditText edtTetyxt= (EditText)findViewById(R.id.editText);//
        Button btnMostrar = (Button)findViewById(R.id.btn_mostrar);

btnMostrar.setOnClickListener(new View.OnClickListener() { // captura el clip del botton y ejecuta este codigo al hacer clip
    @Override
    public void onClick(View v) {
      //  Toast.makeText(getBaseContext(),edtTetyxt.getText().toString(),Toast.LENGTH_SHORT ).show() ;// tres parametros que recibe
        // / toString

        Intent intent = new Intent( MainActivity.this,TestActivity.class);// para ir de una vista a otra vista
    }
});




    }
}
