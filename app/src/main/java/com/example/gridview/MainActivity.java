package com.example.gridview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Dữ liệu hiển thị trong GridView
    String arr[] = {
            "Ipad", "Iphone", "New Ipad",
            "SamSung", "Nokia", "Sony Ericson",
            "LG", "Q-Mobile", "HTC", "Blackberry",
            "G Phone", "FPT - Phone", "HK Phone"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Kết nối với XML

        // Gắn đối tượng giao diện
        final TextView selection = findViewById(R.id.selection);
        GridView gv = findViewById(R.id.gridView1);

        // Gắn dữ liệu vào GridView qua ArrayAdapter
        ArrayAdapter<String> da = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                arr
        );
        gv.setAdapter(da);

        // Bắt sự kiện khi người dùng chọn vào một item
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                selection.setText(arr[position]); // Hiển thị item được chọn
            }
        });
    }
}
