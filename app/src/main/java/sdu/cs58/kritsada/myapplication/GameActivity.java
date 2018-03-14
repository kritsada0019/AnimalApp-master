package sdu.cs58.kritsada.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {
    //Explicit
    Button btn1,btn2,btn3, btn4;
    ImageView questionImageView;
    MediaPlayer mediaPlayer; //เล่นไฟล์เสียง
    ImageButton volumnImageButton;
    int questionCount = 10; //ตัวแปรเก็บจำนวนข้อคำถาม
    ArrayList<Integer> qID = new ArrayList<Integer>(); //ตัวแปรสุ่มคำถาม เป็นชนิดarray
    String answer;//เก็บคำตอบที่userตอบ
    int score = 0;//ค่าเริ่มต้นที่0<รวมคะแนน>

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //ผูก element บน java
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        questionImageView = findViewById(R.id.imvQuestion);
        volumnImageButton = findViewById(R.id.imbVolumn);

        //วนนับจำนวนคำถามว่าครบจำนวนข้อที่ตั้งไว้หรือยัง
        for (int i = 1; i <= questionCount; i++) {
            qID.add(i);
        }
        Collections.shuffle(qID);//กำหนดให้ random คำถาม
        setQuestion(qID.remove(0)); //remove = คำถามที่ถูกแรนด้อมแล้วจะไม่นำมาใช้อีก ไม่ให้ซ้ำ
    }//end onCreate

    private void setQuestion(Integer qID) {//ใช้สำหรับกำหนดข้อคำถามและเฉลยในแต่ละข้อ
        if (qID == 1) {
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird);
            mediaPlayer = MediaPlayer.create(this, R.raw.bird);

            ArrayList<String> choice = new ArrayList<String>();//กำหนดการrandom choice
            choice.add("นก");
            choice.add("ช้าง");
            choice.add("แมว");
            choice.add("ยุง");
            Collections.shuffle(choice);//random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 2) {
            answer = "แมว";
            questionImageView.setImageResource(R.drawable.cat);
            mediaPlayer = MediaPlayer.create(this, R.raw.cat);

            ArrayList<String> choice = new ArrayList<String>();//กำหนดการrandom choice
            choice.add("แมว");
            choice.add("ช้าง");
            choice.add("วัว");
            choice.add("หมา");
            Collections.shuffle(choice);//random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 3) {
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow);
            mediaPlayer = MediaPlayer.create(this, R.raw.cow);

            ArrayList<String> choice = new ArrayList<String>();//กำหนดการrandom choice
            choice.add("วัว");
            choice.add("ม้า");
            choice.add("แมว");
            choice.add("ยุง");
            Collections.shuffle(choice);//random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 4) {
            answer = "หมา";
            questionImageView.setImageResource(R.drawable.dog);
            mediaPlayer = MediaPlayer.create(this, R.raw.dog);

            ArrayList<String> choice = new ArrayList<String>();//กำหนดการrandom choice
            choice.add("หมา");
            choice.add("ม้า");
            choice.add("ช้าง");
            choice.add("หมู");
            Collections.shuffle(choice);//random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 5) {
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant);
            mediaPlayer = MediaPlayer.create(this, R.raw.elephant);

            ArrayList<String> choice = new ArrayList<String>();//กำหนดการrandom choice
            choice.add("ช้าง");
            choice.add("หมา");
            choice.add("แมว");
            choice.add("ยุง");
            Collections.shuffle(choice);//random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 6) {
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse);
            mediaPlayer = MediaPlayer.create(this, R.raw.horse);

            ArrayList<String> choice = new ArrayList<String>();//กำหนดการrandom choice
            choice.add("ม้า");
            choice.add("ช้าง");
            choice.add("สิงโต");
            choice.add("ยุง");
            Collections.shuffle(choice);//random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 7) {
            answer = "สิงโต";
            questionImageView.setImageResource(R.drawable.lion);
            mediaPlayer = MediaPlayer.create(this, R.raw.lion);

            ArrayList<String> choice = new ArrayList<String>();//กำหนดการrandom choice
            choice.add("สิงโต");
            choice.add("หมู");
            choice.add("แมว");
            choice.add("หมา");
            Collections.shuffle(choice);//random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 8) {
            answer = "ยุง";
            questionImageView.setImageResource(R.drawable.mosquito);
            mediaPlayer = MediaPlayer.create(this, R.raw.mosquito);

            ArrayList<String> choice = new ArrayList<String>();//กำหนดการrandom choice
            choice.add("ยุง");
            choice.add("สิงโต");
            choice.add("แมว");
            choice.add("แกะ");
            Collections.shuffle(choice);//random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 9) {
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig);
            mediaPlayer = MediaPlayer.create(this, R.raw.pig);

            ArrayList<String> choice = new ArrayList<String>();//กำหนดการrandom choice
            choice.add("หมู");
            choice.add("ช้าง");
            choice.add("แมว");
            choice.add("แกะ");
            Collections.shuffle(choice);//random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 10) {
            answer = "แกะ";
            questionImageView.setImageResource(R.drawable.sheep);
            mediaPlayer = MediaPlayer.create(this, R.raw.sheep);

            ArrayList<String> choice = new ArrayList<String>();//กำหนดการrandom choice
            choice.add("แกะ");
            choice.add("ช้าง");
            choice.add("แมว");
            choice.add("ม้า");
            Collections.shuffle(choice);//random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
    }//end setQuestion

    public void choiceAns(View view) {  //ตรวจคำตอบ
        Button button = (Button) view;
        String buttonString = button.getText().toString();
        //เอาข้อความบนปุ่มมาเก็บไว้ในตัวแปร button string ตามที่user กด
        if (buttonString.equals(answer)) {
            score++;

        }
        if (qID.isEmpty()) { //ถ้าทำครบทุกข้อ qID จะเ้ป็นค่าว่าง ใฟ้แสดงคะแนนออกมา
            dialogboxScore(); //method แสดงผลคะแนนรวม
        } else {
            setQuestion(qID.remove(0));// แสดงคำถามถัดไป

        }

    }//end choiceAns

    private void dialogboxScore() { //method แสดงคะแนน
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage("ได้คะแนน " + score + " คะแนน")
            .setCancelable(false)
            .setPositiveButton("ออกจากเกม", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish(); // ปิด activity เพื่อออกจากแอพ
                }// end onclick
            })
        .setNegativeButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }// end dialoboxScore


    public void playSound(View view) {
        mediaPlayer.start();

    }
}
