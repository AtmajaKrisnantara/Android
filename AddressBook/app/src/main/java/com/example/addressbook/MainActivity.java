package com.example.addressbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ContactsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ContactsAdapter(this, new ArrayList<Contact>());
        ListView lstResult = findViewById(R.id.lst_result);
        lstResult.setAdapter(adapter);

        ImageButton btnView = findViewById(R.id.btn_add);
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edtName = findViewById(R.id.edt_name);
                if (edtName.getText().length() == 0) {
                    Toast.makeText(MainActivity.this, "Nama masih kosong", Toast.LENGTH_SHORT).show();
                    return;
                }
                String name = edtName.getText().toString();

                EditText edtNickname= findViewById(R.id.edt_nickname);
                if (edtNickname.getText().length() == 0) {
                    Toast.makeText(MainActivity.this, "Panggilan masih kosong", Toast.LENGTH_SHORT).show();
                    return;
                }
                String nickname = edtNickname.getText().toString();

                EditText edtPhone = findViewById(R.id.edt_phone);
                if (edtPhone.getText().length() == 0) {
                    Toast.makeText(MainActivity.this, "No telephone masih kosong", Toast.LENGTH_SHORT).show();
                    return;
                }
                String phone = edtPhone.getText().toString();

                EditText edtEmail = findViewById(R.id.edt_email);
                if (edtEmail.getText().length() == 0) {
                    Toast.makeText(MainActivity.this, "Email masih kosong", Toast.LENGTH_SHORT).show();
                    return;
                }
                String email = edtEmail.getText().toString();

                EditText edtAddress = findViewById(R.id.edt_address);
                if (edtAddress.getText().length() == 0) {
                    Toast.makeText(MainActivity.this, "Asal kota masih kosong", Toast.LENGTH_SHORT).show();
                    return;
                }
                String address = edtAddress.getText().toString();

                adapter.add(new Contact(name, nickname, phone, email, address ));
            }
        });
    }
}