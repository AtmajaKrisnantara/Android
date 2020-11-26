package com.example.addressbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactsAdapter extends ArrayAdapter<Contact> {
    public ContactsAdapter(Context context, ArrayList<Contact> contacts) {
        super(context, 0, contacts);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        Contact contact = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater
                    .from(getContext())
                    .inflate(R.layout.item_contact, parent, false);
        }
        TextView  txt_name = convertView.findViewById(R.id.txt_name);
        TextView  txt_nickname = convertView.findViewById(R.id.txt_nickname);
        TextView  txt_phone = convertView.findViewById(R.id.txt_phone);
        TextView  txt_email = convertView.findViewById(R.id.txt_email);
        TextView  txt_address = convertView.findViewById(R.id.txt_address);

        txt_name.setText(contact.name);
        txt_nickname.setText(contact.nickname);
        txt_phone.setText(contact.phone);
        txt_email.setText(contact.email);
        txt_address.setText(contact.address);

        return  convertView;

    }

}
