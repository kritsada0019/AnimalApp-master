package sdu.cs58.kritsada.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText;
    Button startButton;
    String nameString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initial view
        nameEditText = findViewById(R.id.edtName);
        startButton = findViewById(R.id.btnStart);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameString = nameEditText.getText().toString().trim(); //ข้อความที่พิมพ์ในedittextมาเก็บตัวแปรในnamestring

                //เช็คค่าว่าง
                if (nameString.length() == 0) {
                    Toast.makeText(getApplicationContext(), " กรุณากรอกชื่อด้วย ", Toast.LENGTH_SHORT).show(); //Toast = เด้งขึ้นแจ้งเตือน
                } else {

                    Intent startIntent = new Intent(MainActivity.this,GameActivity.class);
                    startIntent.putExtra("Name", nameString);
                    startActivity(startIntent);
                }
            }
        });



    }//end onCreate
}//end class
